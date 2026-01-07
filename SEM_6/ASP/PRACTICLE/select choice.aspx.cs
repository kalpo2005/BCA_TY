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

public partial class select_choice : System.Web.UI.Page
{
    protected void Page_Load(object sender, EventArgs e)
    {

    }
    protected void Button1_Click(object sender, EventArgs e)
    {
        String value1 = " Your selected Option is : " + DropDownList1.SelectedItem.Text;
        String value2 = " Your selected index is : " + DropDownList1.SelectedIndex.ToString();
        String value3 = " Your selected value is : " + DropDownList1.SelectedValue;
        Label2.Text = value1;
        Label3.Text = value2;
        Label4.Text = value3;
    }
}
