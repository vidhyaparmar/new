<%-- 
    Document   : disptempdisply
    Created on : Apr 3, 2016, 4:59:34 AM
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
        <style>
            body{
            font-family: "times new roman" ;
            font-size: 20px;
            background-image:url("book8.jpg");
} </style>
    
    <center>
   <%
 int cel,fer=0;
 String str=request.getParameter("txttemp");
        cel=Integer.parseInt(str);
      fer=(int) ((cel*1.8)+32);
      %>
  <br>
    <br>
    <table>
        <tr>
            <td>
                <h1> 
                   <%out.println("Temperature into ferhenite " +" " +fer);%>
              </h1>
            </td>
        </tr>
    </table>
    </center>     
    </body>
</html>
