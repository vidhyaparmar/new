
<html><SCRIPT LANGUAGE="JavaScript">

function quad(form) {
a=eval(form.a.value);
b=eval(form.b.value);
c=eval(form.c.value);
x1=-b/2/a+Math.pow(Math.pow(b,2)-4*a*c,0.5)/2/a;
x2=-b/2/a-Math.pow(Math.pow(b,2)-4*a*c,0.5)/2/a;
form.x1.value = x1;
form.x2.value = x2;
if (form.x1.value == "NaN") form.x1.value="Imag.!";
if (form.x2.value == "NaN") form.x2.value="Imag.!";
}

</SCRIPT>

<body >
    <style>body{
            font-family: "times new roman" ;
            font-size: 20px;
            background-image:url("book13.jpg");
             
          //  opacity: 50;
        
} 
#tab
    {
    border: 4px solid black;
    border-radius: 5px;
    width: 25%;
    padding:25px;
    }
        </style>
        <br>
        <br>
        <br>
         
<center>
<form name=form>
<table border=2  id="tab" cellpadding=2 style="backgroundcolor:lightpink">
<tr>
<td colspan=2 align=center><b>Quadratic Equation:<br>Ax<sup>2</sup> + Bx + C = 0</b></td>
</tr>
<tr>
<td>
<center><table border=2 width=20% cellpadding=1>
        <tr><td>1</td>
<td align=center><b>A </b></td>
<td align=center><input type=text size=6 name="a"></td>
</tr>
<tr><td></td></tr>
<tr><td></td></tr>
<tr><td>2</td>
<td align=center><b>B </b></td>
<td align=center><input type=text size=6 name="b"></td>
</tr>

<tr><td></td></tr>
<tr><td></td></tr>
<tr><td>3</td>
<td align=center><b>C  </b></td>
<td align=center><input type=text size=6 name="c"></td>
</tr>
<tr><td></td></tr>
<tr><td></td></tr>
</table>
</td>
<td>
<center><table border=1 width=100% cellpadding=2>
<tr>
<td colspan=2 align=center>
<input type=button value="Solve" onClick="quad(this.form)"></td>
</tr>
<tr>
<td align=center><b>X1 = </b></td>
<td align=center><input type=text size=6 name="x1"></td>
</tr>
<tr>
<td align=center><b>X2 = </b></td>
<td align=center><input type=text size=6 name="x2"></td>
</tr>
</table>
</td>
</tr>
</table>
</form>
</center>
</body>
</html>