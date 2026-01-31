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

public partial class assign2_color : System.Web.UI.Page
{
    protected void Page_Load(object sender, EventArgs e)
    {

    }
    protected void Button1_Click(object sender, EventArgs e)
    {
        string signal = DropDownList1.SelectedValue;

        if(signal == "Red")
            Label2.Text = " Please stop your car ";
        else if (signal == "Yellow")
            Label2.Text = " Ready to go” ";
        else if(signal == "Green")
            Label2.Text = " Go and enjoy your ride !!! ";
    }
}
