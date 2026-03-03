<%@ Page Language="C#" AutoEventWireup="true" CodeFile="assign6_validateform.aspx.cs" Inherits="assign6_validateform" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title>Untitled Page</title>
</head>
<body>
    <form id="form1" runat="server">
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    <asp:Label ID="Label1" runat="server"  BorderStyle="None" 
        Text="Student Ragistration" Font-Underline="True"></asp:Label>
    <br />
    <br />
    <asp:Label ID="Label2" runat="server" Text="Name : "></asp:Label>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    <asp:TextBox ID="TextBox1" runat="server"></asp:TextBox>
&nbsp;<asp:RequiredFieldValidator ID="RequiredFieldValidator1" runat="server" 
        ControlToValidate="TextBox1" ErrorMessage="Name Required !!!" 
        Display="Dynamic"></asp:RequiredFieldValidator>
&nbsp;
    <asp:RegularExpressionValidator ID="RegularExpressionValidator3" runat="server" 
        ControlToValidate="TextBox1" ErrorMessage="Name Must be Alphabate" 
        ValidationExpression="^[a-zA-Z]+$"></asp:RegularExpressionValidator>
    <br />
    <br />
    <asp:Label ID="Label3" runat="server" Text="Adress :"></asp:Label>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    <asp:TextBox ID="TextBox2" runat="server" Rows="2" TextMode="MultiLine"></asp:TextBox>
&nbsp;<asp:RequiredFieldValidator ID="RequiredFieldValidator2" runat="server" 
        ControlToValidate="TextBox2" Display="Dynamic" 
        ErrorMessage="Address Required !!!"></asp:RequiredFieldValidator>
    <br />
    <br />
    <asp:Label ID="Label4" runat="server" Text="Pincode"></asp:Label>
&nbsp;:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    <asp:TextBox ID="TextBox3" runat="server"></asp:TextBox>
&nbsp;<asp:RequiredFieldValidator ID="RequiredFieldValidator3" runat="server" 
        ControlToValidate="TextBox3" Display="Dynamic" 
        ErrorMessage="Pincode Required !!!"></asp:RequiredFieldValidator>
&nbsp;<asp:RegularExpressionValidator ID="RegularExpressionValidator1" 
        runat="server" ControlToValidate="TextBox3" Display="Dynamic" 
        ErrorMessage="Must be Valid Pincode !!!" ValidationExpression="\d{6}"></asp:RegularExpressionValidator>
    <br />
    <br />
    <asp:Label ID="Label5" runat="server" Text="Age :"></asp:Label>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    <asp:TextBox ID="TextBox4" runat="server"></asp:TextBox>
    <asp:RequiredFieldValidator ID="RequiredFieldValidator4" runat="server" 
        ControlToValidate="TextBox4" Display="Dynamic" ErrorMessage="Age Required !!!"></asp:RequiredFieldValidator>
&nbsp;<br />
    <br />
    <asp:Label ID="Label6" runat="server" Text="City :"></asp:Label>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    <asp:DropDownList ID="DropDownList1" runat="server">
        <asp:ListItem Selected="True" Value="" >Select</asp:ListItem>
        <asp:ListItem >Botad</asp:ListItem>
        <asp:ListItem>Gadhada</asp:ListItem>
        <asp:ListItem>Ranpur</asp:ListItem>
        <asp:ListItem>Barwala</asp:ListItem>
    </asp:DropDownList>
    &nbsp;<asp:RequiredFieldValidator ID="RequiredFieldValidator5" runat="server" 
        ControlToValidate="DropDownList1" ErrorMessage="City Requried !!!" 
        Display="Dynamic"></asp:RequiredFieldValidator>
    <br />
    <br />
    <asp:Label ID="Label7" runat="server" Text="Gender :"></asp:Label>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    <asp:RadioButton ID="RadioButton1" runat="server" GroupName="genderGroup" 
        Text="Male" />
&nbsp;&nbsp;&nbsp;
    <asp:RadioButton ID="RadioButton2" runat="server" GroupName="genderGroup" 
        Text="Female" />
    &nbsp;
    <asp:CustomValidator ID="CustomValidator1" runat="server" 
        ErrorMessage="CustomValidator" Display="Dynamic" 
        onservervalidate="CustomValidator1_ServerValidate"></asp:CustomValidator>
    <br />
    <br />
    <asp:Label ID="Label8" runat="server" Text="Education"></asp:Label>
&nbsp;:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    <asp:CheckBox ID="CheckBox1" runat="server" Text="BCA" />
&nbsp;&nbsp;
    <asp:CheckBox ID="CheckBox2" runat="server" Text="MCA" />
&nbsp;&nbsp;
    <asp:CheckBox ID="CheckBox3" runat="server" Text="MSC (IT)" />
    &nbsp;
    <asp:CustomValidator ID="CustomValidator2" runat="server" 
        ErrorMessage="Select Course !!!" Display="Dynamic" 
        onservervalidate="CustomValidator2_ServerValidate"></asp:CustomValidator>
    <br />
    <br />
    <asp:Label ID="Label9" runat="server" Text="Password :"></asp:Label>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    <asp:TextBox ID="TextBox5" runat="server" TextMode="Password"></asp:TextBox>
    &nbsp;
    <asp:RequiredFieldValidator ID="RequiredFieldValidator6" runat="server" 
        ControlToValidate="TextBox5" Display="Dynamic" 
        ErrorMessage=" Password Required !!!"></asp:RequiredFieldValidator>
    <br />
    <br />
    Confirm Password:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;     <asp:TextBox ID="TextBox6" runat="server" TextMode="Password"></asp:TextBox>
    <asp:RequiredFieldValidator ID="RequiredFieldValidator7" runat="server" 
        ControlToValidate="TextBox6" Display="Dynamic" 
        ErrorMessage="Conform Password Required !!!"></asp:RequiredFieldValidator>
    &nbsp;<asp:CompareValidator ID="CompareValidator1" runat="server" 
        ControlToCompare="TextBox5" ControlToValidate="TextBox6" Display="Dynamic" 
        ErrorMessage="Password Must Be same !!!"></asp:CompareValidator>
    <br />
    <br />
    <asp:Label ID="Label10" runat="server" Text="Email :"></asp:Label>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    <asp:TextBox ID="TextBox7" runat="server"></asp:TextBox>
    &nbsp;<asp:RequiredFieldValidator ID="RequiredFieldValidator8" runat="server" 
        ControlToValidate="TextBox7" Display="Dynamic" 
        ErrorMessage="Email Required !!!"></asp:RequiredFieldValidator>
    &nbsp;<asp:RegularExpressionValidator ID="RegularExpressionValidator4" 
        runat="server" ControlToValidate="TextBox7" Display="Dynamic" 
        ErrorMessage="Valid Email !!!" 
        ValidationExpression="\w+([-+.']\w+)*@\w+([-.]\w+)*\.\w+([-.]\w+)*"></asp:RegularExpressionValidator>
    <br />
    <br />
    Mobile Number :&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;     <asp:TextBox ID="TextBox8" runat="server"></asp:TextBox>
    &nbsp;<asp:RequiredFieldValidator ID="RequiredFieldValidator10" runat="server" 
        ControlToValidate="TextBox8" Display="Dynamic" 
        ErrorMessage="Mobile Number Reauired !!!"></asp:RequiredFieldValidator>
    &nbsp;<asp:RegularExpressionValidator ID="RegularExpressionValidator2" 
        runat="server" ControlToValidate="TextBox8" Display="Dynamic" 
        ErrorMessage="Must be valid 10 digit" ValidationExpression="^\d{10}$"></asp:RegularExpressionValidator>
    <br />
    <br />
    <asp:CheckBox ID="CheckBox4" runat="server" Text="I Agree" />
    
    <asp:CustomValidator ID="CustomValidator3" runat="server" 
        ErrorMessage="Agree tearms &amp; conditions" 
        onservervalidate="CustomValidator3_ServerValidate"></asp:CustomValidator>
    
    <br />
    <br />
    <asp:Button ID="Button1" runat="server" 
        style="margin-left: 81px; height: 26px;" Text="Submit" 
        Width="149px" onclick="Button1_Click" />
</form>
</body>
</html>
