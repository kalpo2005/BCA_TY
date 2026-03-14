using System;
using System.Collections;
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

public partial class gridviewbuidin : System.Web.UI.Page
{
    SqlConnection conn = new SqlConnection(@"Data Source=.\SQLEXPRESS;AttachDbFilename=D:\KALPESH_BAVALIYA\SEM_6\ASP\connectivity\App_Data\kalpesh.mdf;Integrated Security=True;User Instance=True");
    protected void Page_Load(object sender, EventArgs e)
    {
        Label4.Visible = false;
    }
    protected void Button1_Click(object sender, EventArgs e)
    {
        string name = TextBox2.Text;
        string city = TextBox3.Text;

        string insert = "Insert into users(name,city) VALUES(@name,@city)";

        SqlCommand cmd = new SqlCommand(insert,conn);
        cmd.Parameters.AddWithValue("@name", name);
        cmd.Parameters.AddWithValue("@city", city);

        conn.Open();
        if (cmd.ExecuteNonQuery() > 0)
        {
            Label4.Text = "Data Inserted successfully ";
            Label4.ForeColor = System.Drawing.Color.Green;
        }
        else
        {
            Label4.Text = "Data Inserted Failed ";
            Label4.ForeColor = System.Drawing.Color.Red;
        }
        Label4.Visible = true;

        conn.Close();
    }
}
