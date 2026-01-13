<%@ Page Language="C#" AutoEventWireup="true" CodeFile="aithmaticoperation.aspx.cs" Inherits="aithmaticoperation" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title>Untitled Page</title>
</head>
<body>
    <form id="form1" runat="server">
    <asp:Label ID="Label1" runat="server" Text="Number 1 :"></asp:Label>
&nbsp;
    <asp:TextBox ID="TextBox1" runat="server"></asp:TextBox>
    <br />
&nbsp;<div>
    
     &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;  
        <asp:DropDownList ID="DropDownList1" runat="server">
            <asp:ListItem>+</asp:ListItem>
            <asp:ListItem>-</asp:ListItem>
            <asp:ListItem>*</asp:ListItem>
            <asp:ListItem>/</asp:ListItem>
        </asp:DropDownList>
        <br />
        <br />
        <asp:Label ID="Label2" runat="server" Text="Number 2"></asp:Label>
&nbsp; :&nbsp;
        <asp:TextBox ID="TextBox2" runat="server"></asp:TextBox>
        <br />
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
       &nbsp; &nbsp; &nbsp; &nbsp;  <asp:Label ID="Label3" runat="server" Text="="></asp:Label>
        <br />
        <asp:Label ID="Label4" runat="server" Text="Answer : "></asp:Label>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <asp:TextBox ID="TextBox3" runat="server"></asp:TextBox>
    
        <br />
        <br />
&nbsp;&nbsp;
        <asp:Button ID="Button1" runat="server" BackColor="#3399FF" ForeColor="White" 
            onclick="Button1_Click" Text="Operation" Width="170px" />
    
    </div>
    </form>
</body>
</html>
