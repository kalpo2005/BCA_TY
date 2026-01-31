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

public partial class assign3_uppertriangle : System.Web.UI.Page
{
    protected void Page_Load(object sender, EventArgs e)
    {

    }
    protected void Button1_Click(object sender, EventArgs e)
    {
        if (String.IsNullOrEmpty(TextBox1.Text))
        {
            Label2.Text = "No any number inputed !!!";
            return;
        }

        int row = int.Parse(TextBox1.Text);
        string pattern = "";
        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < i; j++)
            {
                pattern += " * ";
            }
            pattern += "<br/>";
        }

        Label2.Text = "Design is below :";
        Label3.Text = pattern;
    }
}
