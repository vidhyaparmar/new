
<html>
<HEAD>

<SCRIPT LANGUAGE="JavaScript">
function findarea(){
radius = document.FORM1.areainput.value;
radius2 = eval(radius*radius);
answer = eval(Math.PI*Math.pow(radius,2))
roundanswer = Math.round(answer);
document.FORM1.codegenerator.value =
 'A = PIR^2\r'
+'A = PI x '+radius+'*'+radius+' \r'
+'A = PI x '+radius2+'\r'
+'A = '+answer+' \r'
+'A = '+roundanswer;
}
function findcircum(){
radiuscir = document.FORM1.areainput.value;
diameter = eval(radiuscir*2);
ciranswer = eval(radiuscir*2*Math.PI);
cirRoundanswer = Math.round(ciranswer);
document.FORM1.codegenerator.value =
 'C = 2PIR\r'
+'C = PI x 2 x '+radiuscir+' \r'
+'C = PI x '+diameter+' \r'
+'C = '+ciranswer+' \r'
+'C = '+cirRoundanswer;
}
function rectarea(){
side1 = document.FORM1.rect1.value;
side2 = document.FORM1.rect2.value;
rectanswer = eval(side1*side2);
roundrect = Math.round(rectanswer);
document.FORM1.codegenerator.value =
 'A = B x H\r'
+'A = '+side1+' x '+side2+' \r'
+'A = '+rectanswer+' \r'
+'A = '+roundrect
}
function cylarea(){
cylradius = document.FORM1.areainput.value;
sqradius = eval(cylradius*cylradius);
cylheight = document.FORM1.cylinderheight.value;
cylhr = eval(cylheight*sqradius);
cylvolume = eval(Math.PI*cylradius*cylradius*cylheight);
roundcyl = Math.round(cylvolume);
document.FORM1.codegenerator.value =
 'V = PIR^2H\r'
+'V = PI x '+cylradius+' x '+cylradius+' x H \r'
+'V = PI x '+sqradius+' x H\r'
+'V = PI x '+sqradius+' x '+cylheight+' \r'
+'V = PI x '+cylhr+' \r'
+'V = '+cylvolume+' \r'
+'V = '+roundcyl;
}
function resetval(){
document.FORM1.areainput.value = 'Radius of Cirlce/Cylinder';
document.FORM1.codegenerator.value = '';
document.FORM1.cylinderheight.value = 'Height of Cylinder';
document.FORM1.rect1.value = 'Base';
document.FORM1.rect2.value = 'Height';
}

</script>

</HEAD>



<BODY>
<style>body{
            font-family: "times new roman" ;
            font-size: 20px;
            background-image:url("diamo.jpg");
             
          //  opacity: 50;
        
} </style>
<div align="center">
<form name="FORM1">
<font face="Arial, Helvetica, Sans Serif"  color="black"><b>Enter Radius of Circle/Cylinder</b></font><br><input type="text" size="15" name="areainput" onfocus="this.value=''">
<br>
<input type="button" name="findcircumference" onclick="findcircum()" value="Get Circumference">
<input type="button" name="findarea2" onclick="findarea()" value="Get Area">
<p>
<font face="Arial, Helvetica, Sans Serif"  color="black"><b>Enter Height of Cylinder</b></font><br><input type="text" name="cylinderheight" onfocus="this.value=''">
<br><input type="button" name="cylinderarea" value="Get volume of Cylinder" onclick="cylarea()">
<br>(<i>Make sure you entered the radius</i>)
<p>
<font face="Arial, Helvetica, Sans Serif"  color="black"><b>Enter Measurments for Rectangle Area:</b></font>
<br>
<input type="text" name="rect1" value="Base" onfocus="this.value=''">
<br><input type="text" name="rect2" value="Height" onfocus="this.value=''">
<br><input type="button" name="findcircumference" onclick="rectarea()" value="Get Area">.

<input type="button" name="reset" value="Reset" onclick="resetval()"><br>
<font face="Arial, Helvetica, Sans Serif"  color="black"><b>The calculation and answer is below:</b></font><br>
<textarea name="codegenerator" rows="10" cols="30">
</textarea>
<p>

</form>
</div>
</body>
</html>

