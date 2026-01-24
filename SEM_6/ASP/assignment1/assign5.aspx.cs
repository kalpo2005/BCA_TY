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

public partial class assign5 : System.Web.UI.Page
{
    protected void Page_Load(object sender, EventArgs e)
    {

    }
    protected void CheckBox1_CheckedChanged(object sender, EventArgs e)
    {

    }
    protected void Button1_Click(object sender, EventArgs e)
    {
        String selectedCheck = " select checkbox is a : ";
        bool isCheck = false;
        if (CheckBox1.Checked)
        {
            selectedCheck += CheckBox1.Text;
            isCheck = true;
        }

        if (CheckBox2.Checked)
        {
            selectedCheck += " ," +  CheckBox2.Text;
            isCheck = true;
        }

        if (CheckBox3.Checked)
        {

            selectedCheck += " ," + CheckBox3.Text;
            isCheck = true;
        }

        if(!isCheck)
            Label3.Text = " No any value checked ";
        else
        Label3.Text = selectedCheck;
    }
}
