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

public partial class assign13 : System.Web.UI.Page
{
    protected void Page_Load(object sender, EventArgs e)
    {

    }
    protected void Button1_Click(object sender, EventArgs e)
    {
        int number = int.Parse(TextBox1.Text);
        string table = "";

        Label2.Text = "Table of " + number;


        for (int i = 1; i <= 10; i++)
        {
            table += number + " * " + i + " = " + number * i + "<br/>";
        }

        Label3.Text = table;
    }
}
