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
        <title>JSP Page</title>
    </head>
    <body>
         
 <style>body{
            font-family: "times new roman" ;
            font-size: 20px;
            background-image:url("diamo.jpg");
             
          //  opacity: 50;
        
} </style>
    
    <center>
<%
int num1,rev=0,r;
        String str=request.getParameter("txtpal");
num1=Integer.parseInt(str);
  while(num1>0) 
        {
                {
                r=num1%10;    
                rev=rev*10+r;
                num1=num1/10;
                }
       
    }                                        
%>

<br>
    <br>
    <table>
        <tr>
            <td>
                <h1> 
                   <%out.println("PALINDROME  OF NUMBER IS  " +" " +rev);%>
              </h1>
            </td>
        </tr>
    </table>
    </center>
    </body>
</html>
    