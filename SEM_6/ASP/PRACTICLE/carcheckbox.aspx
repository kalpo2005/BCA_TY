<%@ Page Language="C#" AutoEventWireup="true" CodeFile="carcheckbox.aspx.cs" Inherits="carcheckbox" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title>Untitled Page</title>
</head>
<body>
    <form id="form1" runat="server">
    <div>
    
        <asp:Label ID="Label2" runat="server" Text="Select Hobby"></asp:Label>
        <br />
        <br />
        <asp:CheckBox ID="CheckBox1" runat="server" 
            oncheckedchanged="CheckBox1_CheckedChanged" Text="Reading" />
&nbsp;&nbsp;&nbsp;
        <asp:CheckBox ID="CheckBox2" runat="server" Text="Playing" />
&nbsp;&nbsp;&nbsp;
        <asp:CheckBox ID="CheckBox3" runat="server" Text="Writing" />
        <br />
        <br />
        <asp:Label ID="Label1" runat="server" Text="Choose Your Hobbies"></asp:Label>
        <br />
        <br />
        <asp:Button ID="Button1" runat="server" Text="Button" Width="218px" 
            onclick="Button1_Click" />
    
    </div>
    </form>
</body>
</html>
