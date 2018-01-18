
<!DOCTYPE html>
<html>
<head>
<title>Registration Form</title>
<script type = "text/javascript">
    function calc()
    {
        var m1,m2,m3,m4,m5,avg = 0,total = 0, result = "",grade = "";
        m1 = parseInt(document.form1.ae.value);
        m2 = parseInt(document.form1.sp.value);
        m3 = parseInt(document.form1.cg.value);
        m4 = parseInt(document.form1.nad.value);
        m5 = parseInt(document.form1.ca.value);
        total = m1+m2+m3+m4+m5;
        avg = total/5;
        if( m1 < 35 || m2 < 35 || m3 < 35 || m4 < 35 || m5 < 35)
        {
            result = "fail";
            grade = "D";
        }
        else if(avg >= 75)
        {
            result = "Distinction";
            grade = "A+";
        }
        else if(avg >= 60 && avg < 75)
        {
            result = "First class";
            grade = "A";
        }
        else if(avg >= 50 && avg < 60)
        {
            result = "Second class";
            grade = "B";
        }
        else if(avg >=35 && avg < 50)
        {
            result = "Pass class";
            grade = "C";
        }
        else  if (avg < 35)
        {
            result = "Fail";
            Grade = "D";
        }
        document.form1.result.value = result;
        document.form1.grade.value = grade;
        document.form1.total.value = total;
        document.form1.average.value = avg;
        
    }
</script>
</head>
<body >
<style>body{
            font-family: "times new roman" ;
            font-size: 20px;
            background-image:url("diamo.jpg");
             
          //  opacity: 50;
        
} 
        </style>
<center><br><br><br>
    <form name = "form1">
        <table border = "1">
            <tr>
                <td> Student Name</td>
                <td><input type = "text"  /></td>
            </tr>
            <tr>
                <td colspan = "2" align = "center">Subject Marks</td>
            </tr>
            <tr>
                <td>analog electronics</td>
                <td><input type = "text" name = "ae" /></td>
            </tr>
            <tr>
                <td>Computer Graphics</td>
                <td><input type = "text" name = "cg" /></td>
            </tr>
            <tr>
                <td>System Programming</td>
                <td><input type = "text" name = "sp" /></td>

            </tr>
             <tr>
                <td>numerical analysis</td>
                <td><input type = "text" name = "nad" /></td>

            </tr>
             <tr>
                <td>copmputer architecture</td>
                <td><input type = "text" name = "ca" /></td>

            </tr>
            <tr>
                <td colspan = "2" align = "center"><input type = "button"   onclick = "calc()" value = "calculte" /></td>
            </tr>            
            <tr>
                <td>Total</td>
                <td><input type = "text" name = "total"/></td>

            </tr>
            <tr>
                <td>Average</td>
                <td><input type = "text" name = "average" /></td>
            </tr>
            <tr>
                <td>Result</td>
                <td><input type = "text" name = "result" /></td>
            </tr>
            <tr>
                <td>Grade</td>
                <td><input type = "text" name = "grade"/></td>
            </tr>

        </table>
    </form></center>
</body>
</html>