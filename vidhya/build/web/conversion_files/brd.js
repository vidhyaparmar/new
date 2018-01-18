 
var CSSpages=new Array( 
'style.css', 
'style2.css', 
'style3.css', 
'style4.css', 
'style5.css', 
'style6.css', 
'style7.css', 
'style8.css',
'style9.css',
'style10.css' 
); 
document.writeln('<link rel="stylesheet" type="text/css" href="' + CSSpages[Math.floor(Math.random()*(CSSpages.length))] + '">'); 