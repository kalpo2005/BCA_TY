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

public partial class radiobuton : System.Web.UI.Page
{
    protected void Page_Load(object sender, EventArgs e)
    {
        Label2.Text = Male.Text + " is Selected !!! ";
    }
    protected void Male_CheckedChanged(object sender, EventArgs e)
    {
        Label2.Text = "Male is selected !!!";       
    }

    protected void RadioButton2_CheckedChanged(object sender, EventArgs e)
    {
        Label2.Text = "Female is selected !!!";
    }
    protected void RadioButton3_CheckedChanged(object sender, EventArgs e)
    {
        Label2.Text = "Third Gender is selected !!!";
    }
    protected void Button1_Click(object sender, EventArgs e)
    {

    }
}
