<%@ Page Language="C#" AutoEventWireup="true" CodeFile="addition.aspx.cs" Inherits="addition" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title>Untitled Page</title>
</head>
<body>
    <form id="form1" runat="server">
    <div>
    
        <asp:Label ID="Label1" runat="server" Text="Number 1 :"></asp:Label>
        <asp:TextBox ID="TextBox1" runat="server" ontextchanged="TextBox1_TextChanged" 
            style="margin-left: 37px" ToolTip="Number 1" Width="150px"></asp:TextBox>
        <br />
        <br />
        <asp:Label ID="Label2" runat="server" Text="Number 2 :"></asp:Label>
        <asp:TextBox ID="TextBox2" runat="server" style="margin-left: 40px" 
            Width="145px"></asp:TextBox>
        <br />
        <br />
        <asp:Button ID="Button1" runat="server" onclick="Button1_Click" 
            style="margin-left: 18px" Text="Addition" Width="126px" />
        <br />
        <br />
        <asp:Label ID="Label3" runat="server" Text="Answer Is :"></asp:Label>
    
    </div>
    </form>
</body>
</html>
