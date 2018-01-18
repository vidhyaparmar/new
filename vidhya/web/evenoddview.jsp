<%-- 
    Document   : displaypalind
    Created on : Apr 2, 2016, 9:42:39 PM
    Author     : sapna
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
       
    </head>
    <body>
        <style>
            body{
            font-family: "times new roman" ;
            font-size: 20px;
            background-image:url("book9.jpg");
             
          //  opacity: 50;
        
} 
        </style>
 
    <center>
<%
int num;
 String str1=request.getParameter("txteodd");
 num=Integer.parseInt(str1);
 if(num%2==0)
 {%>
 <br>
 <br>
 <h1><b><center><br>NUMBER IS EVEN</center></b></h1>
  out.println(num+" IS EVEN  NUMBER");<%}
  else{%>
  <h1>NUMBER IS ODD</h1>
  <%}%>
  

 
       
         </center>
    </body>
</html>
    