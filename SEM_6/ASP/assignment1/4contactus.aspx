<%@ Page Language="C#" AutoEventWireup="true" CodeFile="4contactus.aspx.cs" Inherits="_4contactus" %>

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
    
         <br />
         <br />
         <br />
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
         <asp:Label ID="Label1" runat="server" Text="Contact Detail"></asp:Label>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
         <br />
         <br />
&nbsp;&nbsp;&nbsp;
         <asp:Label ID="Label2" runat="server" Text="Name         : Kalpesh Bavaliya"></asp:Label>
         <br />
&nbsp;&nbsp;&nbsp;
         <asp:Label ID="Label4" runat="server" Text="Mobile Number : 709672 00000"></asp:Label>
         <br />
&nbsp;&nbsp;&nbsp;
         <asp:Label ID="Label3" runat="server" 
             Text="Address : At : Hamapar, Taluka : Gadhada, District : Botad"></asp:Label>
    
    </div>
    </form>
</body>
</html>
