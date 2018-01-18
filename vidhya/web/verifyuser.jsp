<%@page import="newpackage.clsmath"%>
<%-- 
    Document   : newjssignin
    Created on : Feb 8, 2016, 10:52:41 AM
    Author     : sapna
--%>


 
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
clsmath  obj3=new clsmath();
obj3.username=request.getParameter("txtname");
obj3.password=request.getParameter("txtpass1");
String str=request.getParameter("action");

if(str.equals("login"))
{
    ResultSet rs=obj3.check();
    if(rs.next())
    {
     
      // out.println(rs.getString("name"));
    response.sendRedirect("mathsecond.jsp");
    }
    else 
   
    {
        response.sendRedirect("signin.jsp");
    }
    
}
if(str.equals("show"))
    
response.sendRedirect("signin.jsp");

%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>LOG IN</title>
    </head>
    <body>
        <h1>inserted</h1>
    </body>
</html>
