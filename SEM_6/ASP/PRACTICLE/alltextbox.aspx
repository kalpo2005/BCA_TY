<%@ Page Language="C#" AutoEventWireup="true" CodeFile="alltextbox.aspx.cs" Inherits="alltextbox" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title>Untitled Page</title>
</head>
<body>
    <form id="form1" runat="server">
    <div>
        <asp:Label ID="Label1" runat="server" Text="Simple:"></asp:Label>
    
    
          <asp:TextBox ID="TextBox1" runat="server" Height="26px" style="margin-top: 9px; margin-left: 20px;" 
                     Width="211px"></asp:TextBox>
        
        </div>
        
        <div>
        <asp:Label ID="Label2" runat="server" Text="Multiline:"></asp:Label>
    
    
          <asp:TextBox ID="TextBox2" runat="server" Height="26px" style="margin-top: 9px; margin-left: 20px;" 
                     Width="211px" MaxLength="100" Rows="5" TextMode="MultiLine" 
                ontextchanged="TextBox2_TextChanged"></asp:TextBox>
        
        </div>
        
        <div>
        <asp:Label ID="Label3" runat="server" Text="Password:"></asp:Label>
    
    
          <asp:TextBox ID="TextBox3" runat="server" Height="26px" style="margin-top: 9px; margin-left: 20px;" 
                     Width="211px" TextMode="Password"></asp:TextBox>
        
        </div>
   
        <div>
        <asp:Label ID="Label4" runat="server" Text="maxlenght 10:"></asp:Label>
    
    
          <asp:TextBox ID="TextBox4" runat="server" Height="26px" style="margin-top: 9px; margin-left: 20px;" 
                     Width="211px" MaxLength="10" ontextchanged="TextBox4_TextChanged"></asp:TextBox>
        
        </div>
        
        <div>
        <asp:Label ID="Label5" runat="server" Text="Read Only:"></asp:Label>
    
    
          <asp:TextBox ID="TextBox5" runat="server" Height="26px" style="margin-top: 9px; margin-left: 20px;" 
                     Width="211px" ontextchanged="TextBox5_TextChanged" ReadOnly="True" value="fgfg"></asp:TextBox>
        
        </div>
    </form>
</body>
</html>
