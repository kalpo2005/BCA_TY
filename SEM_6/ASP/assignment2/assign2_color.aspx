<%@ Page Language="C#" AutoEventWireup="true" CodeFile="assign2_color.aspx.cs" Inherits="assign2_color" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title>Untitled Page</title>
</head>
<body>
    <form id="form1" runat="server">
    <div>
    
        <asp:Label ID="Label1" runat="server" Text="Follow this rule : "></asp:Label>
&nbsp;
        <asp:DropDownList ID="DropDownList1" runat="server" Height="22px" Width="93px">
            <asp:ListItem>Red</asp:ListItem>
            <asp:ListItem>Yellow</asp:ListItem>
            <asp:ListItem>Green</asp:ListItem>
        </asp:DropDownList>
        <br />
        <br />
        <asp:Button ID="Button1" runat="server" onclick="Button1_Click" 
            style="margin-left: 41px" Text="Follow Me" Width="102px" />
        <br />
        <br />
        <asp:Label ID="Label2" runat="server"></asp:Label>
    
    </div>
    </form>
</body>
</html>
