<%@ Page Language="C#" AutoEventWireup="true" CodeFile="demobutton.aspx.cs" Inherits="demobutton" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title>Button Image</title>
</head>
<body>
    <form id="form1" runat="server">
    <div>
    
    </div>
    <p>
        <asp:Button ID="Button1" runat="server" BackColor="#3399FF" 
            BorderColor="#CC6600" BorderStyle="Solid" BorderWidth="2px" ForeColor="White" 
            Height="39px" Text="Enter" Width="80px" /><br />s
        <asp:ImageButton ID="ImageButton1" runat="server" Height="365px" 
            ImageUrl="~/images/gkmaza sunday-1.png" onclick="ImageButton1_Click1" 
            Width="423px" />
        <br />
    </p>
    </form>
</body>
</html>
