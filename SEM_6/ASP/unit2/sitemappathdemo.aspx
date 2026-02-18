<%@ Page Language="C#" AutoEventWireup="true" CodeFile="sitemappathdemo.aspx.cs" Inherits="sitemappathdemo" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title>TREE VIEW COURSE</title>
</head>
<body>
    <form id="form1" runat="server">
    <div>
    
        <asp:SiteMapPath ID="SiteMapPath1" runat="server">
        </asp:SiteMapPath>
        <br />
        <br />
    
        <asp:TreeView ID="TreeView1" runat="server">
            <Nodes>
                <asp:TreeNode Text="Course" Value="Course" NavigateUrl="~/sitemappathdemo.aspx">
                    <asp:TreeNode Text="B.C.A." Value="B.C.A." NavigateUrl="~/treeview/bca.aspx"></asp:TreeNode>
                    <asp:TreeNode Text="B.COM" Value="B.COM" NavigateUrl="~/treeview/bcom.aspx"></asp:TreeNode>
                    <asp:TreeNode Text="B.A." Value="B.A." NavigateUrl="~/treeview/ba.aspx"></asp:TreeNode>
                </asp:TreeNode>
            </Nodes>
        </asp:TreeView>
    
    </div>
    </form>
</body>
</html>
