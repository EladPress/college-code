
namespace Restaurant
{
    partial class Customer
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
            this.gridView = new System.Windows.Forms.DataGridView();
            this.categories = new System.Windows.Forms.ComboBox();
            this.OrderButton = new System.Windows.Forms.Button();
            ((System.ComponentModel.ISupportInitialize)(this.gridView)).BeginInit();
            this.SuspendLayout();
            // 
            // gridView
            // 
            this.gridView.AllowUserToResizeColumns = false;
            this.gridView.AllowUserToResizeRows = false;
            this.gridView.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.gridView.Location = new System.Drawing.Point(0, 0);
            this.gridView.Name = "gridView";
            this.gridView.ReadOnly = true;
            this.gridView.Size = new System.Drawing.Size(344, 221);
            this.gridView.TabIndex = 0;
            this.gridView.CellDoubleClick += new System.Windows.Forms.DataGridViewCellEventHandler(this.gridView_CellDoubleClick);
            // 
            // categories
            // 
            this.categories.DropDownStyle = System.Windows.Forms.ComboBoxStyle.Simple;
            this.categories.FormattingEnabled = true;
            this.categories.Items.AddRange(new object[] {
            "All",
            "Fish",
            "Meat",
            "Vegetarian",
            "Vegan",
            "Italian"});
            this.categories.Location = new System.Drawing.Point(368, 12);
            this.categories.Name = "categories";
            this.categories.Size = new System.Drawing.Size(121, 111);
            this.categories.TabIndex = 1;
            this.categories.SelectedIndexChanged += new System.EventHandler(this.categories_SelectedIndexChanged);
            // 
            // OrderButton
            // 
            this.OrderButton.Location = new System.Drawing.Point(12, 245);
            this.OrderButton.Name = "OrderButton";
            this.OrderButton.Size = new System.Drawing.Size(238, 23);
            this.OrderButton.TabIndex = 2;
            this.OrderButton.Text = "order";
            this.OrderButton.UseVisualStyleBackColor = true;
            this.OrderButton.Click += new System.EventHandler(this.OrderButton_Click);
            // 
            // Customer
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(800, 450);
            this.Controls.Add(this.OrderButton);
            this.Controls.Add(this.categories);
            this.Controls.Add(this.gridView);
            this.Name = "Customer";
            this.Text = "Customer";
            ((System.ComponentModel.ISupportInitialize)(this.gridView)).EndInit();
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.DataGridView gridView;
        private System.Windows.Forms.ComboBox categories;
        private System.Windows.Forms.Button OrderButton;
    }
}