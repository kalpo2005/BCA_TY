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
    SqlConnection conn = new SqlConnection(@"Data Source=.\SQLEXPRESS;AttachDbFilename=D:\KALPESH_BAVALIYA\SEM_6\ASP\assignment4\App_Data\assign4.mdf;Integrated Security=True;User Instance=True");
    protected void Page_Load(object sender, EventArgs e)
    {
        Label3.Visible = false;
    }
    protected void Button1_Click(object sender, EventArgs e)
    {
        string sql = "INSERT INTO student_assign1(name,email) VALUES(@name,@email)";

        SqlCommand cmd = new SqlCommand(sql,conn);
        cmd.Parameters.AddWithValue("@name",TextBox1.Text);
        cmd.Parameters.AddWithValue("@email", TextBox2.Text);

        conn.Open();

        if (cmd.ExecuteNonQuery() > 0)
        {
            Label3.Text = "Data Successfully Inserted !!!!";
            Label3.ForeColor = System.Drawing.Color.Green;
        }
        else
        {
            Label3.Text = "Data Doesn't Inserted !!!!";
            Label3.ForeColor = System.Drawing.Color.Red;
        }
        Label3.Visible = true;
        conn.Close();

    }
    protected void Button4_Click(object sender, EventArgs e)
    {
        string select = "SELECT * FROM student_assign1";

        GridView1.Visible = true;
        SqlDataAdapter da = new SqlDataAdapter(select, conn);

        DataTable table = new DataTable();
        da.Fill(table);
        GridView1.DataSource = table;
        GridView1.DataBind();

    }
}
