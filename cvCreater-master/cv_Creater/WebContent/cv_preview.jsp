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
  <link href="img/dashboard.png" rel="icon">


<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js"></script>
<script src="js/showhide.js"></script>
<style>

table {
	table-layout: fixed;
	width: 100%;
	border-collapse: collapse;
    border:1px solid black;	
}

table td {
    
    font-size:20px;
    width: 25%;
	padding: 10px;
	text-align: center;
    border:1px solid black;	
     	
}
 
 table th{
    text-align: center;
    background-color:graytext;
      font-size: 20px;
      color: white;
    border:1px solid black;	
 }

table caption {
	font-style: italic;
}


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
  width: 100%;
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
width:130px;
cursor:pointer;
text-shadow:0 1px 0 #13506D
	
}

.b:hover{
background:linear-gradient(to bottom,#36caf0 5%,#22abe9 100%)
 }

.txt{
 width:306px;
 height:50px;
 padding:10px 8px;
 border-radius:15px;
 border-color:aqua;
 font-size: 15px;
 }
 


#f{
width:800px;
height:800px;
background-color:#F8F8FF;
border:1px solid;
border-radius:5px;
border-color:CBC8C8;
position:absolute;
left:50%;
margin-left:-180px;
top:0
}

<link href="showhide.css" rel="stylesheet">

body{
background-color:F1F1F1;
}



#first{
width:340px;
margin-top:0;
padding:28px 25px;
background-color:#F8F8FF;
border:1px solid;
border-radius:5px;
border-color:CBC8C8;
position:absolute;
left:50%;
margin-left:-180px;
top:0
}

.heading{
background-color:black;
color: white;
}

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
if(name==null||id==null){
	System.out.print("Attempt of Unauthenticated Access failed.");
	out.println("<script type=\"text/javascript\">");
	out.println("alert('You have to no access to this page directely.');");
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




    <li class="nav-item">
      <a class="nav-link" href="Information">Create</a>
    </li>

    <li class="nav-item">
      <a class="nav-link" href="#"> </a>
    </li>



    <li class="nav-item">
      <a class="nav-link" href="com.cv.showrecord.History">Open</a>
    </li>


    <li class="nav-item">
      <a class="nav-link" href="#"> </a>
    </li>




<li class="nav-item dropdown">
      <a class="nav-link dropdown-toggle" href="#" id="navbardrop" data-toggle="dropdown">
       <%out.println(name); %>
      </a>
      
      
      <div class="dropdown-menu">
        <a class="dropdown-item" href="password_reset">Change Password</a>
        <a class="dropdown-item" href="email_reset">Change Email</a>
        <a class="dropdown-item" href="com.cv.showrecord.Histroy_for_updation">Change Cv Info</a>
        <a class="dropdown-item" href="#">Cv Preview</a>
        <a class="dropdown-item" href="com.cv.services.ServiceLogout">Logout</a>
      </div>
    
    </li>

  </ul>
  
  
  
</nav>

<br>
<br>

<div class="container-fluid" style="margin-top:80px">

<div style="float: left;"><h3>User Name</h3></div>
<br>
<br>

<div style="float:left;">
Email: user email
<br>
Phone: user phone number
<br>
Address: user address
<br>

</div>
<br>
<br>
<br>
<br>

<table>
<tr><td class="heading"><font style="float: left;" face="Times New Roman">OBJECTIVE</font></td></tr>
</table>


<br>

<font style="float:left;">User objective</font>

<br>
<br>

<table>
<tr><td class="heading"><font style="float: left;" face="Times New Roman">EDUCATIONAL DETAILS</font></td></tr>
</table>
<br>


<table>
<tr>
<th>Dgree/Course</th>
<th>Institution</th>
<th>Year Of Passing</th>
<th>Percentage/Grade</th>
</tr>

<tr>
<td>10th</td>
<td>Institute Name</td>
<td>Year of Passing</td>
<td>Percentage</td>
</tr>

<tr>
<td>12th</td>
<td>Institute Name</td>
<td>Year of Passing</td>
<td>Percentage</td>
</tr>

<tr>
<td>Dgree</td>
<td>Institute Name</td>
<td>Year of Passing</td>
<td>Percentage</td>
</tr>
</table>

<br>
<table>
<tr><td class="heading"><font style="float: left;" face="Times New Roman">PROJECT DETAILS</font></td></tr>
</table>
<br>

<font style="float: left;font-weight: bold;color: black;" size="4px" face="times new roman">Title : </font>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
<font style="color: black; float: left;" size="4px"  face="times new roman"> Project Name</font><br>	

<br>

<font style="float: left;font-weight: bold;color: black;" size="4px" face="times new roman">Duration : </font>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
<font style="color: black; float: left;" size="4px"  face="times new roman"> Project Duration(in months)</font><br>	

<br>

<font style="float: left;font-weight: bold;color: black;" size="4px" face="times new roman">Description : </font>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
<font style="color: black; float: left;" size="4px"  face="times new roman"> Project Description</font><br>	

<br>

<table>
<tr><td class="heading"><font style="float: left;" face="Times New Roman">SKILLS</font></td></tr>
</table>
<br>
<ul style="float: left;color: black;">
<li><font face="times new roman" size="4px">Skill-1</font></li>
<li><font face="times new roman" size="4px">Skill-2</font></li>
<li><font face="times new roman" size="4px">Skill-3</font></li>
<li><font face="times new roman" size="4px">Skill-4</font></li>
<li><font face="times new roman" size="4px">Skill-5</font></li>
</ul>
<br>

<table>
<tr><td class="heading"><font style="float: left;" face="Times New Roman">INDUSTRIAL EXPOSURE</font></td></tr>
</table>
<br>

<font style="float: left;font-weight: bold;color: black;" size="4px" face="times new roman">Training : </font>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
<font style="color: black; float: left;" size="4px"  face="times new roman"> Training Name</font><br>	

<br>

<font style="float: left;font-weight: bold;color: black;" size="4px" face="times new roman">Institute : </font>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
<font style="color: black; float: left;" size="4px"  face="times new roman"> Training Institute </font><br>	

<br>

<font style="float: left;font-weight: bold;color: black;" size="4px" face="times new roman">Description : </font>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
<font style="color: black; float: left;" size="4px"  face="times new roman"> Training Description</font><br>	

<br>

<table>
<tr><td class="heading"><font style="float: left;" face="Times New Roman">ACHIEVEMENTS</font></td></tr>
</table>
<br>
<ul style="float: left;color: black;">
<li><font face="times new roman" size="4px">Achievement-1</font></li>
<li><font face="times new roman" size="4px">Achievement-2</font></li>
<li><font face="times new roman" size="4px">Achievement-3</font></li>
<li><font face="times new roman" size="4px">Achievement-4</font></li>
<li><font face="times new roman" size="4px">Achievement-5</font></li>
</ul>
<br>

<table>
<tr><td class="heading"><font style="float: left;" face="Times New Roman">HOBBIES</font></td></tr>
</table>
<br>
<ul style="float: left;color: black;">
<li><font face="times new roman" size="4px">Hobby-1</font></li>
<li><font face="times new roman" size="4px">Hobby-2</font></li>
<li><font face="times new roman" size="4px">Hobby-3</font></li>
<li><font face="times new roman" size="4px">Hobby-4</font></li>
<li><font face="times new roman" size="4px">Hobby-5</font></li>
</ul>
<br>

<table>
<tr><td class="heading"><font style="float: left;" face="Times New Roman">DECLARATION</font></td></tr>
</table>
<br>
<font style="float:left;">I hereby declare that the above-mentioned information is correct up to my knowledge and I bear the responsibility for the
correctness of the above-mentioned particulars.</font>
<br>
<br>

<font style="float: left;font-weight: bold;color: black;" size="4px" face="times new roman">Place : User Place </font>
<br>
<br>

<font style="float: left;font-weight: bold;color: black;" size="4px" face="times new roman">(Name)</font>
</div>
</body>
</html>