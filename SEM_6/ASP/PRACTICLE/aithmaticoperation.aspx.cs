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

public partial class aithmaticoperation : System.Web.UI.Page
{
    protected void Page_Load(object sender, EventArgs e)
    {

    }
    protected void Button1_Click(object sender, EventArgs e)
    {

        int num1 = int.Parse(TextBox1.Text);
        int interValue2 = int.Parse(TextBox2.Text);
        String value = DropDownList1.SelectedItem.Text;
        String answer = " ";

        switch (value)
        {
            case "+": answer = (num1 + interValue2).ToString();
                break;

            case "-": answer = (num1 - interValue2).ToString();
                break;

            case "*": answer = (num1 * interValue2).ToString();
                break;

            case "/": answer = (num1 / interValue2).ToString();
                break;

            default: answer = "Invalid Answer ";
                break;

        }

        TextBox3.Text = answer;
            
    }
}
