<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="css/showhide.css" rel="stylesheet">
   <link href="img/email.png" rel="icon">

<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js"></script>
<script src="js/showhide.js"></script>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Forgot your email? .cv_Creater</title>
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
if(name==null||id==null){
	System.out.print("Attempt of Unauthenticated Access failed.");
	out.println("<script type=\"text/javascript\">");
	out.println("alert('You have to login first.');");
	out.println("location='Login';");
	out.println("</script>");
}
else{
	session.setAttribute("name", name);
	session.setAttribute("id", id);
/*     System.out.println("Successfully logged in now at profile key value are name is "+name+" and id is "+id);
 */}
%>


<div id="main">
<!-- Create Div First For Login Form -->
<div id="first">
<h3>Reset your Email Address</h3>
<form action="com.cv.services.ResetEmail" method="post" onSubmit="return Fun(this);">
<input  placeholder="enter your new email address" title="email address" name="newemail" id="new" class="email" type="email" required><br>
<input  placeholder="confirm your email address" title="email address" name="confirmemail" id="con" class="email" type="email" required><br>
<input class="b" type="submit" value="Reset Email">
<br>
<br>
<center><a href="ServiceProfile">Back to profile</a></center>
</form>
</div>
</div>



<script type="text/javascript">
function Fun(theForm) {
		if(theForm.newemail.value!=theForm.confirmemail.value){
		alert("Emails doesn't match");
	    return false;
	    }
	    
	else{
		return true;
	}
	}
</script>

</body>
</html>
