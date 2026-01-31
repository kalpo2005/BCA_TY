<%@ Page Language="C#" AutoEventWireup="true" CodeFile="assign3_uppertriangle.aspx.cs" Inherits="assign3_uppertriangle" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title>Untitled Page</title>
</head>
<body>
    <form id="form1" runat="server">
    <asp:Label ID="Label1" runat="server" Text="Number of row :"></asp:Label>
&nbsp;
    <asp:TextBox ID="TextBox1" runat="server"></asp:TextBox>
    <br />
    <br />
    <asp:Button ID="Button1" runat="server" onclick="Button1_Click" 
        style="margin-left: 59px" Text="Get Pattern" Width="127px" />
    <br />
    <br />
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    <asp:Label ID="Label2" runat="server"></asp:Label>
    <br />
    <div>
    
        <asp:Label ID="Label3" runat="server"></asp:Label>
    
    </div>
    </form>
</body>
</html>
