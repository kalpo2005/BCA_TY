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

public partial class assign7 : System.Web.UI.Page
{
    protected void Page_Load(object sender, EventArgs e)
    {

    }
    protected void Button1_Click(object sender, EventArgs e)
    {
        String course = "Your course is : ";
        Boolean isCheck = false;

        if (RadioButton1.Checked)
        {
            course += RadioButton1.Text;
            isCheck = true;
        }

        if (RadioButton2.Checked)
        {
            course += RadioButton2.Text;
            isCheck = true;
        }

        if (RadioButton3.Checked)
        {
            course += RadioButton3.Text;
            isCheck = true;
        }

        if (RadioButton4.Checked)
        {
            course += RadioButton4.Text;
            isCheck = true;
        }

        if (!isCheck)
        {
            course = "No any course selected";
        }

        Label2.Text = course;

    }
}
