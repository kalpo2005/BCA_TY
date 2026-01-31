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

public partial class assign4 : System.Web.UI.Page
{
    protected void Page_Load(object sender, EventArgs e)
    {

    }
    protected void Button1_Click(object sender, EventArgs e)
    {
        string name = TextBox1.Text;
        string duplicate = "";

        string[] kal = name.Split(',');

        for (int i = 0; i < kal.Length; i++) {

            for (int j = i+1; j < kal.Length; j++)
            {
                if (kal[i] == kal[j])
                {
                    duplicate += " Duplicate name : " + kal[j] + " <br>";
                    break;
                }
            }

            Label2.Text = duplicate;

        }
    }
    protected void TextBox1_TextChanged(object sender, EventArgs e)
    {

    }
}
