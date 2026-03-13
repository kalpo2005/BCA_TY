using System;
using System.Configuration;
using System.Data;
using System.Linq;
using System.Web;
using System.Web.Security;
using System.Web.UI;
using System.Web.UI.HtmlControls;
using System.Web.UI.WebControls;
using System.Web.UI.WebControls.WebParts;
using System.Xml.Linq;
using System.Data.SqlClient;

public partial class _Default : System.Web.UI.Page 
{
    SqlConnection conn = new SqlConnection(@"Data Source=.\SQLEXPRESS;AttachDbFilename=D:\KALPESH_BAVALIYA\SEM_6\ASP\DataList\App_Data\companydata.mdf;Integrated Security=True;User Instance=True");
    protected void Page_Load(object sender, EventArgs e)
    {
        Label6.Visible = false;
    }
    protected void Button1_Click(object sender, EventArgs e)
    {
        string insert = "INSERT INTO employee(name,salary,age,department) VALUES(@name,@salary,@age,@department)";

        SqlCommand cmd = new SqlCommand(insert,conn);

        cmd.Parameters.AddWithValue("@name",TextBox2.Text);
        cmd.Parameters.AddWithValue("@salary", int.Parse(TextBox3.Text));
        cmd.Parameters.AddWithValue("@age", int.Parse(TextBox4.Text));
        cmd.Parameters.AddWithValue("@department", TextBox5.Text);

        conn.Open();

        if (cmd.ExecuteNonQuery() > 0)
        {
            Label6.Text = "Data Successfully Inserted !!!!";
            Label6.ForeColor = System.Drawing.Color.Green;
        }
        else
        {
            Label6.Text = "Data Doesn't Inserted !!!!";
            Label6.ForeColor = System.Drawing.Color.Red;
        }
        Label6.Visible = true;
        conn.Close();
    }
   
    protected void Button2_Click1(object sender, EventArgs e)
    {
        string select = "SELECT * FROM employee";

        SqlDataAdapter da = new SqlDataAdapter(select, conn);
        DataTable table = new DataTable();
        da.Fill(table);
        DataList1.DataSource = table;
        DataList1.DataBind();
    }
    protected void Button3_Click(object sender, EventArgs e)
    {
        string select = "SELECT TOP 1 * FROM employee ORDER BY salary DESC";

        SqlDataAdapter da = new SqlDataAdapter(select, conn); 
        DataTable table = new DataTable();
        da.Fill(table);
        DataList1.DataSource = table;
        DataList1.DataBind();

    }
    protected void Button4_Click(object sender, EventArgs e)
    {
        string select = "SELECT TOP 3 * FROM employee ORDER BY salary DESC";

        SqlDataAdapter da = new SqlDataAdapter(select, conn);
        DataTable table = new DataTable();
        da.Fill(table);
        DataList1.DataSource = table;
        DataList1.DataBind();
    }
    protected void Button6_Click(object sender, EventArgs e)
    {
        string update = "DELETE FROM employee WHERE id = @id";

       SqlCommand cmd = new SqlCommand(update,conn);
    
       cmd.Parameters.AddWithValue("@id", int.Parse(TextBox1.Text));

       conn.Open();

       if (cmd.ExecuteNonQuery() > 0)
       {
           Label6.Text = "Data Successfully Deleted !!!!";
           Label6.ForeColor = System.Drawing.Color.Green;
       }
       else
       {
           Label6.Text = "Data Doesn't Deleted !!!!";
           Label6.ForeColor = System.Drawing.Color.Red;
       }
       Label6.Visible = true;

       conn.Close();

    }
    protected void Button5_Click(object sender, EventArgs e)
    {
        string update = "UPDATE employee SET name = @name, salary = @salary, age = @age,department = @department WHERE id= @id";

        SqlCommand cmd = new SqlCommand(update, conn);

        cmd.Parameters.AddWithValue("@name", TextBox2.Text);
        cmd.Parameters.AddWithValue("@salary", int.Parse(TextBox3.Text));
        cmd.Parameters.AddWithValue("@age", int.Parse(TextBox4.Text));
        cmd.Parameters.AddWithValue("@department", TextBox5.Text);
        cmd.Parameters.AddWithValue("@id", int.Parse(TextBox1.Text));

        conn.Open();

        if (cmd.ExecuteNonQuery() > 0)
        {
            Label6.Text = "Data Successfully Updated !!!!";
            Label6.ForeColor = System.Drawing.Color.Green;
        }
        else
        {
            Label6.Text = "Data Doesn't Updated !!!!";
            Label6.ForeColor = System.Drawing.Color.Red;
        }
        Label6.Visible = true;

        conn.Close();
    }
}
