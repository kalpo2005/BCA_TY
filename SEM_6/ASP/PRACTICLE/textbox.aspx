<%@ Page Language="C#" AutoEventWireup="true" CodeFile="textbox.aspx.cs" Inherits="textbox" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title>Untitled Page</title>
</head>
<body>
    <form id="form1" runat="server">
    <div>
           <asp:Label ID="Label1" runat="server" Text="simple"></asp:Label><br />
          <asp:TextBox ID="TextBox1" runat="server" Height="24px" style="margin-top: 8px"></asp:TextBox>    
    </div>
    
    <div>
           <asp:Label ID="Label2" runat="server" Text="Password"></asp:Label><br />
          <asp:TextBox ID="TextBox2" runat="server" Height="24px" style="margin-top: 8px" TextMode="Password"></asp:TextBox>    
    </div>
    
    <div>
           <asp:Label ID="Label3" runat="server" Text="multiline"></asp:Label><br />
          <asp:TextBox ID="TextBox3" runat="server" Height="50px" style="margin-top: 8px" 
               ontextchanged="TextBox3_TextChanged" TextMode="MultiLine" Rows="10" 
               Width="250px"></asp:TextBox>    
    </div>
    
    <div>
           <asp:Label ID="Label4" runat="server" Text="read only"></asp:Label><br />
          <asp:TextBox ID="TextBox4" runat="server" Height="24px" style="margin-top: 8px" 
               ReadOnly="True">Read Only value !!!</asp:TextBox>    
    </div>
    
    <div>
           <asp:Label ID="Label5" runat="server" Text="Fix Lenght"></asp:Label><br />
          <asp:TextBox ID="TextBox5" runat="server" Height="24px" style="margin-top: 8px" 
               MaxLength="10"></asp:TextBox>    
    </div>
    
      <div>
           <asp:Label ID="Label6" runat="server" Text="Columns"></asp:Label><br />
          <asp:TextBox ID="TextBox6" runat="server" Height="24px" style="margin-top: 8px" 
               MaxLength="0" Columns="5" Rows="0"></asp:TextBox>    
    </div>
    
      <div>
           <asp:Label ID="Label7" runat="server" Text="rows"></asp:Label><br />
          <asp:TextBox ID="TextBox7" runat="server" style="margin-top: 8px" 
               MaxLength="0" Rows="3" TextMode="MultiLine"></asp:TextBox>    
    </div>
   
    
    </form>
</body>
</html>
