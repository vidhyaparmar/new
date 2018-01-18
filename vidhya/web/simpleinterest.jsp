
<html>
<head>
<style>
#main
{
border:2px solid black;
height:30%;
padding:100px;
margin-left:400px;
margin-top:100px;
margin-right:400px;
border-radius:5px;
background-color:cyan;
}
h1
{
color:white;
margin-top:100px;
}
  body{
            font-family: "times new roman" ;
            font-size: 20px;
            background-image:url("diamo.jpg");
             
          //  opacity: 50;
        
} </style>
    

<script>
function calsi()
{

var p=document.f.d1.value;
var r=document.f.d2.value;
var t=document.f.d3.value;
var s=parseInt(p)*parseInt(r)*parseInt(t)/100;
alert("simple interest is:"+s);

}
</script>
 </head>
<body bgcolor="blue">
<h1 align="center" >SIMPLE INTEREST</h1>
<div id=main>
<form name="f">
<b>Principal amount:-</b><input type="text"  size="10" name="d1" ><br><br>
<b>Rate of interest:-</b><input type="text"  size="5" name="d2"><br><br>
<b>Time in year:-</b><input type="text"  size="5" name="d3"><br><br>
<b>Simple Interest:-</b><button onclick="calsi()"> click here</button>
<button type="reset">Reset</button>
</form>
</div>
</body></html>