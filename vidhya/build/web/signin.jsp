

<%@page import="newpackage.clsmath"%>
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
clsmath obj1=new clsmath();

if(request.getQueryString()!=null)
{
if(Integer.parseInt(request.getParameter("PKID"))>0);
{
obj1.userid=Integer.parseInt(request.getParameter("PKID"));
obj1.singleselect();
}
}
%>
<html>
    <head>
        <title> Sign Up </title>
        <script>
    
      function validate()
{


var cn= document.form1.txtphno.value.length ;
    
if(cn < 10)
{
     alert("Enter Valid Contact Info.");
        return false;
    
}
var c1=document.forms["form1"]["txtpass"].value;
var c2=document.forms["form1"]["txtreen"].value;
if(c1!==c2)
{
    alert("password does not match please enter correct password");
    return false;
}

               
    var x = document.forms["form1"]["txtemail"].value;
    var a = x.indexOf("@");
    var d = x.lastIndexOf(".");
  
   if ( a<1 || d<a+2 || d+2>=x.length)
   {
        alert("Not a valid e-mail address");
        return false;
             
   }
            else
          {
                     }
}
    
    
    
 </script>
 </head>
 <style>
     body{          
          background-image:url("Images/book1.jpg");
          opacity:50%;
         }
    #tab
    {
    border: 3px solid white;
    border-radius: 5px;
    width: 30%;
    margin-bottom: 10px;
    }
    </style>
     <body text="white" >
    
     <center>
         <img src="Images/admin.jpg" >
           <form name="form1" action="saveuser.jsp" method="post" onsubmit="return validate();" > 
         <h1>CREATE ACCOUNT    </h1>
         
    <div id="tab"> <table> 
         
             <tr><td></td></tr>
              <tr><td></td></tr>
       
       <tr>
           <td> 
               <h3>Student name:</h3>
           </td> 
           <td>
               <input type="text" name="txtname" value="<%=obj1.username%>" /> 
           </td>
       </tr>
       
       <tr><td></td></tr>
       <tr><td></td></tr>
       <tr>
           <td> 
               <h3>Mobile Number:</h3>
           </td>
           <td>
               <input type="text" name="txtphno" value="<%=obj1.mobileno%>" />
           </td>
       </tr>
        <tr><td></td></tr>
       <tr><td></td></tr>
       <tr> <td>
               <h3>Email Id:</h3>
         </td>
       <td>
           <input type="text" name="txtemail" value="<%=obj1.email%>"/>
       </td>
       </tr>
        <tr><td></td></tr>
       <tr><td></td></tr>
      <tr><td>
              <h3>Qualification:</h3></td>
          <td><input type="text" name="txtadd" value="<%=obj1.address%>"/></td>
      </tr>
      <tr><td></td></tr>
       <tr><td></td></tr>
      <tr><td>
              <h3>Password: </h3></td>
          <td><input type="password" name="txtpass" value="<%=obj1.password%>"/></td>
      </tr>
      <tr><td></td></tr>
       <tr><td></td></tr>
      <tr><td>
              <h3>Re-Enter:</h3></td>
          <td><input type="password" name="txtreen" /></td>
      </tr>
     </table>
      </div>
     
         <%if(request.getParameter("PKID")!=null)
{%>

     

   <input  type="submit" value="signin" name="action"/>    
    <input type="submit" value="delete" name="action"/><%}
  else{%>
        <input type="submit" style="width:70px" style="height:50px" value="save" name="action"/> 
        <%}%>
         <input type="submit" value="show" style="width:70px" style="height:50px" name="action"/>
         <a href="LogIn.jsp">You Already Have Account</a>
   </form>
     </center>
    </body>
</html>