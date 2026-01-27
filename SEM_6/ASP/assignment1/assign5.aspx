<%@ Page Language="C#" AutoEventWireup="true" CodeFile="assign5.aspx.cs" Inherits="assign5" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title>Untitled Page</title>
</head>
<body>
    <form id="form1" runat="server">
    <div style="text-align: center">
    
        <asp:Label ID="Label1" runat="server" 
            Text="Select language which you learn in BCA"></asp:Label>
        <br />
        <br />
        <asp:Label ID="Label2" runat="server" Text="Please Select a Language:"></asp:Label>
        <br />
        <br />
        <asp:CheckBox ID="CheckBox1" runat="server" 
            oncheckedchanged="CheckBox1_CheckedChanged" Text="NodeJS" />
&nbsp;
        <asp:CheckBox ID="CheckBox2" runat="server" Text="Flutter" />&nbsp;&nbsp;&nbsp;
        <asp:CheckBox ID="CheckBox3" runat="server" Text="Laravel" />
        
        <br />
        <br />
        <asp:Label ID="Label3" runat="server"></asp:Label>
        <br />
        <br />
        <asp:Button ID="Button1" runat="server" onclick="Button1_Click" Text="Button" 
            Width="169px" />
    
    </div>
    </form>
    <p>
        &nbsp;</p>
</body>
</html>
