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
        GridView1.Visible = false;
    }
    protected void Button1_Click(object sender, EventArgs e)
    {
        string sql = "INSERT INTO studenttest(name,city,gender,course) VALUES(@name,@city,@gender,@course)";

        string gender = "";
        string course = "";

        if (RadioButton1.Checked)
            gender = RadioButton1.Text;

        if (RadioButton2.Checked)
            gender = RadioButton1.Text;

        if (CheckBox1.Checked)
            course = CheckBox1.Text + ", ";

        if (CheckBox2.Checked)
            course += CheckBox2.Text + ", ";

        if (CheckBox3.Checked)
            course += CheckBox3.Text;

        SqlCommand cmd = new SqlCommand(sql,conn);
        cmd.Parameters.AddWithValue("@name", TextBox1.Text);
        cmd.Parameters.AddWithValue("@city", TextBox2.Text);
        cmd.Parameters.AddWithValue("@gender", gender);
        cmd.Parameters.AddWithValue("@course", course);

        conn.Open();

        if(cmd.ExecuteNonQuery() > 0)
              Label3.Visible = true;

        
        conn.Close();
    }
    protected void Button4_Click(object sender, EventArgs e)
    {

        string select = "SELECT * FROM studenttest";

        GridView1.Visible = true;
        SqlDataAdapter da = new SqlDataAdapter(select,conn);

        DataTable table = new DataTable();
        da.Fill(table);
        GridView1.DataSource = table;
        GridView1.DataBind();
    }
    protected void Button3_Click(object sender, EventArgs e)
    {
        int id = int.Parse(TextBox3.Text);
        
    }
}
