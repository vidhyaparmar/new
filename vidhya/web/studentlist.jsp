<%-- 
    Document   : studentlist
    Created on : Feb 8, 2016, 11:09:39 AM
    Author     : sapna
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="newpackage.clsmath"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
 <%
    clsmath obj2=new clsmath();
    ResultSet rs=obj2.display();
%>
<html>
    <head>
        <style>
         
         body{
            font-family: "times new roman" ;
            font-size: 20px;
            background-image:url("Images/book2.jpg");
         
        
} </style>
      <title>welcome second  Page</title>
    </head>
    <body  text="black" >
    <center>
        <div class="background"></div>
        <h1>List of registered student</h1>
        <table border="3px" > 
                <tr>
                <td>
               link  
                </td>
                <td>
               Student id 
                </td>

                <td>
                Student Name
                </td>
                <td>
                Mobile Number
                </td>
                <td>
               Email Id 
                </td>
                <td>
                Qualification
                </td>
                <td>
               Password
                </td>
                
                
                </tr>
                <%
           while(rs.next())
           {%>
            <tr>
                <td>
                 <a href="signin.jsp?PKID=<%=rs.getString("userid")%>"><h3>select </h3> </a>
                </td>
                 <td>
                       <%=rs.getString("userid")%>
                </td>
        
                <td>
                    <%=rs.getString("name")%>
                </td>
        
                <td>
                    <%=rs.getString("phoneno")%>
                </td>
        

            <td>
                <%=rs.getString("emailid")%>
           </td>
            <td>
                <%=rs.getString("addresss")%>
          </td>
           <td>
               <%=rs.getString("password")%>
          </td>
          
         </tr>
 
   
<%}%>
 </table>
 </center>
  </body>
</html>

