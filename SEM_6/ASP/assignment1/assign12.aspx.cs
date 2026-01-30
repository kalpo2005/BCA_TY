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

public partial class assign12 : System.Web.UI.Page
{
    protected void Page_Load(object sender, EventArgs e)
    {

    }
    protected void Button1_Click(object sender, EventArgs e)
    {
        float price = float.Parse(TextBox1.Text);
        float rate = float.Parse(TextBox2.Text);
        float year = float.Parse(TextBox3.Text);

        Label4.Text = "Simple interest is : " + (price * rate * year / 100);
    }
}
