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

public partial class fileupload : System.Web.UI.Page
{
    protected void Page_Load(object sender, EventArgs e)
    {
        Label2.Visible = false;
        Image1.Visible = false;

    }
    protected void Button1_Click(object sender, EventArgs e)
    {
        string uploadPath = Server.MapPath("~/upload/"+ FileUpload1.FileName);

        FileUpload1.PostedFile.SaveAs(uploadPath);


        Image1.ImageUrl = uploadPath;

        Label2.Visible = true;
        Image1.Visible = true;
    }
}
