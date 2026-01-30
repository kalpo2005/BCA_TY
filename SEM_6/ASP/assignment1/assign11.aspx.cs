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

public partial class assign11 : System.Web.UI.Page
{
    protected void Page_Load(object sender, EventArgs e)
    {

    }
    protected void Button1_Click(object sender, EventArgs e)
    {

        bool isInsert = false;
        for (int i = 0; i < ListBox1.Items.Count; i++)
        {
            string name = ListBox1.Items[i].Text;
            isInsert = false;
            if (ListBox1.Items[i].Selected)
            {

                for (int j = 0; j < ListBox2.Items.Count; j++)
                {
                    if (ListBox2.Items[j].Text == name)
                    {                                                
                        isInsert = true;
                        break;
                    }
                }
                if (!isInsert)
                    ListBox2.Items.Add(name);              
            }
         
        }
    }
    protected void Button2_Click(object sender, EventArgs e)
    {
        for (int i = 0; i < ListBox2.Items.Count; i++)
        {
            if (ListBox2.Items[i].Selected)
                ListBox2.Items.RemoveAt(i);
        }
    }

  /*  protected bool checkExits(String name)
    {

        for (int i = 0; i < ListBox2.Items.Count; i++)
        {
            if (ListBox2.Items[i].Text != name){
                return true;
            }
            return false; 
        }
    }*/
}
