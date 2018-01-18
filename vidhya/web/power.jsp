
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript">
function doMath(){
var inputNum1=document.form1.input1.value;
var inputNum2=document.form1.input2.value;
var result = Math.pow(inputNum1, inputNum2);
document.form1.answer.value = result;
}
</script>
</head>
<body bgcolor=lightpink><center><br><br>
    <style> body{
            font-family: "times new roman" ;
            font-size: 20px;
            background-image:url("book11.jpg");
             
          //  opacity: 50;
        
} </style>
        
<form name=form1>
    <h1>Enter Base number:</h1>
<input type="text" name="input1" size=10>
<br>
<br>
<br>
<h1>Enter exponent to be raised to:</h1>
<input type="text" name="input2" size=10>
<input type="button" value="Calculate" onClick='doMath()'>
<br><br><br>
<h1>The result is:</h1>
<input type="text" name="answer" size=10>
</form></center>
</body>
</html>