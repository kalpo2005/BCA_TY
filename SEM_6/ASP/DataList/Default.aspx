<%@ Page Language="C#" AutoEventWireup="true"  CodeFile="Default.aspx.cs" Inherits="_Default" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title>DATA lIST</title>
    <style>
   
    
    </style>
</head>
<body>
    <form id="form1" runat="server">
    <div>
    
        <asp:Label ID="Label1" runat="server" Text="Id :"></asp:Label>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;
        <asp:TextBox ID="TextBox1" runat="server"></asp:TextBox>
        <br />
        <br />
        <asp:Label ID="Label2" runat="server" Text="Name :"></asp:Label>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;
        <asp:TextBox ID="TextBox2" runat="server"></asp:TextBox>
        <br />
        <br />
        <asp:Label ID="Label3" runat="server" Text="Salary :"></asp:Label>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <asp:TextBox ID="TextBox3" runat="server"></asp:TextBox>
        <br />
        <br />
        <asp:Label ID="Label4" runat="server" Text="Age :"></asp:Label>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 
        &nbsp;&nbsp;&nbsp; &nbsp;&nbsp;
        <asp:TextBox ID="TextBox4" runat="server"></asp:TextBox>
        <br />
        <br />
        <asp:Label ID="Label5" runat="server" Text="Department :"></asp:Label>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <asp:TextBox ID="TextBox5" runat="server"></asp:TextBox>
        <br />
        <br />
        <asp:Button ID="Button1" runat="server" style="margin-left: 14px" Text="Insert" 
            Width="85px" onclick="Button1_Click" />
&nbsp;&nbsp;

<asp:Button ID="Button2" runat="server" style="margin-left: 14px" Text="Select" 
            Width="85px" onclick="Button2_Click1" />
&nbsp;&nbsp;

<asp:Button ID="Button3" runat="server" style="margin-left: 14px" Text="Max" 
            Width="85px" onclick="Button3_Click" />
&nbsp;&nbsp;

<asp:Button ID="Button4" runat="server" style="margin-left: 14px" Text="Top 3" 
            Width="85px" onclick="Button4_Click" />
&nbsp;&nbsp;

<asp:Button ID="Button5" runat="server" style="margin-left: 14px" Text="Update" 
            Width="85px" onclick="Button5_Click" />
&nbsp;&nbsp;

<asp:Button ID="Button6" runat="server" style="margin-left: 14px" Text="Delete" 
            Width="85px" onclick="Button6_Click" />
&nbsp;&nbsp;
        <br />
        <br />
        <asp:Label ID="Label6" runat="server"></asp:Label>
        <br />
        <div class="center">
        <asp:DataList ID="DataList1" runat="server" BorderWidth="1">

    <HeaderTemplate>
        <table border="1" width="600">
            <tr style="background-color:#507CD1;color:white;font-weight:bold;">
                <th>Id</th>
                <th>Name</th>
                <th>Salary</th>
                <th>Age</th>
                <th>Department</th>
            </tr>
    </HeaderTemplate>

    <ItemTemplate>
        <tr>
            <td><%# Eval("id") %></td>
            <td><%# Eval("name") %></td>
            <td><%# Eval("salary") %></td>
            <td><%# Eval("age") %></td>
            <td><%# Eval("department") %></td>
        </tr>
    </ItemTemplate>

    <FooterTemplate>
        </table>
    </FooterTemplate>

</asp:DataList>
        </div>
        <br />
    
    </div>
    </form>
</body>
</html>
