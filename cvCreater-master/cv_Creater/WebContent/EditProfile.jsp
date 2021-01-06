<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Dashboard</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
<link href="css/showhide.css" rel="stylesheet">
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js"></script>
<script src="js/showhide.js"></script>
<style>
.navbar .navbar-nav {
    color:white;
    font-size: 18px;
    margin: 8px 0;
    float:right;
}

.navbar  .navbar-brand {
    color: white !important;
    font-size: 25px;
    margin: 8px 0;
}

.navbar  .nav-link{
color:white;
}

.button {
    background:none!important;
     border:none; 
     padding:0!important;
    
    /*optional*/
    font-family:arial,sans-serif; /*input has OS specific font-family*/
     color:white;
     text-decoration:none;
     cursor:pointer;
}

.button:hover {
	text-decoration: underline;
	color: #069;
}



/* The Modal (background) */
.modal {
  display: none; /* Hidden by default */
  position: fixed; /* Stay in place */
  z-index: 1; /* Sit on top */
  padding-top: 100px; /* Location of the box */
  left: 0;
  top: 0;
  width: 100%; /* Full width */
  height: 100%; /* Full height */
  overflow: auto; /* Enable scroll if needed */
  background-color: rgb(0,0,0); /* Fallback color */
  background-color: rgba(0,0,0,0.4); /* Black w/ opacity */
}

/* Modal Content */
.modal-content {
  background-color: #fefefe;
  margin: auto;
  padding: 20px;
  border: 1px solid #888;
  width: 80%;
}

/* The Close Button */
.close {
  color: #aaaaaa;
;
  float: right;
  font-size: 40px;
  font-weight: bold;
}

.close:hover,
.close:focus {
  color: red;
  text-decoration: none;
  cursor: pointer;
}
    
     .btn{
 background-color:grey;
 border-radius:5px;
 border-color:white;
 height:35px;
 width:100px;
 font-style:color="white";
 }
 
 .btn:hover{
 background-color:#4CAF50;
 }

.b{
background:linear-gradient(to bottom,#22abe9 5%,#36caf0 100%);
box-shadow:inset 0 1px 0 0 #7bdcf4;
border:1px solid #0F799E;
color:#fff;
width:306px;
height:40px;
margin-top:15px;
font-size:18px;
font-weight:700;
cursor:pointer;
text-shadow:0 1px 0 #13506D
	
}

.txt{
 width:306px;
 height:50px;
 padding:10px 8px;
 border-radius:15px;
 border-color:transparent;
 font-size: 15px;
 }

<link href="showhide.css" rel="stylesheet">

</style>

</head>
<body onload="noback();" onpageshow="if (event.persisted) noback();" onunload="">
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js"></script>
<script src="showhide.js"></script>


<% 

response.setHeader("Cache-Control","no-cache");
response.setHeader("Cache-Control","no-store");
response.setDateHeader("Expires", 0);
response.setHeader("Pragma","no-cache");


String name=(String)session.getAttribute("name");
String id=(String)session.getAttribute("id");
if(name==null&&id==null){
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






<nav class="navbar navbar-expand-sm  bg-dark  fixed-top ">
  <a class="navbar-brand" href="#">cv_Creater</a>
  <ul class="navbar-nav">

    <li class="nav-item">
      <a class="nav-link" href="#"> </a>
    </li>

    <li class="nav-item">
      <a class="nav-link" href="#"> </a>
    </li>

    <li class="nav-item">
      <a class="nav-link" href="#"> </a>
    </li>

    <li class="nav-item">
      <a class="nav-link" href="#"> </a>
    </li>
    <li class="nav-item">
      <a class="nav-link" href="#"> </a>
    </li>

    <li class="nav-item">
      <a class="nav-link" href="#"> </a>
    </li>
    <li class="nav-item">
      <a class="nav-link" href="#"> </a>
    </li>

    <li class="nav-item">
      <a class="nav-link" href="#"> </a>
    </li>
    <li class="nav-item">
      <a class="nav-link" href="#"> </a>
    </li>

    <li class="nav-item">
      <a class="nav-link" href="#"> </a>
    </li>
    <li class="nav-item">
      <a class="nav-link" href="#"> </a>
    </li>

    <li class="nav-item">
      <a class="nav-link" href="#"> </a>
    </li>
    <li class="nav-item">
      <a class="nav-link" href="#"> </a>
    </li>

    <li class="nav-item">
      <a class="nav-link" href="#"> </a>
    </li>
    <li class="nav-item">
      <a class="nav-link" href="#"> </a>
    </li>

    <li class="nav-item">
      <a class="nav-link" href="#"> </a>
    </li>
    <li class="nav-item">
      <a class="nav-link" href="#"> </a>
    </li>

    <li class="nav-item">
      <a class="nav-link" href="#"> </a>
    </li>
    <li class="nav-item">
      <a class="nav-link" href="#"> </a>
    </li>

    <li class="nav-item">
      <a class="nav-link" href="#"> </a>
    </li>
    <li class="nav-item">
      <a class="nav-link" href="#"> </a>
    </li>

    <li class="nav-item">
      <a class="nav-link" href="#"> </a>
    </li>
    <li class="nav-item">
      <a class="nav-link" href="#"> </a>
    </li>

    <li class="nav-item">
      <a class="nav-link" href="#"> </a>
    </li>
    <li class="nav-item">
      <a class="nav-link" href="#"> </a>
    </li>

    <li class="nav-item">
      <a class="nav-link" href="#"> </a>
    </li>
    <li class="nav-item">
      <a class="nav-link" href="#"> </a>
    </li>

    <li class="nav-item">
      <a class="nav-link" href="#"> </a>
    </li>
    <li class="nav-item">
      <a class="nav-link" href="#"> </a>
    </li>

    <li class="nav-item">
      <a class="nav-link" href="#"> </a>
    </li>
    <li class="nav-item">
      <a class="nav-link" href="#"> </a>
    </li>

    <li class="nav-item">
      <a class="nav-link" href="#"> </a>
    </li>


    <li class="nav-item">
      <a class="nav-link" href="#"> </a>
    </li>

    <li class="nav-item">
      <a class="nav-link" href="#"> </a>
    </li>

    <li class="nav-item">
      <a class="nav-link" href="#"> </a>
    </li>

    <li class="nav-item">
      <a class="nav-link" href="#"> </a>
    </li>


    <li class="nav-item">
      <a class="nav-link" href="#"> </a>
    </li>

    <li class="nav-item">
      <a class="nav-link" href="#"> </a>
    </li>

    <li class="nav-item">
      <a class="nav-link" href="#"> </a>
    </li>

    <li class="nav-item">
      <a class="nav-link" href="#"> </a>
    </li>

    <li class="nav-item">
      <a class="nav-link" href="#"> </a>
    </li>

    <li class="nav-item">
      <a class="nav-link" href="#"> </a>
    </li>

    <li class="nav-item">
      <a class="nav-link" href="#"> </a>
    </li>

    <li class="nav-item">
      <a class="nav-link" href="#"> </a>
    </li>

    <li class="nav-item">
      <a class="nav-link" href="#"> </a>
    </li>

    <li class="nav-item">
      <a class="nav-link" href="#"> </a>
    </li>

    <li class="nav-item">
      <a class="nav-link" href="#"> </a>
    </li>

    <li class="nav-item">
      <a class="nav-link" href="#"> </a>
    </li>

    <li class="nav-item">
      <a class="nav-link" href="#"> </a>
    </li>

    <li class="nav-item">
      <a class="nav-link" href="#"> </a>
    </li>

    <li class="nav-item">
      <a class="nav-link" href="#"> </a>
    </li>





    <li class="nav-item">
      <a class="nav-link" href="#"> </a>
    </li>



    <li class="nav-item">
      <a class="nav-link" href="ServiceProfile">Home</a>
    </li>


    <li class="nav-item">
      <a class="nav-link" href="#"> </a>
    </li>



<!-- The Modal -->
<div id="myModal" class="modal">

  <!-- Modal content -->
<div id="main">
<!-- Create Div First For Login Form -->
<div id="first">
   <span class="close" title="close the tab">&times;</span>
  <form action="com.cv.templates.temp1" method="post">
  <br>
  <br>
  

<center><input name="filename" placeholder="File Name"  class="txt" type="text" title="Save your cv with your desired name." required><br>
<input  type="submit" class="b" value="Save">
<br>
<br>
</center>
</form>
</div>
  </div>
     </div>

    <li class="nav-item">
      <a class="nav-link" href="Information">Create</a>
    </li>

    <li class="nav-item">
      <a class="nav-link" href="#"> </a>
    </li>



    <li class="nav-item">
      <a class="nav-link" href="#">Open</a>
    </li>


    <li class="nav-item">
      <a class="nav-link" href="#"> </a>
    </li>




<li class="nav-item dropdown">
      <a class="nav-link dropdown-toggle" href="#" id="navbardrop" data-toggle="dropdown">
       <%out.println(name); %>
      </a>
      
      
      <div class="dropdown-menu">
        <a class="dropdown-item" href="#">Edit Account info</a>
        <a class="dropdown-item" href="com.cv.services.ServiceLogout">Logout</a>
      </div>
    
    </li>

  </ul>
  
  
  
</nav>




<div class="container-fluid" style="margin-top:80px">
<div id="main">
<!-- Create Div First For Login Form -->
<div id="first">
<font size="3"><a href="password_reset">Change Password</a></font><br>
<font size="3"><a href="email_reset">Change Email</a></font>
<form action="com.cv.services.ResetPassword" method="post">
</form>
</div>
</div>
</div>


	





<SCRIPT type="text/javascript">
window.history.forward();
function noBack() { window.history.forward(); }



//Get the modal
var modal = document.getElementById('myModal');

// Get the button that opens the modal
var btn = document.getElementById("myBtn");

// Get the <span> element that closes the modal
var span = document.getElementsByClassName("close")[0];

// When the user clicks the button, open the modal 
btn.onclick = function() {
  modal.style.display = "block";
}

// When the user clicks on <span> (x), close the modal
span.onclick = function() {
  modal.style.display = "none";
}

// When the user clicks anywhere outside of the modal, close it
window.onclick = function(event) {
  if (event.target == modal) {
    modal.style.display = "none";
  }
}


$("#folderName").change(function() {
        var sourceVal = document.getElementById("folderName").files[0].path;
        $("#sourceDirPath").val(sourceVal);
    });


</SCRIPT>

</body>
</html>