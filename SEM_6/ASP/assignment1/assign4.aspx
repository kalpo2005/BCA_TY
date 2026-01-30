<%@ Page Language="C#" AutoEventWireup="true" CodeFile="assign4.aspx.cs" Inherits="assign4" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title>Untitled Page</title>
</head>
<body>
    <form id="form1" runat="server">
    <div>
    
        <asp:LinkButton ID="LinkButton1" runat="server" PostBackUrl="~/4home.aspx">Home</asp:LinkButton>
&nbsp;&nbsp;
        <asp:LinkButton ID="LinkButton2" runat="server" PostBackUrl="~/4aboutus.aspx">About 
        Us</asp:LinkButton>
&nbsp;&nbsp;
        <asp:LinkButton ID="LinkButton3" runat="server" PostBackUrl="~/4contactus.aspx">Contact 
        Us</asp:LinkButton>
    
    </div>
    </form>
</body>
</html>
