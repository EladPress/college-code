
namespace Drinks
{
    partial class FrmDrink
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.NameBox = new System.Windows.Forms.TextBox();
            this.label1 = new System.Windows.Forms.Label();
            this.SugarBox = new System.Windows.Forms.ComboBox();
            this.CoffeeBox = new System.Windows.Forms.ComboBox();
            this.CocoaBox = new System.Windows.Forms.ComboBox();
            this.MilkBox = new System.Windows.Forms.ComboBox();
            this.PriceBox = new System.Windows.Forms.NumericUpDown();
            this.label2 = new System.Windows.Forms.Label();
            this.label3 = new System.Windows.Forms.Label();
            this.label4 = new System.Windows.Forms.Label();
            this.label5 = new System.Windows.Forms.Label();
            this.label6 = new System.Windows.Forms.Label();
            this.AddButton = new System.Windows.Forms.Button();
            this.dataGrid = new System.Windows.Forms.DataGridView();
            this.UpdateButton = new System.Windows.Forms.Button();
            this.ClearButton = new System.Windows.Forms.Button();
            this.DeleteButton = new System.Windows.Forms.Button();
            ((System.ComponentModel.ISupportInitialize)(this.PriceBox)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.dataGrid)).BeginInit();
            this.SuspendLayout();
            // 
            // NameBox
            // 
            this.NameBox.Location = new System.Drawing.Point(139, 44);
            this.NameBox.Name = "NameBox";
            this.NameBox.Size = new System.Drawing.Size(100, 20);
            this.NameBox.TabIndex = 0;
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Location = new System.Drawing.Point(34, 47);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(99, 13);
            this.label1.TabIndex = 1;
            this.label1.Text = "Name of new drink:";
            // 
            // SugarBox
            // 
            this.SugarBox.FormattingEnabled = true;
            this.SugarBox.Items.AddRange(new object[] {
            "0",
            "0.5",
            "1.0",
            "1.5",
            "2.0",
            "2.5",
            "3.0"});
            this.SugarBox.Location = new System.Drawing.Point(83, 151);
            this.SugarBox.Name = "SugarBox";
            this.SugarBox.Size = new System.Drawing.Size(80, 21);
            this.SugarBox.TabIndex = 4;
            // 
            // CoffeeBox
            // 
            this.CoffeeBox.FormattingEnabled = true;
            this.CoffeeBox.Items.AddRange(new object[] {
            "0",
            "0.5",
            "1.0",
            "1.5",
            "2.0",
            "2.5",
            "3.0"});
            this.CoffeeBox.Location = new System.Drawing.Point(204, 151);
            this.CoffeeBox.Name = "CoffeeBox";
            this.CoffeeBox.Size = new System.Drawing.Size(80, 21);
            this.CoffeeBox.TabIndex = 5;
            // 
            // CocoaBox
            // 
            this.CocoaBox.FormattingEnabled = true;
            this.CocoaBox.Items.AddRange(new object[] {
            "0",
            "0.5",
            "1.0",
            "1.5",
            "2.0",
            "2.5",
            "3.0"});
            this.CocoaBox.Location = new System.Drawing.Point(325, 151);
            this.CocoaBox.Name = "CocoaBox";
            this.CocoaBox.Size = new System.Drawing.Size(80, 21);
            this.CocoaBox.TabIndex = 6;
            // 
            // MilkBox
            // 
            this.MilkBox.FormattingEnabled = true;
            this.MilkBox.Items.AddRange(new object[] {
            "0",
            "0.5",
            "1.0",
            "1.5",
            "2.0",
            "2.5",
            "3.0"});
            this.MilkBox.Location = new System.Drawing.Point(450, 151);
            this.MilkBox.Name = "MilkBox";
            this.MilkBox.Size = new System.Drawing.Size(80, 21);
            this.MilkBox.TabIndex = 7;
            // 
            // PriceBox
            // 
            this.PriceBox.DecimalPlaces = 1;
            this.PriceBox.Increment = new decimal(new int[] {
            5,
            0,
            0,
            65536});
            this.PriceBox.Location = new System.Drawing.Point(589, 151);
            this.PriceBox.Name = "PriceBox";
            this.PriceBox.Size = new System.Drawing.Size(64, 20);
            this.PriceBox.TabIndex = 8;
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Location = new System.Drawing.Point(80, 135);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(35, 13);
            this.label2.TabIndex = 9;
            this.label2.Text = "Sugar";
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Location = new System.Drawing.Point(201, 135);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(38, 13);
            this.label3.TabIndex = 10;
            this.label3.Text = "Coffee";
            // 
            // label4
            // 
            this.label4.AutoSize = true;
            this.label4.Location = new System.Drawing.Point(322, 135);
            this.label4.Name = "label4";
            this.label4.Size = new System.Drawing.Size(38, 13);
            this.label4.TabIndex = 11;
            this.label4.Text = "Cocoa";
            // 
            // label5
            // 
            this.label5.AutoSize = true;
            this.label5.Location = new System.Drawing.Point(447, 135);
            this.label5.Name = "label5";
            this.label5.Size = new System.Drawing.Size(26, 13);
            this.label5.TabIndex = 12;
            this.label5.Text = "Milk";
            // 
            // label6
            // 
            this.label6.AutoSize = true;
            this.label6.Location = new System.Drawing.Point(586, 135);
            this.label6.Name = "label6";
            this.label6.Size = new System.Drawing.Size(31, 13);
            this.label6.TabIndex = 13;
            this.label6.Text = "Price";
            // 
            // AddButton
            // 
            this.AddButton.Location = new System.Drawing.Point(621, 97);
            this.AddButton.Name = "AddButton";
            this.AddButton.Size = new System.Drawing.Size(75, 23);
            this.AddButton.TabIndex = 14;
            this.AddButton.Text = "Add drink";
            this.AddButton.UseVisualStyleBackColor = true;
            this.AddButton.Click += new System.EventHandler(this.AddButton_Click);
            // 
            // dataGrid
            // 
            this.dataGrid.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.dataGrid.Location = new System.Drawing.Point(74, 263);
            this.dataGrid.Name = "dataGrid";
            this.dataGrid.Size = new System.Drawing.Size(644, 150);
            this.dataGrid.TabIndex = 16;
            this.dataGrid.CellDoubleClick += new System.Windows.Forms.DataGridViewCellEventHandler(this.dataGrid_CellDoubleClick);
            // 
            // UpdateButton
            // 
            this.UpdateButton.Location = new System.Drawing.Point(450, 97);
            this.UpdateButton.Name = "UpdateButton";
            this.UpdateButton.Size = new System.Drawing.Size(87, 23);
            this.UpdateButton.TabIndex = 17;
            this.UpdateButton.Text = "Update Drink";
            this.UpdateButton.UseVisualStyleBackColor = true;
            this.UpdateButton.Visible = false;
            this.UpdateButton.Click += new System.EventHandler(this.UpdateButton_Click);
            // 
            // ClearButton
            // 
            this.ClearButton.Location = new System.Drawing.Point(543, 97);
            this.ClearButton.Name = "ClearButton";
            this.ClearButton.Size = new System.Drawing.Size(75, 23);
            this.ClearButton.TabIndex = 18;
            this.ClearButton.Text = "Clear fields";
            this.ClearButton.UseVisualStyleBackColor = true;
            this.ClearButton.Click += new System.EventHandler(this.ClearButton_Click);
            // 
            // DeleteButton
            // 
            this.DeleteButton.Location = new System.Drawing.Point(369, 97);
            this.DeleteButton.Name = "DeleteButton";
            this.DeleteButton.Size = new System.Drawing.Size(75, 23);
            this.DeleteButton.TabIndex = 19;
            this.DeleteButton.Text = "Delete drink";
            this.DeleteButton.UseVisualStyleBackColor = true;
            this.DeleteButton.Click += new System.EventHandler(this.DeleteButton_Click);
            // 
            // FrmDrink
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(800, 450);
            this.Controls.Add(this.DeleteButton);
            this.Controls.Add(this.ClearButton);
            this.Controls.Add(this.UpdateButton);
            this.Controls.Add(this.dataGrid);
            this.Controls.Add(this.AddButton);
            this.Controls.Add(this.label6);
            this.Controls.Add(this.label5);
            this.Controls.Add(this.label4);
            this.Controls.Add(this.label3);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.PriceBox);
            this.Controls.Add(this.MilkBox);
            this.Controls.Add(this.CocoaBox);
            this.Controls.Add(this.CoffeeBox);
            this.Controls.Add(this.SugarBox);
            this.Controls.Add(this.label1);
            this.Controls.Add(this.NameBox);
            this.Name = "FrmDrink";
            this.Text = "Form1";
            ((System.ComponentModel.ISupportInitialize)(this.PriceBox)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.dataGrid)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.TextBox NameBox;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.ComboBox SugarBox;
        private System.Windows.Forms.ComboBox CoffeeBox;
        private System.Windows.Forms.ComboBox CocoaBox;
        private System.Windows.Forms.ComboBox MilkBox;
        private System.Windows.Forms.NumericUpDown PriceBox;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.Label label4;
        private System.Windows.Forms.Label label5;
        private System.Windows.Forms.Label label6;
        private System.Windows.Forms.Button AddButton;
        private System.Windows.Forms.DataGridView dataGrid;
        private System.Windows.Forms.Button UpdateButton;
        private System.Windows.Forms.Button ClearButton;
        private System.Windows.Forms.Button DeleteButton;
    }
}

