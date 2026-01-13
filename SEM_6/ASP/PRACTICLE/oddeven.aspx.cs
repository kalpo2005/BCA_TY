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

public partial class oddeven : System.Web.UI.Page
{
    protected void Page_Load(object sender, EventArgs e)
    {

    }
    protected void Button1_Click(object sender, EventArgs e)
    {
        int num = int.Parse(TextBox1.Text);
        Label2.Text = " ";
        if (num % 2 == 0)
            Label2.Text += " Number is : Even";
        else
            Label2.Text += " Number Is : Odd";
    }
}
