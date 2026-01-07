<%@ Page Language="C#" AutoEventWireup="true" CodeFile="combobox.aspx.cs" Inherits="combobox" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title>Untitled Page</title>
</head>
<body>
    <form id="form1" runat="server">
    <asp:Label ID="Label1" runat="server" Text="Single Select"></asp:Label>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    <asp:Label ID="Label2" runat="server" Text="Multiple Select"></asp:Label>
    <br />
    <br />
    <div>
    
        <asp:ListBox ID="ListBox1" runat="server" Rows="1">
            <asp:ListItem>C</asp:ListItem>
            <asp:ListItem>C++</asp:ListItem>
            <asp:ListItem>PHP</asp:ListItem>
            <asp:ListItem>Java</asp:ListItem>
            <asp:ListItem>React</asp:ListItem>
            <asp:ListItem>Laravel</asp:ListItem>
        </asp:ListBox>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <asp:ListBox ID="ListBox2" runat="server" Rows="1">
            <asp:ListItem>html</asp:ListItem>
            <asp:ListItem>css</asp:ListItem>
            <asp:ListItem>java</asp:ListItem>
            <asp:ListItem>js</asp:ListItem>
            <asp:ListItem>react</asp:ListItem>
        </asp:ListBox>
    
    </div>
    </form>
    <p>
        &nbsp;</p>
</body>
</html>
