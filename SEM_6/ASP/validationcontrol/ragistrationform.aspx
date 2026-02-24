<%@ Page Language="C#" AutoEventWireup="true" CodeFile="ragistrationform.aspx.cs" Inherits="ragistrationform" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title>Ragistration form validation</title>
</head>
<body>
    <form id="form1" runat="server">
    <div>
    
        <asp:Label ID="Label1" runat="server" Text="Name : "></asp:Label> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <asp:TextBox ID="TextBox1" runat="server" ontextchanged="TextBox1_TextChanged"></asp:TextBox>
        <asp:RequiredFieldValidator ID="RequiredFieldValidator1" runat="server" 
            ControlToValidate="TextBox1" ErrorMessage="Name Required !!!" Display="Dynamic"></asp:RequiredFieldValidator>
        <br />
        <br />
        
         <asp:Label ID="Label2" runat="server" Text="Age :"></asp:Label> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <asp:TextBox ID="TextBox2" runat="server"></asp:TextBox>
        <asp:RequiredFieldValidator ID="RequiredFieldValidator2" runat="server" 
            ControlToValidate="TextBox2" ErrorMessage="Age Required !!!" 
            Display="Dynamic"></asp:RequiredFieldValidator>
        <asp:RangeValidator ID="RangeValidator1" runat="server" 
            ControlToValidate="TextBox2" ErrorMessage="Age Must be 18-35" MaximumValue="35" 
            MinimumValue="18" Type="Integer" Display="Dynamic"></asp:RangeValidator>
        <br />
        <br />
        <asp:Label ID="Label5" runat="server" Text="Email :"></asp:Label>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <asp:TextBox ID="TextBox5" runat="server"></asp:TextBox>
&nbsp;<asp:RequiredFieldValidator ID="RequiredFieldValidator5" runat="server" 
            ControlToValidate="TextBox5" Display="Dynamic" 
            ErrorMessage="Email Required !!!"></asp:RequiredFieldValidator>
&nbsp;<asp:RegularExpressionValidator ID="RegularExpressionValidator1" runat="server" 
            ControlToValidate="TextBox5" Display="Dynamic" 
            ErrorMessage="Enter Valid Email !!!" 
            ValidationExpression="\w+([-+.']\w+)*@\w+([-.]\w+)*\.\w+([-.]\w+)*"></asp:RegularExpressionValidator>
        <br />
        <br />
        
         <asp:Label ID="Label3" runat="server" Text="Password :"></asp:Label> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <asp:TextBox ID="TextBox3" runat="server" TextMode="Password"></asp:TextBox>
        <asp:RequiredFieldValidator ID="RequiredFieldValidator3" runat="server" 
            ControlToValidate="TextBox3" ErrorMessage="Password Required !!!" 
            Display="Dynamic" ToolTip="password "></asp:RequiredFieldValidator>
        <br />
        <br />
        
         <asp:Label ID="Label4" runat="server" Text="Confirm Password :"></asp:Label> &nbsp;
        <asp:TextBox ID="TextBox4" runat="server" ontextchanged="TextBox4_TextChanged" 
            TextMode="Password"></asp:TextBox>
        <asp:RequiredFieldValidator ID="RequiredFieldValidator4" runat="server" 
            ControlToValidate="TextBox4" ErrorMessage="Password Required !!!" Display="Dynamic"></asp:RequiredFieldValidator>
        <asp:CompareValidator ID="CompareValidator2" runat="server" 
            ControlToCompare="TextBox4" ControlToValidate="TextBox3" 
            ErrorMessage="Password must be same !!!" Display="Dynamic"></asp:CompareValidator>
        <br />
        <br />
        <asp:Label ID="Label6" runat="server" Text="Gender :"></asp:Label>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <asp:RadioButton ID="RadioButton1" runat="server" GroupName="genderSelecte" 
            Text="Male" />
&nbsp;&nbsp;&nbsp;&nbsp;
        <asp:RadioButton ID="RadioButton2" runat="server" GroupName="genderSelecte" 
            Text="Female" />
&nbsp;
        <asp:CustomValidator ID="CustomValidator1" runat="server" 
            ErrorMessage="Gender Reuired !!" 
            onservervalidate="CustomValidator1_ServerValidate"></asp:CustomValidator>
        <br />
        <br />
        <asp:Label ID="Label7" runat="server" Text="Course :"></asp:Label>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <asp:CheckBox ID="CheckBox1" runat="server" Text="BCA" />
&nbsp;&nbsp;
        <asp:CheckBox ID="CheckBox2" runat="server" Text="MCA" />
&nbsp;&nbsp;
        <asp:CheckBox ID="CheckBox3" runat="server" Text="B.TECH" />
&nbsp;<asp:CustomValidator ID="CustomValidator2" runat="server" 
            ErrorMessage="Course Required !!!" 
            onservervalidate="CustomValidator2_ServerValidate"></asp:CustomValidator>
        <br />
        <br />
        <br />
        <asp:Button ID="Button1" runat="server" onclick="Button1_Click" 
            style="margin-left: 27px" Text="Button" Width="100px" />
        <br />
    
    </div>
    </form>
</body>
</html>
