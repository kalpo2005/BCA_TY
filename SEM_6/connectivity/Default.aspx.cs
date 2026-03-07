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

using System.Data.SqlClient;  // For he Database Librrary import

public partial class _Default : System.Web.UI.Page 
{
    SqlConnection conn = new SqlConnection(@"Data Source=.\SQLEXPRESS;AttachDbFilename=D:\KALPESH_BAVALIYA\SEM_6\connectivity\App_Data\kalpesh.mdf;Integrated Security=True;User Instance=True");
    protected void Page_Load(object sender, EventArgs e)
    {
        Label3.Visible = false;
    }
    protected void Button1_Click(object sender, EventArgs e)
    {
        string sql = "INSERT INTO studenttest(name,city) VALUES(@name,@city)";

        SqlCommand cmd = new SqlCommand(sql,conn);
        cmd.Parameters.AddWithValue("@name", TextBox1.Text);
        cmd.Parameters.AddWithValue("@city", TextBox2.Text);

        conn.Open();

        if(cmd.ExecuteNonQuery() > 0)
              Label3.Visible = true;

        
        conn.Close();
    }
}
