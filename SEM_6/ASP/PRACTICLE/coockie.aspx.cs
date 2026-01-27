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

public partial class coockie : System.Web.UI.Page
{
    protected void Page_Load(object sender, EventArgs e)
    {

    }
    protected void Button1_Click(object sender, EventArgs e)
    {
        String name = TextBox1.Text;

        Response.Cookies["username"].Value = TextBox1.Text;
        Response.Cookies["username"].Expires = DateTime.Now.AddHours(5);

        Label2.Text = "Cookies set successfully ";
    }
    protected void Button2_Click(object sender, EventArgs e)
    {
        if (Request.Cookies["username"] != null)
            Label2.Text = "Your Username is  " + Request.Cookies["username"].Value;
        else
            Label2.Text = "cockies not set ";
    }
    protected void Button3_Click(object sender, EventArgs e)
    {
        Response.Cookies["username"].Expires = DateTime.Now.AddSeconds(1);
        Label2.Text = "cockies Desroyed !!! ";
    }
}
