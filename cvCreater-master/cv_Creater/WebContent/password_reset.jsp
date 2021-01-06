<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="css/showhide.css" rel="stylesheet">
   <link href="img/password.png" rel="icon">


<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js"></script>
<script src="js/showhide.js"></script>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Forgot your password? .cv_Creater</title>
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
session.invalidate();
%>


<div id="main">
<!-- Create Div First For Login Form -->
<div id="first">
<h3>Enter your email address and we will send you a link to reset your password.</h3>
<form action="com.cv.services.ResetPassword" method="post">
<input  placeholder="enter your email address" title="email address" name="email" class="email" type="email" required>
<input class="b" type="submit" value="Send password reset email">
<br>
<br>
<center><a href="index.html">Go to Home</a></center>
</form>
</div>
</div>

</body>
</html>
