<%-- 
    Document   : logoutbutton
    Created on : Apr 1, 2016, 3:29:25 AM
    Author     : sapna
--%>
<%
    String str1=request.getParameter("action1");
    
    if(str1.equals("logout"))
{ 
response.sendRedirect("mathsolu.jsp");
}
%>
<html>
    <h1>yes</h1>
</html>
