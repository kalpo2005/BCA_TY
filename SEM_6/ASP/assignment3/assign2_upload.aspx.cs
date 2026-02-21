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

public partial class assign2_upload : System.Web.UI.Page
{
    protected void Page_Load(object sender, EventArgs e)
    {
        Label2.Visible = false;
        Image1.Visible = false;
    }
    protected void Button1_Click(object sender, EventArgs e)
    {
        if(FileUpload1.HasFile)
        {
            string dateTime = DateTime.Now.ToString("yyyyMMdd");
             string uploadPath = Server.MapPath("~/uploads/"+dateTime + FileUpload1.FileName);
             FileUpload1.PostedFile.SaveAs(uploadPath);
            Label2.Text = "Image Upload succssfully !!! ";
            Image1.ImageUrl ="~/uploads/"+dateTime + FileUpload1.FileName;
            Image1.Visible = true;
        }
        else
        {
            Label2.Text = "Image not Uploaded ";
        }
        Label2.Visible = true;
   }
}
