using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using System.Data.SqlClient;

namespace TimeClock
{
    public partial class Form1 : Form
    {
        string connectionString = "data source=DESKTOP-GMDCSU5\\ELADPRESSSERVER; initial catalog=time_clock; user id=sa; password=1234";
        public Form1()
        {
            InitializeComponent();
        }

        

        

        private void SendIDAndPasswordToDB()
        {
            string insertTime = @"declare @worker_code int, @answer varchar(100)
            select @worker_code = (select code from workers where id = @id)
            if @worker_code is null  begin select @answer = ' userName or password incorrect'  end
            else begin if not exists( select code from passwords where worker_code = @worker_code and password = @password and is_valid = 1)
            begin select @answer = 'userName or password incorrect' end  else  begin
            if not exists(select code from passwords where worker_code = @worker_code and password = @password and is_valid = 1 and expire_date > GETDATE())
            begin select @answer = 'password expired, replace password'  end  else begin
            if not exists(select code from times where worker_code = @worker_code and exit_time is null) 
            begin insert into times values(@worker_code, GETDATE(), null) select @answer = ' entrance time ' + convert(varchar(20), getdate(), 103) + ' ' + convert(varchar(20), getdate(), 108)
            end else begin update times set exit_time = GETDATE() where worker_code = @worker_code and exit_time is null
            select @answer = ' exit time ' + convert(varchar(20), getdate(), 103) +' ' + convert(varchar(20), getdate(), 108)
            end end end end select @answer";
            SqlConnection connection = new SqlConnection(connectionString);
            if(ConnectionToSql(connection))//מחזיר האם הצליח להתחבר
            {
                SqlCommand command = new SqlCommand();
                command.Connection = connection;
                command.Parameters.Add("@id", SqlDbType.VarChar, 20);
                command.Parameters["@id"].Value = IDTB.Text;
                command.Parameters.Add("@password", SqlDbType.VarChar, 20);
                command.Parameters["@password"].Value = PWTB.Text;
                command.CommandText = insertTime;
                MessageBox.Show(command.ExecuteScalar().ToString());
            }

        }
        private void SendDetailsToDB()//Send ID and password to DB
        {
            //string insertTime = "";
            SqlConnection connection = new SqlConnection(connectionString);
            if(ConnectionToSql(connection))
            {
                SqlCommand command = new SqlCommand();
                command.Connection = connection;
                command.Parameters.Add("@id", SqlDbType.VarChar, 20);
                command.Parameters["@id"].Value = IDTB.Text;
                command.Parameters.Add("@password", SqlDbType.VarChar, 20);
                command.Parameters["@password"].Value = PWTB.Text;

            }
        }

        private bool ConnectionToSql(SqlConnection connection)//connect to DB
        {
            try//Attempt connection
            {
                connection.Open();
                return true;
            }
            catch(SqlException ex)
            {
                MessageBox.Show(ex.ToString(), "החיבור נכשל");
                return false;
            }
        }

        private void button1_Click(object sender, EventArgs e)
        {
            SqlConnection connection = new SqlConnection(connectionString);
            ConnectionToSql(connection);
        }

        private void PWTB_KeyPress(object sender, KeyPressEventArgs e)
        {
            if (e.KeyChar == (char)13)
            {
                SendIDAndPasswordToDB();
            }
        }
    }
}
