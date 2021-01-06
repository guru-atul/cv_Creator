<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>cv_Creater</title>
<link href="css/showhide.css" rel="stylesheet">
  <link href="img/login.png" rel="icon">

<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js"></script>
<script src="js/showhide.js"></script>
<style type="text/css">
.email{
padding:7px;
width:100%;
height:40px;
margin-top:15px;
font-size:18px
}
</style>

</head>
<body>


<div id="main">
<!-- Create Div First For Login Form -->
<div id="first">
<h3>Login Here</h3>
<form action="com.cv.services.ServiceLogin" method="post">
<input id="loginemail" placeholder="Email"  name="email" class="email" type="text">
<input id="loginpassword" placeholder="Password" name="password" class="in" type="password">
<input class="b" type="submit" value="Sign In">
<p id="one"><a href="password_reset">Forgot Password ?</a></p>
<p id="two">Don't have account? <a class="signup" href="#" id="signup">Sign up here</a></p>
<br>
<center> <a class="signup" href="index.html" id="signup">Go to Home</a></center>
</form>
</div>
<!-- Create Div Second For Signup Form-->
<div id="second">
<h3>Sing up here</h3>
<form action="com.cv.services.ServiceRegister"  method="post" name="form">
<input  placeholder="Full Name" class="in" name="name" type="text"title="Format: Xx[space]Xx (e.g. Himanshu Vyas)" autofocus autocomplete="off" required pattern="^\w+\s\w+$">
<input  placeholder="Email"  class="email" name="email" type="email">
<input  placeholder="Password" class="in" name="password" type="password" title="Password min 8 characters. At least one UPPERCASE and one lowercase letter" required pattern="(?=^.{8,}$)(?=.*[a-z])(?=.*[A-Z])(?!.*\s).*$">
<input id="contact" placeholder="Contact Number" class="in" name="contact" type="text" pattern="[0-9]{10}" maxlength="10">
<input  type="submit" class="b" value="Create your account">
<p id="two">Already have an account? <a class="signin" href="#" id="signin">Sign in</a></p>
<br>
<center> <a class="signup" href="index.html" id="signup">Go to Home</a></center>
</form>
</div>
</div>



</body>
</html>