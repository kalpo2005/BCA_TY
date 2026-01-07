<%@ Page Language="C#" AutoEventWireup="true" CodeFile="bulletlist.aspx.cs" Inherits="bulletlist" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title>Untitled Page</title>
</head>
<body>
    <form id="form1" runat="server">
    <div align="left">
    
        <asp:Label ID="Label1" runat="server" Text="Bullet List"></asp:Label>
        <asp:BulletedList ID="BulletedList1" runat="server" BulletStyle="Circle" 
            Width="225px">
            <asp:ListItem>Reding</asp:ListItem>
            <asp:ListItem>Writing</asp:ListItem>
            <asp:ListItem>Research</asp:ListItem>
            <asp:ListItem>Innovation</asp:ListItem>
        </asp:BulletedList>
    
    </div>
    </form>
    <p>
        &nbsp;</p>
</body>
</html>
