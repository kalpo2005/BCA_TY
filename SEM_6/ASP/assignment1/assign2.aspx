<%@ Page Language="C#" AutoEventWireup="true" CodeFile="assign2.aspx.cs" Inherits="assign2" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title>Untitled Page</title>
</head>
<body>
    <form id="form1" runat="server">
    <div>
    
        <asp:LinkButton ID="LinkButton1" runat="server" onclick="LinkButton1_Click">click 
        here to show image</asp:LinkButton>
        <br />
        <br />
        <asp:ImageButton ID="ImageButton1" runat="server" Height="500px" 
            Width="500px" PostBackUrl="~/images/_innovation_25052025.jpg" 
            Visible="False" />
    
    </div>
    </form>
</body>
</html>
