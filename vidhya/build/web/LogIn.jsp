<%-- 
    Document   : LogIn
    Created on : 24 Sep, 2017, 1:02:53 AM
    Author     : vidhya
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Log In</title>
    </head>
     <style>
         body{
            
          //  opacity: 0.4;
            background-image:url("Images/book2.jpg");
        
} 
     #tab
    {
    border: 3px solid black;
    border-radius: 5px;
    width: 25%;
    padding:25px;
    }
     </style>
       
     <body >
     <center>
         <img src="Images/admin.jpg" >
           <form name="form1" action="verifyuser.jsp" method="post"> 
         <h1>LOGIN  ACCOUNT  </h1>
         
         <div border="7px" colour="red">
     <table id="tab"> 
         <tr>
           <td> 
                 <h3> User Name:</h3>
           </td> 
           <td>
               <input type="text" name="txtname" />
           </td>
       </tr>
        <tr>
        <td> 
               <h3> Password </h3>
        </td> 
           <td>
               <input type="password" name="txtpass1" /> 
           </td>
          
        </tr>
       
         </table>
         </div>
         </div>          
   
         <input type="submit" value="login" name="action"  onclick="cok()" /> 
     
               <a href="signin.jsp"> New User</a>
          
     
    
           </form>
     </center>
</body>
</html>
