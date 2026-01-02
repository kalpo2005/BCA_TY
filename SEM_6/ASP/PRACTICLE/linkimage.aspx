<%@ Page Language="C#" AutoEventWireup="true" CodeFile="linkimage.aspx.cs" Inherits="linkimage" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title>Untitled Page</title>
</head>
<body>
    <form id="form1" runat="server">
     
    <asp:ImageButton ID="ImageButton1" runat="server" Height="500px" 
        Width="800px" ImageUrl="~/images/09032025-2.jpg" 
        onclick="ImageButton1_Click" />
         <br /> <br />
    <div>
    
        <asp:Button ID="Button1" runat="server" Text="Show Image" Width="134px" 
            BackColor="#0099FF" ForeColor="White" Height="39px" onclick="Button1_Click" />
        <asp:Button ID="Button2" runat="server" style="margin-left: 52px" Text="Hide Image" 
            Width="155px" BackColor="#3399FF" ForeColor="White" Height="38px" 
            onclick="Button2_Click" />
    
    </div>
   
    </form>
</body>
</html>
