using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using System.Data.Sql;
using System.Data.SqlClient;

namespace Kitchen
{
    public partial class Kitchen : Form
    {
        string orderChoice;
        string connStr = "data source=DESKTOP-GMDCSU5\\ELADPRESSSERVER; initial catalog=Restaurant; user id=sa; password=1234";
        public Kitchen()
        {
            InitializeComponent();
            ShowTable();
        }
        public void ShowTable()
        {
            SqlConnection conn = new SqlConnection(connStr);
            string query = "select orders.ID as orderID, menu.name from orders inner join menu on menuID = menu.ID";
            SqlDataAdapter ad = new SqlDataAdapter(query, connStr);
            DataTable data = new DataTable();
            ad.Fill(data);
            gridView.DataSource = data;
        }

        private void RefreshButton_Click(object sender, EventArgs e)
        {
            ShowTable();
        }

        private void gridView_CellContentDoubleClick(object sender, DataGridViewCellEventArgs e)
        {
            //MessageBox.Show(gridView[0, e.RowIndex].Value.ToString());
            orderChoice = gridView[0, e.RowIndex].Value.ToString();
            DeleteButton.Text = "delete order number " + orderChoice;
            DeleteButton.Visible = true;
            //DeleteOrder(orderChoice);
            //ShowTable();
        }

        public void DeleteOrder(string orderID)
        {
            SqlConnection conn = new SqlConnection(connStr);
            string query = "delete from orders where ID = " + orderID;
            SqlCommand comm = new SqlCommand(query, conn);
            conn.Open();
            comm.ExecuteNonQuery();
            conn.Close();
        }

        private void DeleteButton_Click(object sender, EventArgs e)
        {
            DeleteOrder(orderChoice);
            ShowTable();
            DeleteButton.Visible = false;
        }
    }
}
