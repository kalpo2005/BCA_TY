<%@ Page Language="C#" AutoEventWireup="true" CodeFile="assign4_sitemap.aspx.cs" Inherits="assign4_sitemap" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title>Sitemap</title>
</head>
<body>
    <form id="form1" runat="server">
    <div>
    
        <asp:SiteMapPath ID="SiteMapPath1" runat="server">
        </asp:SiteMapPath>
        <br />
        <asp:TreeView ID="TreeView1" runat="server" ExpandDepth="0">
            <Nodes>
                <asp:TreeNode Text="Electronics" Value="Electronics">
                    <asp:TreeNode Text="Mobile" Value="Mobile">
                        <asp:TreeNode NavigateUrl="~/sitemap/samasung.aspx" Text="Samsung" 
                            Value="Samsung"></asp:TreeNode>
                        <asp:TreeNode NavigateUrl="~/sitemap/vivo.aspx" Text="Vivo" Value="Vivo">
                        </asp:TreeNode>
                    </asp:TreeNode>
                    <asp:TreeNode Text="Leptop" Value="Leptop">
                        <asp:TreeNode NavigateUrl="~/sitemap/dell.aspx" Text="Dell" Value="Dell">
                        </asp:TreeNode>
                        <asp:TreeNode NavigateUrl="~/sitemap/lenovo.aspx" Text="Lenovo" Value="Lenovo">
                        </asp:TreeNode>
                    </asp:TreeNode>
                </asp:TreeNode>
            </Nodes>
        </asp:TreeView>
    
    </div>
    </form>
</body>
</html>
