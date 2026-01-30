<%@ Page Language="C#" AutoEventWireup="true" CodeFile="4aboutus.aspx.cs" Inherits="_4aboutus" %>

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
        <asp:LinkButton ID="LinkButton3" runat="server" PostBackUrl="~/4contactus.aspx" 
             onclick="LinkButton3_Click">Contact 
        Us</asp:LinkButton>
    
        
         <br />
         <br />
         <br />
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
         <asp:Image ID="Image1" runat="server" Height="300px" Width="300px" />
    
        
    </div>
    </form>
</body>
</html>
