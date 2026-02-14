<%@ Page Language="C#" AutoEventWireup="true" CodeFile="treeviewdemo.aspx.cs" Inherits="treeviewdemo" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title>Tree View Demo</title>
</head>
<body>
    <form id="form1" runat="server">
    <div>
    
        <asp:TreeView ID="TreeView1" runat="server" ExpandDepth="0" >
            <ParentNodeStyle VerticalPadding="0px" />
            <HoverNodeStyle BackColor="#FF99CC" />
            <Nodes>
                <asp:TreeNode Text="BCA" Value="BCA">
                    <asp:TreeNode Text="SEM 1" Value="SEM 1">
                        <asp:TreeNode Text="C" Value="C"></asp:TreeNode>
                        <asp:TreeNode Text="MATHS" Value="MATHS"></asp:TreeNode>
                    </asp:TreeNode>
                    <asp:TreeNode Text="SEM 3" Value="SEM 3">
                        <asp:TreeNode Text="DFS" Value="DFS"></asp:TreeNode>
                        <asp:TreeNode Text="OS" Value="OS"></asp:TreeNode>
                    </asp:TreeNode>
                    <asp:TreeNode ShowCheckBox="False" Text="SEM 5" Value="SEM 5">
                        <asp:TreeNode Text="JAVA" Value="JAVA"></asp:TreeNode>
                        <asp:TreeNode Text="ORACLE" Value="ORACLE"></asp:TreeNode>
                    </asp:TreeNode>
                </asp:TreeNode>
            </Nodes>
        </asp:TreeView>
    
    </div>
    </form>
</body>
</html>
