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

public partial class addition : System.Web.UI.Page
{
    protected void Page_Load(object sender, EventArgs e)
    {

    }
    protected void Button1_Click(object sender, EventArgs e)
    {
        int num1 = int.Parse(TextBox1.Text);
        int num = int.Parse(TextBox2.Text);
        int sum = num1 + num;
        Label3.Text += " " + sum;

    }
    protected void TextBox1_TextChanged(object sender, EventArgs e)
    {

    }
}
