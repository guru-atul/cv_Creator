<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Save Cv</title>

<style type="text/css">
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

</style>
</head>
<body>
<center><button id="myBtn" class="b">Save cv</button></center>


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