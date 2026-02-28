<%@ Page Language="C#" AutoEventWireup="true"  CodeFile="Default.aspx.cs" Inherits="_Default" Theme="myTheme"  %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title>Untitled Page</title>
</head>
<body>
    <form id="form1" runat="server">
    <div>
   
    
        <asp:Button ID="Button1" runat="server"
            Text="Button" SkinID="btn1" />
&nbsp;
        <asp:Button ID="Button2" runat="server" SkinID="btn2" Text="Button" />
&nbsp;&nbsp;
        <asp:Button ID="Button3" runat="server" Text="Button" SkinID="btn1" />
        &nbsp;
        <asp:Button ID="Button4" runat="server" Text="Button"  SkinID="btn2" />
   
    
    </div>
    </form>
</body>
</html>
