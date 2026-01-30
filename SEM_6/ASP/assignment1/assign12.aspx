<%@ Page Language="C#" AutoEventWireup="true" CodeFile="assign12.aspx.cs" Inherits="assign12" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title>Simple Interest</title>
</head>
<body>
    <form id="form1" runat="server">
    <div>
    
        <asp:Label ID="Label1" runat="server" Text="Enter price"></asp:Label>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <asp:TextBox ID="TextBox1" runat="server" ></asp:TextBox> 
        <br />
        <br />
        
        <asp:Label ID="Label2" runat="server" Text=" Enter Rate"></asp:Label>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <asp:TextBox ID="TextBox2" runat="server"></asp:TextBox> 
        <br />
        <br />
        
        <asp:Label ID="Label3" runat="server" Text="Enter Year"></asp:Label>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <asp:TextBox ID="TextBox3" runat="server"></asp:TextBox> <br />
    
        <br />
        <asp:Button ID="Button1" runat="server" style="margin-left: 29px" Text="Submit" 
            Width="127px" onclick="Button1_Click" />
    
        <br />
        <br />
        <asp:Label ID="Label4" runat="server"></asp:Label>
    
    </div>
    </form>
</body>
</html>
