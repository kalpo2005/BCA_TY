<%@ Page Language="C#" AutoEventWireup="true"  CodeFile="Default.aspx.cs" Inherits="_Default" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title>Crud Operation</title>
</head>
<body>
    <form id="form1" runat="server">
    <div>
    
        <asp:Label ID="Label6" runat="server" Text="ID :"></asp:Label>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <asp:TextBox ID="TextBox3" runat="server"></asp:TextBox>
        <br />
        <br />
    
        <asp:Label ID="Label1" runat="server" Text="Name :"></asp:Label>
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <asp:TextBox ID="TextBox1" runat="server" Width="164px"></asp:TextBox>
        <br />
        <br />
        <asp:Label ID="Label2" runat="server" Text="City :"></asp:Label>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <asp:TextBox ID="TextBox2" runat="server" Width="163px"></asp:TextBox>
        <br />
        <br />
        <asp:Label ID="Label4" runat="server" Text="Gender :"></asp:Label>
&nbsp;&nbsp;&nbsp;
        <asp:RadioButton ID="RadioButton1" runat="server" GroupName="gender" 
            Text="Male" Checked="True"/>
&nbsp;&nbsp;
        <asp:RadioButton ID="RadioButton2" runat="server"  
            GroupName="gender" Text="Female" />
        <br />
        <br />
        <asp:Label ID="Label5" runat="server" Text="Education"></asp:Label>
&nbsp;:&nbsp;&nbsp;
        <asp:CheckBox ID="CheckBox1" runat="server" Text="BCA" />
&nbsp;
        <asp:CheckBox ID="CheckBox2" runat="server" Text="MCA" />
&nbsp;
        <asp:CheckBox ID="CheckBox3" runat="server" Text="B.TECH" />
        <br />
        <br />
        <asp:Button ID="Button1" runat="server" onclick="Button1_Click" 
            style="margin-left: 10px; margin-bottom: 2px" Text="Insert" Width="131px" 
            BackColor="#006600" ForeColor="White" />
        &nbsp;
        
        <asp:Button ID="Button2" runat="server"
            style="margin-left: 10px; margin-bottom: 2px" Text="Update" 
            Width="131px" BackColor="#FFFF66" ForeColor="Black" 
            onclick="Button2_Click" />
        &nbsp;&nbsp;&nbsp;
        
        <asp:Button ID="Button3" runat="server"
            style="margin-left: 10px; margin-bottom: 2px" Text="Delete" 
            Width="131px" BackColor="Maroon" ForeColor="White" 
            onclick="Button3_Click" />
        &nbsp;
        
        <asp:Button ID="Button4" runat="server"
            style="margin-left: 10px; margin-bottom: 2px" Text="Display" 
            Width="131px" BackColor="#3399FF" ForeColor="White" 
            onclick="Button4_Click" Height="26px" />
        &nbsp;
        <asp:Button ID="Button5" runat="server" 
            style="margin-left: 10px; margin-bottom: 2px" Text="Search" 
            Width="131px" onclick="Button5_Click" />
        &nbsp;
        &nbsp;
        <br />
        <br />
        <asp:Label ID="Label3" runat="server" ForeColor="#009933" 
            Text="Data successfully inserted !!!"></asp:Label>
    
        <br />
        <br />
        <asp:GridView ID="GridView1" runat="server" Width="500px">
        </asp:GridView>
    
    </div>
    </form>
</body>
</html>
