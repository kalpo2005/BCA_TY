<%@ Page Language="C#" AutoEventWireup="true" CodeFile="addremovelist.aspx.cs" Inherits="addremovelist" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title>Untitled Page</title>
</head>
<body>
    <form id="form1" runat="server">
    <div>
    
        <asp:Label ID="Label1" runat="server" Text="Add Remove List"></asp:Label>
        <br />
        <br />
        <asp:ListBox ID="ListBox1" runat="server">
        
        <asp:ListItem>HTML</asp:ListItem>
            <asp:ListItem>CSS</asp:ListItem>
            <asp:ListItem>JS</asp:ListItem>
            <asp:ListItem>PHP</asp:ListItem>
            <asp:ListItem>REACT JS</asp:ListItem>
            <asp:ListItem>NodeJS</asp:ListItem>
            <asp:ListItem>Java</asp:ListItem>
        
        </asp:ListBox>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <asp:ListBox ID="ListBox2" runat="server">
        
     
        
        </asp:ListBox>
        <br />
        <br />
        <asp:Button ID="Button1" runat="server" Text="Add" style="margin-left: 53px" 
            Width="88px" onclick="Button1_Click" />
    
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <asp:Button ID="Button2" runat="server" Text="Removes" Width="72px" 
            onclick="Button2_Click" />
    
    </div>
    </form>
</body>
</html>
