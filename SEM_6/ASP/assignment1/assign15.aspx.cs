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

public partial class assign15 : System.Web.UI.Page
{
    protected void Page_Load(object sender, EventArgs e)
    {

    }
    protected void Button1_Click(object sender, EventArgs e)
    {
        int number = int.Parse(TextBox1.Text);
        int armsrong = number;
        int modulo;
        double sum = 0;
        int lenght = TextBox1.Text.Length;

        while (number > 0)
        {
            modulo = number % 10;
            sum += Math.Pow(modulo, lenght);
            number /= 10;
        }

        if (armsrong == sum)
            Label2.Text = "Yes, " + armsrong + " Number is Armsrong ";
        else
            Label2.Text = "No, " + armsrong + " Number is Armsrong ";
    }
}
