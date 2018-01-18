<%-- 
    Document   : tabledisp
    Created on : Apr 3, 2016, 5:30:20 AM
    Author     : sapna
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <center>
        <%
        int num,n,i=1;
         String str=request.getParameter("txtetab");
       n=Integer.parseInt(str);
     while  (i<=10)
       {
           num=n*i;
           out.println("  "+num);
         i++;
       }
     %>
    </center>
    </body>
</html>
