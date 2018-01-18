
<%@page contentType="text/html" pageEncoding="UTF-8"%>

 <!DOCTYPE html>
<html>
    <head>
        <title>Mathematical and Logical </title>>
    </head>
    <style>
   
body{
font-size:100%;
font-family:Arial,lucida sans unicode;
background-image:url("Images/book9.jpg");
line-height:1.5;
}
a{
text-decoration:none;
}
a:link,a:visited 
{
color:#CF5C3F;
}
a:hover,a:active
{
background-color:#CF5C3F;
color:white;
}
#head
{
 width:70%;
float:right;
border-radius:5px;
height:185px;
font-family:times new roman;
font-size:50px;
background:-webkit-linear-gradient(lightblue, white);
margin-top:2%;
padding-top:45px;
padding-left: 20px;
//alignment-adjust: central;
color:#CF5C3F;
}
#head marquee:hover
{
color:#666;
}
.body
{
margin: 0 auto;
width:70%;
}
.mainheader img
{
width:27%;
height:230px;
margin:2% 0;
border-radius:5px;
box-shadow:3px 3px 3px #333;
}


#link
{

font-size: 25px ;
border-radius:5px;
width:80%;
float:left;
margin-right:15px;
margin-top:5px;
}
</style>
    <body>
        <body  background="Images/gray.png" class="body">
         <div class="mainheader">
 <img src="Images/math.png" height="30%" width="30%"> 
<div id="head">
    <b> <marquee  behavior="alternate" >Mathematical Solution </marquee></b>
</div>




<form name="form1" action="logoutbutton.jsp" method="post">
    <input type="submit" value="logout"  name="action1"/>

</div>
        <div id="link">
<ul>

<b><li><a href="conversion.html">Number System </a></li>
    <li><a href="gradesyst.jsp">Result And Grading System</a></li>
    <li><a href="roots.jsp">Root of Equation</a></li>
    <li><a href="tempcon.jsp">Convert temperature Celsius to Fahrenheit</a></li>
    <li><a href="calculator.html">Calculator</a></li>
    <li><a href="area.html">Area of any Geometry shape</a></li>
   <li><a href="volume.jsp">Volume of any Geometry shape</a></li>
    <li><a href="factorial.jsp"> Find Factorial  </a></li>
    <li><a href="palindrom.jsp">Palindrome Number</a></li>
    <li><a href="evenodd.jsp"> Even or Odd </a></li>

     <li><a href="maximum.html">Maximum Number</a></li>
     <li><a href="minimum.html">Minimum Number</a></li>

<li><a href="armstrong.html">Armstrong number</a></li>
<li><a href="revstr.html">Reverse Number or String</a></li>

<li><a href="prime.html">Prime Number</a></li>
<li><a href="power.jsp">Calculate power</a></li>
<li><a href="simpleinterest.jsp">Simple Interest</a></li>


<li><a href="sqrt.html">Square Root</a></li>


    </form>
</ul>
</div>
    </body>

</html>
