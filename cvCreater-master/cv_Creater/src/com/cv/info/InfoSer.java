package com.cv.info;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.mail.Session;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cv.dao.InfoDao;
import com.cv.data.InfoData;


@WebServlet("/com.cv.info.InfoSer")
public class InfoSer extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         response.setContentType("text/html");
         PrintWriter pw=response.getWriter();
         
         String name=request.getParameter("name");
         String email=request.getParameter("email");
         String number=request.getParameter("no");
         String address=request.getParameter("address");
         String ssc=request.getParameter("edu1");
         String ssc_per=request.getParameter("ssc");
         String ssc_ins=request.getParameter("ssc_ins");
         String hsc=request.getParameter("edu2");
         String hsc_per=request.getParameter("hsc");
         String hsc_ins=request.getParameter("hsc_ins");
         String dgree=request.getParameter("edu3");
         String dgree_per=request.getParameter("dgree_per");
         String dgree_ins=request.getParameter("dgree_ins");
         String dgree_name=request.getParameter("dgree_name");
         String obj=request.getParameter("customobj");
         
         if(obj==null) {
        	 obj=request.getParameter("obj");
         }
         
         String s1=request.getParameter("s1");
         String s2=request.getParameter("s2");
         String s3=request.getParameter("s3");
         String s4=request.getParameter("s4");
         String s5=request.getParameter("s5");
         String s6=request.getParameter("s6");
         String s7=request.getParameter("s7");
         String s8=request.getParameter("s8");
         String s9=request.getParameter("s9");
         String s10=request.getParameter("s10");
         String p1name=request.getParameter("p1name");
         String p1time=request.getParameter("p1time");
         String p1desc=request.getParameter("p1desc");
         String p2name=request.getParameter("p2name");
         String p2time=request.getParameter("p2time");
         String p2desc=request.getParameter("p2desc");
         String ach1=request.getParameter("ach1");
         String ach2=request.getParameter("ach2");
         String ach3=request.getParameter("ach3");
         String ach4=request.getParameter("ach4");
         String ach5=request.getParameter("ach5");
         String t1name=request.getParameter("t1name");
         String t2name=request.getParameter("t2name");
         String t1_ins=request.getParameter("t1_ins");
         String t2_ins=request.getParameter("t2_ins");
         String t1desc=request.getParameter("t1desc");
         String t2desc=request.getParameter("t2desc");
         String place=request.getParameter("place");
         String decname=request.getParameter("decname");
         String dec=request.getParameter("customdec");
         
         if(dec==null) {
        	 dec=request.getParameter("dec");
         }
         
         String h1=request.getParameter("h1");
         String h2=request.getParameter("h2");
         String h3=request.getParameter("h3");
         String h4=request.getParameter("h4");
         String h5=request.getParameter("h5");
         String creation_date=InfoSer.getCurrentDate();
         String creation_time=InfoSer.getCurrentTime();
         
         HttpSession session=request.getSession(true);
         String id=(String)session.getAttribute("id");
         String can_name=(String)session.getAttribute("name");
         
/*         System.out.println("At infoser name: "+can_name+" id: "+id);
*/         
         InfoData data=new InfoData();
         data.setName(name);
         data.setEmail(email);
         data.setPhone(number);
         data.setAddress(address);
         data.setSsc(ssc);
         data.setSsc_per(ssc_per);
         data.setSsc_ins(ssc_ins);
         data.setHsc(hsc);
         data.setHsc_per(hsc_per);
         data.setHsc_ins(hsc_ins);
         data.setDgree(dgree);
         data.setDgree_per(dgree_per);
         data.setDgree_ins(dgree_ins);
         data.setDgree_name(dgree_name);
         data.setObj(obj);
         data.setS1(s1);
         data.setS2(s2);
         data.setS3(s3);
         data.setS4(s4);
         data.setS5(s5);
         data.setS6(s6);
         data.setS7(s7);
         data.setS8(s8);
         data.setS9(s9);
         data.setS10(s10);
         data.setP1name(p1name);
         data.setP1time(p1time);
         data.setP1desc(p1desc);
         data.setP2name(p2name);
         data.setP2time(p2time);
         data.setP2desc(p2desc);
         data.setAch1(ach1);
         data.setAch2(ach2);
         data.setAch3(ach3);
         data.setAch4(ach4);
         data.setAch5(ach5);
         data.setT1name(t1name);
         data.setT1_ins(t1_ins);
         data.setT1desc(t1desc);
         data.setT2name(t2name);
         data.setT2_ins(t2_ins);
         data.setT2desc(t2desc);
         data.setPlace(place);
         data.setDecname(decname);
         data.setDec(dec);
         data.setH1(h1);
         data.setH2(h2);
         data.setH3(h3);
         data.setH4(h4);
         data.setH5(h5);
         data.setId(id);
         data.setDate(creation_date);
         data.setTime(creation_time);
         data.setUpdation_date(creation_date);
         data.setUpdation_time(creation_time);
         
         int i=InfoDao.register(data);
         
         if(i>0) {
/*               	System.out.println("Data Saved at client end."); 
*/ 			
 				
 			    session.setAttribute("name",can_name);
 			    session.setAttribute("id", id);
 			    pw.println("<script type=\"text/javascript\">");
 	  	        pw.println("alert('Your Cv Information is saved please click on open tab  to make your cv.');");
 	  			pw.println("location='ServiceProfile';");
 	  			pw.println("</script>");
 	            
           }
         else 
         {  
        	session.setAttribute("name",can_name);
		    session.setAttribute("id", id);
			System.out.println("Data is not Saved.");
        	pw.println("<script type=\"text/javascript\">");
  	        pw.println("alert('Your Information is not saved please try after some time.');");
  			pw.println("location='ServiceProfile';");
  			pw.println("</script>");
             
         }
         
	}
   public static String getCurrentTime() {
	String time;
	Calendar cal=Calendar.getInstance();
	Date date=cal.getTime();
	DateFormat format=new SimpleDateFormat("hh:mm:ss a");
	time=format.format(date);
	System.out.println("Creation time is: "+time);
	
	return time;
}
   
   public static String getCurrentDate() {
	   String Currentdate;
	   Date date=new Date();
	   DateFormat format=new SimpleDateFormat("dd/MM/yy");
	   Currentdate=format.format(date);
	   System.out.println("Creation date is: "+Currentdate);
	   
	   return Currentdate;
   }
}
