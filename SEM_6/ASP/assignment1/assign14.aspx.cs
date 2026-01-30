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

public partial class assign14 : System.Web.UI.Page
{
    protected void Page_Load(object sender, EventArgs e)
    {

    }
    protected void Button1_Click(object sender, EventArgs e)
    {
        int number = int.Parse(TextBox1.Text);
        int palindrome = number;
        int modulo, reverse=0;

        while (number > 0) {
            modulo = number % 10;
            reverse = (reverse * 10) + modulo;
            number /= 10;
        }

        if (palindrome == reverse)
            Label2.Text = "Yes, " + palindrome + " Number is Palindrome ";
        else
            Label2.Text = "No, " + palindrome + " Number is Palindrome ";
    }
}
