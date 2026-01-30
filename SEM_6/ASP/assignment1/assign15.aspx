<%@ Page Language="C#" AutoEventWireup="true" CodeFile="assign15.aspx.cs" Inherits="assign15" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title>Armstrong</title>
</head>
<body>
    <form id="form1" runat="server">
    <div>
    
        <asp:Label ID="Label1" runat="server" Text="CheckNmber For Armstrong"></asp:Label>
        :<br />
        <asp:TextBox ID="TextBox1" runat="server" Height="27px" 
            style="margin-top: 12px" Width="191px"></asp:TextBox>
        <br />
        <br />
        <asp:Button ID="Button1" runat="server" Height="26px" onclick="Button1_Click" 
            style="margin-left: 39px" Text="Button" Width="126px" />
        <br />
        <br />
        <asp:Label ID="Label2" runat="server"></asp:Label>
    
    </div>
    </form>
</body>
</html>
