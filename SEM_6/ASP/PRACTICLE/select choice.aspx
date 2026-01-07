<%@ Page Language="C#" AutoEventWireup="true" CodeFile="select choice.aspx.cs" Inherits="select_choice" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title>Untitled Page</title>
</head>
<body>
    <form id="form1" runat="server">
    <div>
    
        <asp:Label ID="Label1" runat="server" Text="Select Language"></asp:Label>
        <br />
        <br />
        <asp:DropDownList ID="DropDownList1" runat="server">
            <asp:ListItem>HTML</asp:ListItem>
            <asp:ListItem>CSS</asp:ListItem>
            <asp:ListItem>JS</asp:ListItem>
            <asp:ListItem>PHP</asp:ListItem>
            <asp:ListItem>REACT JS</asp:ListItem>
            <asp:ListItem>NodeJS</asp:ListItem>
            <asp:ListItem>Java</asp:ListItem>
        </asp:DropDownList>
        <br />
        <br />
        <asp:Button ID="Button1" runat="server" onclick="Button1_Click" Text="Button" />
        <br />
        <br />
        <asp:Label ID="Label2" runat="server" Text="Your selected Option is :"></asp:Label>
         <br />
        <br />
        <asp:Label ID="Label3" runat="server" Text="Your selected Index is :"></asp:Label>
    
     <br />
        <br />
        <asp:Label ID="Label4" runat="server" Text="Your selected value is :"></asp:Label>
    
    
    </div>
    </form>
</body>
</html>
