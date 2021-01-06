<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Quick Cv</title>
  <link href="css/collapsible.css" rel="stylesheet">
   <link href="img/cv.png" rel="icon">

 <style>
 
.chk{
height: 15px;
width: 15px;
}
 
   body {
  margin: 0;
  font-family: Arial, Helvetica, sans-serif;
}

table {
	table-layout: fixed;
	width: 100%;
	border-collapse: collapse;
	
}

table td {
    color:white;
    font-size:20px;
    font-style:italic;
    width: 25%;
	padding: 10px;
	text-align: center;
	
}
 
 table th{
    text-align: center;
      font-size: 20px;
      font-style: italic;
      color: white;
 }

table caption {
	font-style: italic;
}



.link{
color: black;
font-style: italic;
}

.link:hover {
	color: red;
}

.collapsible {
  background:linear-gradient(to bottom,#22abe9 5%,#36caf0 100%);
  box-shadow:inset 0 1px 0 0 #7bdcf4;
  color: white;
  cursor: pointer;
  padding: 18px;
  width: 100%;
  border: none;
  text-align: left;
  outline: none;
  font-size: 15px;
}

.active, .collapsible:hover {
background:linear-gradient(to bottom,#36caf0 5%,#22abe9 100%)
	}

.content {
  padding: 0 18px;
  display: block;
  background-color: #333;
}
.topnav {
  overflow: hidden;
  background-color: #333;
}

.topnav a {
  float: left;
  display: block;
  color: #f2f2f2;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
  font-size: 17px;
}

.topnav a:hover {
  background-color: #ddd;
  color: black;
}

.active {
  background-color: #4CAF50;
  color: white;
}

.topnav .icon {
  display: none;
}

@media screen and (max-width: 600px) {
  .topnav a:not(:first-child) {display: none;}
  .topnav a.icon {
    float: right;
    display: block;
  }
}



@media screen and (max-width: 600px) {
  .topnav.responsive {position: relative;}
  .topnav.responsive .icon {
    position: absolute;
    right: 0;
    top: 0;
  }
  .topnav.responsive a {
    float: none;
    display: block;
    text-align: left;
  }
}


.sel{
 width:150px;
 height:60px;
 margin-top:18px;
 margin-left:20px;
 padding:10px 8px;
 border-radius:15px;
 border-color:transparent;
 font-size: 16px;
 }
 
 .obj{
 width: 1320px;
 height: 70px;
 border-radius: 15px;
 font-size: 16px;
 
 }

 
 .txt{
 width:306px;
 height:50px;
 padding:10px 8px;
 border-radius:15px;
 border-color:transparent;
 font-size: 15px;
 }

 .txtedu{
 width:350px;
 height:40px;
 padding:10px 8px;
 border-radius:15px;
 border-color:transparent;
 font-size: 15px;
 }

.test{
 width:150px;
 height:40px;
 padding:10px 8px;
 border-radius:15px;
 border-color:transparent;
 font-size: 15px;
 }

 
.ta{

 border-radius:15px;
 border-color:transparent;
 font-size: 15px;

}

.r{
font-size: 22px;
height: 18px;
width: 18px;
}




 .btn{
  background:linear-gradient(to bottom,#22abe9 5%,#36caf0 100%);
  box-shadow:inset 0 1px 0 0 #7bdcf4;
  border-radius:5px;
  border-color:white;
  background-color:#333;
  height:35px;
  width:100px;
  font-style:color="white";
 }
 
 .btn:hover{
background:linear-gradient(to bottom,#36caf0 5%,#22abe9 100%)
 }


 </style> 
  
</head>
<body>
 <script src="js/collapsible.js"></script>
 



 <% out.println("<center><h3>Please fill the information below to make save your cv "+"</h3></center>"); %>


<br>
<br>

<form method="post" action="com.cv.info.QuickInfoSer">

<div class="collapsible">Personal Information</div>
<!-- Personal Information  -->
<div class="content">

<table>
<tr>
<td>Name</td>
<td>
<input type="text" name="name" class="txt" placeholder="First Name"  required>
</td>
</tr>

<tr>
<td>Email</td>
<td>
<input type="email" name="email" class="txt" placeholder="Your Email."  required>
</td>
</tr>
<tr>
<td>Contact Number</td>
<td>
<input type="text" name="no" class="txt" placeholder="Your Contact no." pattern="[0-9]{10}" maxlength="10" minlength="10" required>
</td>
</tr>
<tr>
<td>Address</td>
<td>
<textarea cols="60" rows="10" name="address" class="ta" placeholder="Your Address*"  required></textarea>
</td>
</tr>
</table>
<br>
</div>



<br>
<br>


<div class="collapsible">Educational Information</div>
<!-- Educational Information  -->
<div class="content">
<table>
<tr>
<th>Course</th>
<th>Year of Passing</th>
<th>Percentage</th>
<th>Institute</th>
</tr>

<tr>
<td>10th</td>

<td>

<select name="edu1" class="sel" required>
<option>Pursuing</option>
<option>1990</option>
<option>1991</option>
<option>1992</option>
<option>1993</option>
<option>1994</option>
<option>1995</option>
<option>1996</option>
<option>1997</option>
<option>1998</option>
<option>1999</option>
<option>2000</option>
<option>2001</option>
<option>2002</option>
<option>2003</option>
<option>2004</option>
<option>2005</option>
<option>2006</option>
<option>2007</option>
<option>2008</option>
<option>2009</option>
<option>2010</option>
<option>2011</option>
<option>2012</option>
<option>2013</option>
<option>2014</option>
<option>2015</option>
<option>2016</option>
<option>2017</option>
<option>2018</option>
<option>2019</option>
</select>
</td>



<td>
<input type="text"  name="ssc" class="txt" placeholder="Your 10th percentage."  required>
</td>


<td>
<input type="text" name="ssc_ins" class="txt" placeholder="Name of the Institute."  required>
</td>

</tr>


<tr>
<td>12th</td>
<td>
<select name="edu2" class="sel" required>
<option>Pursuing</option>
<option>1990</option>
<option>1991</option>
<option>1992</option>
<option>1993</option>
<option>1994</option>
<option>1995</option>
<option>1996</option>
<option>1997</option>
<option>1998</option>
<option>1999</option>
<option>2000</option>
<option>2001</option>
<option>2002</option>
<option>2003</option>
<option>2004</option>
<option>2005</option>
<option>2006</option>
<option>2007</option>
<option>2008</option>
<option>2009</option>
<option>2010</option>
<option>2011</option>
<option>2012</option>
<option>2013</option>
<option>2014</option>
<option>2015</option>
<option>2016</option>
<option>2017</option>
<option>2018</option>
<option>2019</option>
</select>
</td>



<td>
<input type="text" name="hsc" class="txt" placeholder="Your 12th percentage." required>
</td>



<td>
<input type="text" name="hsc_ins" class="txt" placeholder="Name of the Institute." required>
</td>

</tr>

<tr>
<td><select name="dgree_name" class="sel" required>
<option>Other</option>
<option>BE</option>
<option>BSC</option>
<option>B.Com</option>
</select>
</td>
<td>
<select name="edu3" class="sel" required>
<option>Pursuing</option>
<option>Not Done</option>
<option>1990</option>
<option>1991</option>
<option>1992</option>
<option>1993</option>
<option>1994</option>
<option>1995</option>
<option>1996</option>
<option>1997</option>
<option>1998</option>
<option>1999</option>
<option>2000</option>
<option>2001</option>
<option>2002</option>
<option>2003</option>
<option>2004</option>
<option>2005</option>
<option>2006</option>
<option>2007</option>
<option>2008</option>
<option>2009</option>
<option>2010</option>
<option>2011</option>
<option>2012</option>
<option>2013</option>
<option>2014</option>
<option>2015</option>
<option>2016</option>
<option>2017</option>
<option>2018</option>
<option>2019</option>
</select>
</td>



<td>
<input type="text" name="dgree_per" class="txt" placeholder="Overall percentage(in %)."  required>
</td>



<td>
<input type="text" name="dgree_ins" class="txt" placeholder="Name of the institute."  required>
</td>


</tr>

</table>
<br>
</div>


<br>
<br>
<br>



<div class="collapsible">Objective</div>
<!--Objective  -->
<div class="content">
<br>
<label style="color: white;">Objective</label>
<select name="obj" class="obj">
<option>Get hold of a position that will give me the ability to relate my education to a growing industry. Look forward to
working with a corporation that promotes superior products and services; and give me with the chance to meet and
go beyond assigned goals</option>
<option>Always looking for the opportunities where i can explore myself.</option>
<option>Always i am prepared for new challenges and love to tackle it.</option>
<option>To obtain a position where i can turn my ability and skills in company's profit and also that improve my
performance as well.</option>
<option>I want to excel in this field with hard work, perseverance, and dedication.</option>
<option>I want a highly rewarding career where I can use my skills and knowledge to help the company and my co-workers be successful.</option>
<option>I am seeking a company where I can use my experience and education to help the company meet and surpass its goals.</option>
<option>To work in a highly competitive environment with a perfect challenge by contributing the best for     the growth of the organization while ensuring growth in personal career.</option>
<option>To Be a Successful professional in a Globally Respected Company and to achieve the objectives of the company with Honesty and Fairness and to Continuously Upgrade My Knowledge and Skills.</option>
<option>As a Beginner in the Industrial field, while making a  positive  contribution, I would like to build a career, making the best use of my analytical, creative and logical skills to perform the job efficiently.</option>
<option>To achieve high career growth through a continuous learning process, keep myself dynamic, visionary and competitive with the changing scenario of the world and to contribute for the growth of organization.</option>
<option>Looking for opportunities to build my carrier that would help me in achieving greater practical excellence in software industry, exceptional with hardworking nature along with good communication skill to explore the requirements and come up with innovative solution.</option>
<option>To be able to utilize the knowledge already gained, in a responsible and proper manner resulting in a value add to the organization and to reach the apex of my career in the process.</option>
<option>To be an achiever with Challenging assignment wherever I work to grow in an organization which believes in growing through its people.</option>
<option>To work in a dynamic environment that enables me to utilize my Knowledge and learn new things, and to progress professionally and personally.</option>
<option>To obtain an entry-level position within an organization that offers security and professional growth which requires strong analytical and technical skills.</option>
<option>To work with a company this appreciates innovation so that I can enhance my knowledge and skills to give my best for the growth of the company.</option>
<option>Seeking a position to utilize my skills and abilities in the Information Technology that  offers professional  growth while  being resourceful, innovative and flexible.</option>
<option>To pursue a challenging career and be part of a progressive organization that gives scope to enhance my knowledge, skills and to reaches the pinnacle in the computing and research field with sheer determination, dedication and hard work.</option>
<option>Looking for a challenging career which will demand the best of my professional ability in terms of technical and analytical skills, and helps me in enhancing my current skill and knowledge.</option>
<option>Looking forward to work with an organization which provides me an ample opportunity to explore my Technical skills towards organizational goals and be an ultimate resource to the organization.</option>
</select>

<br>
<br>
<font color="white">Custom Objective:</font><input type="checkbox" class="chk" onclick="f2()" title="Click me for Custom Objective."><br><br>
<textarea disabled="disabled" cols="161" rows="10" class="ta" name="customobj" id="customobj" placeholder="Your Custom Objective"></textarea>
<br>
<br>

</div>


<br>
<br>
<br>


<div class="collapsible" title="Write your skills here">Your Skills</div>
<!-- Skill  -->
<div class="content">

<table>
<tr>
<th>Skills</th>
<th>Skills</th>

</tr>

<tr>


<td>
<input type="text" name="s1" class="txt" placeholder="Skill."  required>
</td>


<td>
<input type="text" name="s2" class="txt" placeholder="Skill" >
</td>


</tr>

<tr>


<td>
<input type="text" name="s3" class="txt" placeholder="Skill.">
</td>


<td>
<input type="text" name="s4" class="txt" placeholder="Skill" >
</td>


</tr>

<tr>


<td>
<input type="text" name="s5" class="txt" placeholder="Skill.">
</td>


<td>
<input type="text" name="s6" class="txt" placeholder="Skill" >
</td>


</tr>

<tr>


<td>
<input type="text" name="s7" class="txt" placeholder="Skill.">
</td>


<td>
<input type="text" name="s8" class="txt" placeholder="Skill" >
</td>


</tr>

<tr>


<td>
<input type="text" name="s9" class="txt" placeholder="Skill.">
</td>


<td>
<input type="text" name="s10" class="txt"  placeholder="Skill" >
</td>


</tr>


</table>

</div>


<br>
<br>
<br>

<div class="collapsible" title="Write your project details here">Project Details</div>
<!-- Projects  -->
<div class="content">

<div class="collapsible" title="Write your project details here( )">Project-1*</div>
<!-- Project1  -->
<div class="content">

<table>

<tr>
<td>Project Name</td>
<td>
<input type="text" name="p1name" class="txt" placeholder="Project Name"  required>
</td>
</tr>
<tr>
<td>Project Duration</td>
<td>
<input type="text" name="p1time" class="txt" placeholder="Project Duration(in months)"  required>
</td>
</tr>


<tr>
<td>About Project</td>
<td>
<textarea cols="60" rows="10" name="p1desc" class="ta" placeholder="About your project*"  required></textarea>
</td>
</tr>
</table>

</div>


<div class="collapsible" title="Write your project details here">Project-2</div>
<!-- Project2  -->
<div class="content">
<table>
<tr>
<td>Project Name</td>
<td>
<input type="text" name="p2name" class="txt" placeholder="Project Name"  >
</td>
</tr>
<tr>
<td>Project Duration</td>
<td>
<input type="text" name="p2time" class="txt" placeholder="Project Duration(in months)"  >
</td>
</tr>

<tr>
<td>About Project</td>
<td>
<textarea cols="60" rows="10" name="p2desc" class="ta" placeholder="About your project*"  ></textarea>
</td>
</tr>
</table>

</div>

<br>
</div>

<br>
<br>
<br>

<div class="collapsible" title="Write your project details here">Achievements</div>
<!-- Achievements  -->
<div class="content">

<div class="collapsible" title="Write your achievements here( )">Achievement-1*</div>
<!-- Achievement-1  -->
<div class="content">
<br>
<textarea cols="120" rows="10" name="ach1" class="ta" placeholder="About your Achievement*"  required></textarea>
<br>
</div>

<div class="collapsible" title="Write your achievements here">Achievement-2</div>
<!-- Achievement-2  -->
<div class="content">
<br>
<textarea cols="120" rows="10" name="ach2" class="ta" placeholder="About your Achievement"></textarea>
<br>
</div>

<div class="collapsible" title="Write your achievements here">Achievement-3</div>
<!-- Achievement-3  -->
<div class="content">
<br>
<textarea cols="120" rows="10" name="ach3" class="ta" placeholder="About your Achievement"></textarea>
<br>
</div>

<div class="collapsible" title="Write your achievements here">Achievement-4</div>
<!-- Achievement-4  -->
<div class="content">
<br>
<textarea cols="120" rows="10" name="ach4" class="ta" placeholder="About your Achievement"></textarea>
<br>
</div>

<div class="collapsible" title="Write your achievements here">Achievement-5</div>
<!-- Achievement-5  -->
<div class="content">
<br>
<textarea cols="120" rows="10" name="ach5" class="ta" placeholder="About your Achievement"></textarea>
<br>
</div>

</div>

<br>
<br>
<br>

<div class="collapsible" title="Write your industrial training details here">Industrial exposure</div>
<!-- Industrial exposure  -->
<div class="content">
<div class="collapsible" title="Write your industrial training details here( )">Training-1*</div>
<!-- Industrial exposure  -->
<div class="content">
<br>
<table>
<tr>
<td>Training Name</td>
<td>
<input type="text" name="t1name" class="txt" placeholder="Traning Name*"  required>
</td>
</tr>
<tr>
<td>Training Institute</td>
<td>
<input type="text" name="t1_ins" class="txt" placeholder="Training Institution*"  required>
</td>
</tr>

<tr>
<td>About Training</td>
<td>
<textarea cols="60" rows="10" name="t1desc" class="ta" placeholder="About your Training" required></textarea>
</td>
</tr>
</table>

<br>
</div>

<div class="collapsible" title="Write your industrial training details here">Training-2</div>
<!-- Industrial exposure  -->
<div class="content">
<br>
<table>
<tr>
<td>Training Name</td>
<td>
<input type="text" name="t2name" class="txt" placeholder="Traning Name"  >
</td>
</tr>
<tr>
<td>Training Institute</td>
<td>
<input type="text" name="t2_ins" class="txt" placeholder="Training Institution"  >
</td>
</tr>

<tr>
<td>About Training</td>
<td>
<textarea cols="60" rows="10" name="t2desc" class="ta" placeholder="About your Training" ></textarea>
</td>
</tr>
</table>

<br>
</div>

</div>

<br>
<br>
<br>


<div class="collapsible" title="verify your information">Hobbies</div>
<!-- Hobbies  -->
<div class="content">
<table>
<tr>
<th>Hobbies</th>
<th>Hobbies</th>
</tr>
<tr>
<td>
<input type="text" name="h1" class="txt" placeholder="Hobby" title="Your Hobbie."  required>
</td>


<td>
<input type="text" name="h2" class="txt"  placeholder="Hobby" title="Your Hobbie.">
</td>
</tr>

<tr>
<td>
<input type="text" name="h3" class="txt" placeholder="Hobby" title="Your Hobbie.">
</td>

<td>
<input type="text" name="h4" class="txt"  placeholder="Hobby" title="Your Hobbie.">
</td>
</tr>

<tr>
<td>
<input type="text" name="h5" class="txt"  placeholder="Hobby" title="Your Hobbie.">
</td>
</tr>


</table>

</div>

<br>
<br>
<br>


<div class="collapsible" title="verify your information">Declaration</div>
<!-- Declaration  -->
<div class="content">
<br>
<label style="color: white;">Declaration</label>
<select name="dec" class="obj">
<option>I hereby declare that the above-mentioned information is correct up to my knowledge and I bear the responsibility
for the correctness of the above-mentioned particulars.</option>
<option>All the information mentioned in the resume are correct to the best of my knowledge and believe.</option>
<option>I hereby declare that above-mentioned information is correct to the best of my knowledge and belief</option>
<option>I solemnly declare that all the above furnished information is free from error to the best of my knowledge and belief.</option>
<option>I hereby declare that all above-mentioned information is in accordance with fact or truth up to my knowledge and I bear the responsibilities for the correctness of the above mentioned particulars.</option>
<option>I hereby declare that the information furnished above is true to the best of my knowledge.</option>
<option>I do hereby declare that above particulars of information and facts stated are true, correct and complete to the best of my knowledge and belief.</option>
<option>I hereby clarify that information provided above is true to my belief and knowledge.</option>
<option>I do hereby declare that the above statements mentioned in my resume are true and correct to the best of my knowledge and belief.</option>
<option>I hereby declare that the above furnished information is true to the best of my knowledge and that I will be held responsible for any deviation from them at a later stage.</option>
</select>

<br>
<br>

<font color="white">Custom Declaration:</font> <input type="checkbox" class="chk"  onclick="f1()" title="Click me for Custom Declaration."><br><br>
<textarea disabled cols="161" rows="10" class="ta" name="customdec" id="customdec" placeholder="Your Custom Declaration" ></textarea>
<br>
<br>

<table>
<tr>
<td>
<input type="text" name="place" class="txt" placeholder="Place" title="Your place."  required>
</td>


<td>
<input type="text" name="decname" class="txt"  placeholder="Name" title="Your name."  required>
</td>
</tr>
</table>

<br>

</div>



<br>
<br>


<center> <input type="submit" class="btn" value="Save">&nbsp<input type="reset" class="btn" value="Reset">
</center>
</form>



<script>
function f1(){
	var textArea = document.getElementById('customdec');
    textArea.disabled = !textArea.disabled;
}

function f2(){
	var textArea = document.getElementById('customobj');
    textArea.disabled = !textArea.disabled;
}


</script>

</body>
</html>