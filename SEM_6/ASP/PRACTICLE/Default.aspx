<%@ Page Language="C#" AutoEventWireup="true"  CodeFile="Default.aspx.cs" Inherits="_Default" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title>Form</title>
   
   <style>
       
       .groupform
       {
       	    margin-top:10px;
       }
       
    .textbox {
    	margin-botom:10px;
    	margin-left: 35px;
    }
    .label
    {
    	width:30px;
    }
    
   </style>
    
</head>
<body style="width: 2">
    <p>
        &nbsp;</p>
    <form id="form1" runat="server">
  <div class ="groupform">
    <asp:Label ID="Label1" runat="server" Text="surname" class="label" Width="100px"></asp:Label>

    <asp:TextBox ID="TextBox1" runat="server" class="textbox" Width="255px"></asp:TextBox><br />
  </div>
  
   <div class ="groupform">
    <asp:Label ID="Label2" runat="server" Text="first name" class="label" Width="100px"></asp:Label>

    <asp:TextBox ID="TextBox2" runat="server" class="textbox" Width="255px"></asp:TextBox><br />
  </div>
  
   <div class ="groupform">
    <asp:Label ID="Label3" runat="server" Text="middle name" class="label" 
           Width="100px"></asp:Label>
       <asp:TextBox ID="TextBox3" runat="server" class="textbox" Width="255px"></asp:TextBox>
       <br />
       <asp:Button ID="Button1" runat="server" Text="Button" Height="33px" 
           onclick="Button1_Click" style="margin-left: 106px; margin-top: 15px" 
           Width="132px" />
       <br />
  </div>
  
</form>
</body>
</html>
