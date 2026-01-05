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

public partial class carcheckbox : System.Web.UI.Page
{
    protected void Page_Load(object sender, EventArgs e)
    {

    }
    protected void CheckBox1_CheckedChanged(object sender, EventArgs e)
    {

    }
    protected void Button1_Click(object sender, EventArgs e)
    {
        String value = " No Option Selected ";

        if (CheckBox1.Checked)
        {
            value = CheckBox1.Text;

        }

        if (CheckBox2.Checked)
        {
            value += "  " + CheckBox2.Text;

        }

        if (CheckBox3.Checked)
        {
            value += "  " + CheckBox3.Text;

        }

        Label1.Text = value;
    }
}
