<%@ Page Language="C#" AutoEventWireup="true" CodeFile="fileupload.aspx.cs" Inherits="fileupload" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title>Untitled Page</title>
</head>
<body>
    <form id="form1" runat="server">
    <div>
    
        <asp:Label ID="Label1" runat="server" Text="File Upload"></asp:Label>
        <br />
        <br />
        <asp:FileUpload ID="FileUpload1" runat="server" />
        <asp:Button ID="Button1" runat="server" style="margin-left: 26px" Text="Upload" 
            Width="94px" onclick="Button1_Click" />
    
        <br />
        <br />
        <asp:Label ID="Label2" runat="server" Text="Show Image"></asp:Label>
        <br />
        <br />
        <asp:Image ID="Image1" runat="server" Height="300px" style="margin-left: 295px" 
            Width="300px" />
    
    </div>
    </form>
</body>
</html>
