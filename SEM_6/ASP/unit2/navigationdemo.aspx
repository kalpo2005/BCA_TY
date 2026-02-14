<%@ Page Language="C#" AutoEventWireup="true" CodeFile="navigationdemo.aspx.cs" Inherits="navigationdemo" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title>Navigation Menu </title>
</head>
<body>
    <form id="form1" runat="server">
    <div>
    
        <asp:Menu ID="Menu1" runat="server" Orientation="Horizontal" Width="308px">
            <Items>
                <asp:MenuItem Text="Home" Value="Home"></asp:MenuItem>
                <asp:MenuItem Text="Course" Value="Course">
                    <asp:MenuItem Text="BCA" Value="BCA"></asp:MenuItem>
                    <asp:MenuItem Text="B.COM" Value="B.COM"></asp:MenuItem>
                    <asp:MenuItem Text="B.SC" Value="B.SC"></asp:MenuItem>
                </asp:MenuItem>
                <asp:MenuItem Text="Contact Us" Value="Contact Us"></asp:MenuItem>
                <asp:MenuItem Text="About Us" Value="About Us"></asp:MenuItem>
            </Items>
        </asp:Menu>
    
    </div>
    </form>
</body>
</html>
