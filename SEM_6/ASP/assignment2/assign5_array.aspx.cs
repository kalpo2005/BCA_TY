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

public partial class assign5_array : System.Web.UI.Page
{
    protected void Page_Load(object sender, EventArgs e)
    {

    }
    protected void Button1_Click(object sender, EventArgs e)
    {
        string name = TextBox1.Text;
        int sum = 0;

        string[] kal = name.Split(',');

        for (int i = 0; i < kal.Length; i++) {
            sum += int.Parse(kal[i]);
            }

        Label2.Text = sum.ToString();
    }
    protected void TextBox1_TextChanged(object sender, EventArgs e)
    {

    }
}
