<%@ Page Language="C#" AutoEventWireup="true" CodeFile="4home.aspx.cs" Inherits="_4home" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title>Home</title>
</head>
<body runat="server" id="BodyTag">
   <form id="form1" runat="server">
    <div>
     <asp:LinkButton ID="LinkButton1" runat="server" PostBackUrl="~/4home.aspx">Home</asp:LinkButton>
&nbsp;&nbsp;
        <asp:LinkButton ID="LinkButton2" runat="server" PostBackUrl="~/4aboutus.aspx" 
            onclick="LinkButton2_Click">About 
        Us</asp:LinkButton>
&nbsp;&nbsp;
        <asp:LinkButton ID="LinkButton3" runat="server" PostBackUrl="~/4contactus.aspx">Contact 
        Us</asp:LinkButton>
    
    </div>
    </form>
</body>
</html>
