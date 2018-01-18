<%-- 
    Document   : display
    Created on : Feb 16, 2016, 1:37:09 AM
    Author     : sapna
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html><f:view xmlns:h="http://java.sun.com/jsf/html" xmlns:f="http://java.sun.com/jsf/core">
    <h:form>
    </h:form>
</f:view>

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
      int n=0,fact =1;
      
   //   fact obj1=new fact();
 //obj1.fact1= Integer.parseInt(request.getParameter("txtfact1"));
String str=request.getParameter("txtfact1");
    n=Integer.parseInt(str);
if(n>1)
{fact=1;
for(int i=1;i<=n;i++)
    {
       fact=(fact*i);
      
      }

       
}
  
 

  %>  
    <br>
    <br>
    <table>
        <tr>
            <td>
                <h1> <%out.println("factorial of no is  " +" " +fact);
                %></h1>
            </td>
        </tr>
    </table>
    </center>
        
    </body>
</html>
