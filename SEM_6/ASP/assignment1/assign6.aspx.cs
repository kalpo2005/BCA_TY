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

public partial class assign6 : System.Web.UI.Page
{
    protected void Page_Load(object sender, EventArgs e)
    {

    }
    protected void RadioButton3_CheckedChanged(object sender, EventArgs e)
    {

    }
    protected void Button1_Click(object sender, EventArgs e)
    {
        String setColor = " Your Selected Color Is : ";
        bool isSelected = false;

            if(RadioButton1.Checked){
               setColor += RadioButton1.Text;
                isSelected = true;
            }

               if(RadioButton2.Checked){
               setColor += RadioButton2.Text;
                isSelected = true;
            }

                if(RadioButton3.Checked){
               setColor += RadioButton3.Text;
                isSelected = true;
            }

                if(RadioButton4.Checked){
               setColor += RadioButton4.Text;
                isSelected = true;
            }

                if(RadioButton5.Checked){
               setColor += RadioButton5.Text;
                isSelected = true;
            }

                if (RadioButton6.Checked)
                {
               setColor += RadioButton6.Text;
                isSelected = true;
            }

               if(!isSelected)
                   setColor = "No Any color selected !!!";

                Label2.Text = setColor;
    }
}
