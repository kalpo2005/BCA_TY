<%@ Page Language="C#" AutoEventWireup="true" CodeFile="assign1_factorial.aspx.cs" Inherits="assign1_factorial" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title>factrial</title>
</head>
<body>
    <form id="form1" runat="server">
    <div>
    
        <asp:Label ID="Label1" runat="server" Text="Enter Number : "></asp:Label>
&nbsp;&nbsp;
        <asp:TextBox ID="TextBox1" runat="server"></asp:TextBox>
        <br />
        <br />
        <asp:Button ID="Button1" runat="server" onclick="Button1_Click" 
            style="margin-left: 56px" Text="Find Factorial" Width="120px" />
        <br />
        <br />
        <asp:Label ID="Label2" runat="server"></asp:Label>
        <br />
    
    </div>
    </form>
</body>
</html>
