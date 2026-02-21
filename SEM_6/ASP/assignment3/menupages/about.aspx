<%@ Page Language="C#" AutoEventWireup="true" CodeFile="about.aspx.cs" Inherits="menupages_about" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title>Untitled Page</title>
</head>
<body>
    <form id="form1" runat="server">
    <asp:Menu ID="Menu1" runat="server" Orientation="Horizontal" 
        style="margin-bottom: 0px">
        <StaticMenuStyle Width="250px" />
        <StaticSelectedStyle BackColor="#CC66FF" ForeColor="White" 
            HorizontalPadding="10px" Width="50px" />
        <StaticMenuItemStyle ForeColor="#0033CC" ItemSpacing="5px" />
        <DynamicHoverStyle BackColor="#CCFFFF" ForeColor="#0099FF" />
        <StaticHoverStyle BackColor="#CCFFFF" />
        <Items>
            <asp:MenuItem NavigateUrl="~/assign3_menu.aspx" Text="Home" 
                Value="Home"></asp:MenuItem>
            <asp:MenuItem NavigateUrl="~/menupages/about.aspx" Text="About" Value="About" 
                Selected="True">
            </asp:MenuItem>
            <asp:MenuItem Text="Men" Value="Men">
                <asp:MenuItem NavigateUrl="~/menupages/shirt.aspx" Text="Shirts" Value="Shirts">
                </asp:MenuItem>
                <asp:MenuItem NavigateUrl="~/menupages/tshirt.aspx" Text="T-Shirts" 
                    Value="T-Shirts"></asp:MenuItem>
                <asp:MenuItem NavigateUrl="~/menupages/jeans.aspx" Text="Jeans" Value="Jeans">
                </asp:MenuItem>
            </asp:MenuItem>
            <asp:MenuItem Text="Woman" Value="Woman">
                <asp:MenuItem NavigateUrl="~/menupages/dresses.aspx" Text="Dresses" 
                    Value="Dresses"></asp:MenuItem>
                <asp:MenuItem NavigateUrl="~/menupages/tops.aspx" Text="Tops" Value="Tops">
                </asp:MenuItem>
                <asp:MenuItem NavigateUrl="~/menupages/handbags.aspx" Text="Handbags" 
                    Value="Handbags"></asp:MenuItem>
            </asp:MenuItem>
        </Items>
    </asp:Menu>
    <div>
    
    </div>
    </form>
</body>
</html>
