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

public partial class asssign8 : System.Web.UI.Page
{
    protected void Page_Load(object sender, EventArgs e)
    {

    }
    protected void CheckBoxList1_SelectedIndexChanged(object sender, EventArgs e)
    {

    }
    protected void Button1_Click(object sender, EventArgs e)
    {
        String fruit = "Your favorite fruit is : ";
        Boolean isSelected = false;

        int kal = CheckBoxList1.Items.Count;

        for (int i = 0; i < kal; i++)
        {
            if (CheckBoxList1.Items[i].Selected)
            {
                fruit += CheckBoxList1.Items[i].Text + " ,";
                isSelected = true;
            }
        }

        if (!isSelected)
            Label2.Text = "No any fruit selected ";
        else
            Label2.Text = fruit;
    }
}
