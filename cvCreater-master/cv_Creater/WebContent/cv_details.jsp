<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="css/showhide.css" rel="stylesheet">
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js"></script>
<script src="js/showhide.js"></script>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Dashboard</title>
<style type="text/css">

.email{
padding:7px;
width:290px;
height:40px;
border-radius:5px;
border-color:CBC8C8;
outline:solid F1F1F1;
margin-top:15px;
font-size:18px
}

.b{
background:linear-gradient(to bottom,#22abe9 5%,#36caf0 100%);
box-shadow:inset 0 1px 0 0 #7bdcf4;
border:1px solid #0F799E;
border-radius:5px;
color:#fff;
width:306px;
height:40px;
margin-top:15px;
font-size:18px;
font-weight:700;
cursor:pointer;
text-shadow:0 1px 0 #13506D
	
}

</style>
</head>
<body>

<br>
<br>
<br>
<br>


<% 

response.setHeader("Cache-Control","no-cache");
response.setHeader("Cache-Control","no-store");
response.setDateHeader("Expires", 0);
response.setHeader("Pragma","no-cache");


String name=(String)session.getAttribute("name");
String id=(String)session.getAttribute("id");
String time=(String)session.getAttribute("time");
if(name==null||id==null||time==null){
	System.out.print("Attempt of Unauthenticated Access failed.");
	out.println("<script type=\"text/javascript\">");
	out.println("alert('You have to access to this page directely.');");
	out.println("location='ServiceProfile';");
	out.println("</script>");
}
else{
	session.setAttribute("name", name);
	session.setAttribute("id", id);
	session.setAttribute("time", time);
/*     System.out.println("Successfully logged in now at profile key value are name is "+name+" and id is "+id);
 */}
%>


<div id="main">
<!-- Create Div First For Login Form -->
<div id="first">
<h3>Save Your Cv</h3>
<form action="com.cv.templates.temp1" method="post">
<input type="hidden" value="">
<input  placeholder="enter name of your cv. " title="name" name="name"  class="email" type="text" required><br>
<input class="b" type="submit" value="Save">
<br>
<br>
<center><a href="ServiceProfile">Back to profile</a></center>
</form>
</div>
</div>



</body>
</html>
