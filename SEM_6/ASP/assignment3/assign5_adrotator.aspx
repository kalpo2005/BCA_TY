<%@ Page Language="C#" AutoEventWireup="true" CodeFile="assign5_adrotator.aspx.cs" Inherits="assign5_adrotator" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title>Adrotator</title>
</head>
<body>
    <form id="form1" runat="server">
    <div>
    
        <asp:Label ID="Label1" runat="server" Text="Ads"></asp:Label>
        <br />
        <br />
        <asp:AdRotator ID="AdRotator1" runat="server" AdvertisementFile="~/ads.xml" 
            Height="300px" Width="300px" />
    
    </div>
    </form>
</body>
</html>
