<%-- 
    Document   : buttonaction
    Created on : Feb 8, 2016, 11:12:21 AM
    Author     : sapna
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>




<%@page import="newpackage.clsmath"%>

<%
clsmath obj=new clsmath();
 
obj.username=request.getParameter("txtname");
obj.mobileno=request.getParameter("txtphone");
obj.email=request.getParameter("txtemail");
obj.address=request.getParameter("txtadd");
obj.password=request.getParameter("txtpass");
//obj.reenter=request.getParameter("txtreen");
String str=request.getParameter("action");
if(str.equals("save"))
{ obj.insert();
response.sendRedirect("LogIn.jsp");
}
if(str.equals("delete"))
{
    obj.delete();
    response.sendRedirect("studentlist.jsp");
}
if(str.equals("show"))
{
 response.sendRedirect("studentlist.jsp");
}

%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sign Up</title>
    </head>
    <body>
        <h1>record inserted</h1>
    </body>
</html>
