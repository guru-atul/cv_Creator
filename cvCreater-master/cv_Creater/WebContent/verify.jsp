<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Verify</title>
<link href="css/showhide.css" rel="stylesheet">
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

<%
String pin=(String)session.getAttribute("key");
String email=(String)session.getAttribute("email");

/* System.out.println("value of pin is: "+pin);
System.out.println("value of email is: "+email);
 */
if(pin==null||email==null){
	System.out.print("Attempt of Unauthenticated Access failed.");
	out.println("<script type=\"text/javascript\">");
	out.println("alert('You have no access to this page directly.');");
	out.println("location='Login';");
	out.println("</script>");
	
}
else{
	session.setAttribute("key", pin);
    session.setAttribute("email", email);
}

%>


<div id="main">
<div id="first">
<h3>Reset your password</h3>
<form action="com.cv.services.ChangePassword"  method="post" onSubmit="return Fun(this);">
<input  placeholder="Verification Code" class="in" name="pin" type="text" title="Enter verfication code here." autofocus autocomplete="off" required pattern="[0-9]{6}" maxlength="6">
<input  placeholder="New Password" class="in" name="newpassword" type="password" title="Password min 8 characters. At least one UPPERCASE and one lowercase letter" required pattern="(?=^.{8,}$)(?=.*[a-z])(?=.*[A-Z])(?!.*\s).*$" id="con">
<input  placeholder="Confirm Password" class="in" name="confirmpassword" type="password" id="con" title="Password min 8 characters. At least one UPPERCASE and one lowercase letter">
<input  type="submit" class="b" value="Change Password">
<br>
<br>
<center> <a class="signup" href="com.cv.services.Resend_email" id="signup">Resend Code</a>
&nbsp&nbsp&nbsp
<a class="signup" href="index.html" id="signup">Go to Home</a></center>

</form>
</div>
</div>

<script type="text/javascript">
function Fun(theForm) {
		if(theForm.newpassword.value!=theForm.confirmpassword.value){
		alert("Passwords doesn't match");
	    return false;
	    }
	    
	else{
		return true;
	}
	}
</script>

</body>
</html>