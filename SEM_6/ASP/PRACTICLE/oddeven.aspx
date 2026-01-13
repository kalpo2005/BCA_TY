<%@ Page Language="C#" AutoEventWireup="true" CodeFile="oddeven.aspx.cs" Inherits="oddeven" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title>Untitled Page</title>
</head>
<body>
    <form id="form1" runat="server">
    <div>
    
        <asp:Label ID="Label1" runat="server" Text="Number For Checking :"></asp:Label>
&nbsp;&nbsp;
        <asp:TextBox ID="TextBox1" runat="server"></asp:TextBox>
        <br />
        <br />
        <asp:Label ID="Label2" runat="server" Text="Number is : "></asp:Label>
        <br />
        <br />
        <asp:Button ID="Button1" runat="server" BackColor="#3399FF" ForeColor="White" 
            onclick="Button1_Click" style="margin-left: 33px" Text="Check Whether" 
            Width="174px" />
    
    </div>
    </form>
</body>
</html>
