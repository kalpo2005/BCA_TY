<%@ Page Language="C#" AutoEventWireup="true" CodeFile="assign7.aspx.cs" Inherits="assign7" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title>Untitled Page</title>
</head>
<body>
    <form id="form1" runat="server">
    <div>
    
        <asp:Label ID="Label1" runat="server" Text="Your course :"></asp:Label>
&nbsp;&nbsp;
        <asp:RadioButton ID="RadioButton1" runat="server" GroupName="course" 
            Text="BCA" />
&nbsp;&nbsp;
        <asp:RadioButton ID="RadioButton2" runat="server" GroupName="course" 
            Text="B.COM" />
&nbsp;&nbsp;
        <asp:RadioButton ID="RadioButton3" runat="server" GroupName="course" 
            Text="B.SC" />
&nbsp;&nbsp;&nbsp;&nbsp;
        <asp:RadioButton ID="RadioButton4" runat="server" GroupName="course" 
            Text="BA" />
        <br />
        <br />
        <asp:Button ID="Button1" runat="server" onclick="Button1_Click" 
            style="margin-left: 48px" Text="submit" Width="221px" />
        <br />
        <br />
        <br />
        <asp:Label ID="Label2" runat="server"></asp:Label>
    
    </div>
    </form>
</body>
</html>
