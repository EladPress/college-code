using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using System.Xml;
using System.IO;

namespace Drinks
{
    public partial class FrmDrink : Form
    {
        XmlDocument doc = new XmlDocument();
        string path = Directory.GetCurrentDirectory() + "\\drinks.xml";

        public FrmDrink()
        {
            InitializeComponent();
            dataGrid.Columns.Add("Name", "Name");
            dataGrid.Columns.Add("Sugar", "Sugar");
            dataGrid.Columns.Add("Coffee", "Coffee");
            dataGrid.Columns.Add("Cocoa", "Cocoa");
            dataGrid.Columns.Add("Milk", "Milk");
            dataGrid.Columns.Add("Price", "Price");
            
            if (File.Exists(path))
            {
                doc.Load(path);
                ShowTable();
                
            }
                
            else
            {
                XmlNode root = doc.CreateElement("drinks");
                doc.AppendChild(root);
            }
            
            
        }

        private void AddButton_Click(object sender, EventArgs e)
        {
            XmlNode root = doc.GetElementsByTagName("drinks")[0];

            XmlNode drink = doc.CreateElement("drink");
            drink.AppendChild(doc.CreateElement("Name")).InnerText = NameBox.Text;
            drink.AppendChild(doc.CreateElement("Sugar")).InnerText = SugarBox.Text;
            drink.AppendChild(doc.CreateElement("Cocoa")).InnerText = CocoaBox.Text;
            drink.AppendChild(doc.CreateElement("Coffee")).InnerText = CoffeeBox.Text;
            drink.AppendChild(doc.CreateElement("Milk")).InnerText = MilkBox.Text;
            drink.AppendChild(doc.CreateElement("Price")).InnerText = PriceBox.Text;

            root.AppendChild(drink);
            Savetable();
        }

        

        public void Savetable()
        {
            doc.Save(path);
            ShowTable();
        }

        private void ShowTable()
        {
            dataGrid.Rows.Clear();
            XmlNodeList list = doc.GetElementsByTagName("drink");
            foreach(XmlNode drink in list)
            {
                string name = "", sugar = "", cocoa = "", coffee = "", milk = "", price = "";
                foreach(XmlNode type in drink.ChildNodes)
                {
                    switch(type.Name)
                    {
                        case "Name":
                            name = type.InnerText;
                            break;
                        case "Sugar":
                            sugar = type.InnerText;
                            break;
                        case "Cocoa":
                            cocoa = type.InnerText;
                            break;
                        case "Coffee":
                            coffee = type.InnerText;
                            break;
                        case "Milk":
                            milk = type.InnerText;
                            break;
                        case "Price":
                            price = type.InnerText;
                            break;
                        default:
                            break;
                    }
                }
                dataGrid.Rows.Add(name, sugar, coffee, cocoa, milk, price);
            }
        }

        private void dataGrid_CellDoubleClick(object sender, DataGridViewCellEventArgs e)
        {
            NameBox.Enabled = false;
            NameBox.Text = dataGrid[0, e.RowIndex].Value.ToString();
            SugarBox.Text = dataGrid[1, e.RowIndex].Value.ToString();
            CoffeeBox.Text = dataGrid[2, e.RowIndex].Value.ToString();
            CocoaBox.Text = dataGrid[3, e.RowIndex].Value.ToString();
            MilkBox.Text = dataGrid[4, e.RowIndex].Value.ToString();
            PriceBox.Text = dataGrid[5, e.RowIndex].Value.ToString();
            UpdateButton.Visible = true;
            DeleteButton.Visible = true;

        }

        private void UpdateButton_Click(object sender, EventArgs e)
        {
            XmlNode drink = SearchNode(NameBox.Text);
            foreach(XmlNode type in drink.ParentNode.ChildNodes)
            {
                if(type.Name == "Name" && type.InnerText != NameBox.Text)
                {
                    MessageBox.Show("Name can't be changed! Name will stay the same.");
                    
                }
                switch(type.Name)
                {
                    case "Sugar":
                        type.InnerText = SugarBox.Text;
                        break;
                    case "Cocoa":
                        type.InnerText = CocoaBox.Text;
                        break;
                    case "Coffee":
                        type.InnerText = CoffeeBox.Text;
                        break;
                    case "Milk":
                        type.InnerText = MilkBox.Text;
                        break;
                    case "Price":
                        type.InnerText = PriceBox.Text;
                        break;
                    default:
                        break;
                }
            }
            
            Savetable();
            ClearFields();
            

        }

        public void ClearFields()
        {
            NameBox.Text = "";
            SugarBox.Text = "";
            CocoaBox.Text = "";
            CoffeeBox.Text = "";
            MilkBox.Text = "";
            PriceBox.Text = "";
            DeleteButton.Visible = false;
            UpdateButton.Visible = false;
            NameBox.Enabled = true;

        }

        private XmlNode SearchNode(string drinkName)
        {
            XmlNodeList list = doc.GetElementsByTagName("Name");
            foreach(XmlNode name in list)
            {
                if (name.InnerText == drinkName)
                    return name;
                
            }
            return null;
        }

        private void ClearButton_Click(object sender, EventArgs e)
        {
            ClearFields();
        }

        private void DeleteButton_Click(object sender, EventArgs e)
        {
            var result = MessageBox.Show("Delete " + NameBox.Text + "?", "Delete drink", MessageBoxButtons.YesNo, MessageBoxIcon.Question);
            if(result == DialogResult.Yes)
            {
                XmlNode drink = SearchNode(NameBox.Text);
                if (drink != null)
                    drink.ParentNode.ParentNode.RemoveChild(drink.ParentNode);
                ClearFields();
                Savetable();
            }
        }
    }
}
