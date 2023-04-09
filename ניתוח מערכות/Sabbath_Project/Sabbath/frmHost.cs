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
using System.Data.Sql;

namespace Sabbath
{
    public partial class frmHost : Form
    {
        string connectionString = "data source = DESKTOP-GMDCSU5\\ELADPRESSSERVER; initial catalog = sabbath; user id=sa; password=1234";
        public frmHost()
        {
            InitializeComponent();
        }

        private void textBox1_TextChanged(object sender, EventArgs e)
        {

        }

        private void ShowAllCategories()
        {
            SqlConnection conn = new SqlConnection(connectionString);
            try
            {
                conn.Open();
                SqlCommand command = new SqlCommand("select name form categories", conn);
                SqlDataReader reader = command.ExecuteReader();
            }
            catch (SqlException ex)
            {
                MessageBox.Show(ex.ToString());
            }
        }

        

        private void button1_Click(object sender, EventArgs e)
        {
            string insert = @"if not exists(select * from categories where name = @name)
            begin  insert into categories(name) values(@name) end";
            try
            {
                SqlConnection conn = new SqlConnection(connectionString);
                conn.Open();
                SqlCommand command = new SqlCommand(insert, conn);
                command.Parameters.Add("@name", SqlDbType.VarChar, 20);
                command.Parameters["@name"].Value = CatTxtBox.Text;
                command.ExecuteNonQuery();
                conn.Close();
            }
            catch (SqlException ex)
            {
                MessageBox.Show(ex.ToString());
            }
        }
    }
}
