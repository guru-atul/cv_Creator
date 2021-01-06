package com.cv.info;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cv.DataFetch.CandidateDataFetch;
import com.cv.data.InfoData;

@WebServlet("/com.cv.info.ResetInfoSer")
public class ResetInfoSer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      response.setContentType("text/html");
      PrintWriter out=response.getWriter();
      
      
      HttpSession session=request.getSession();
      String time=request.getParameter("time");
      String name=(String)session.getAttribute("name");
      String id=(String)session.getAttribute("id");
      
      
      List<InfoData> list=CandidateDataFetch.getFetch(id, time);
      
      if(list.isEmpty()) {
    	    System.out.println("Data is not available due to some problem.");	
    		out.println("<script type=\"text/javascript\">");
    	    out.println("alert('You information can not updates some error happened.');");
    		session.setAttribute("id",id);
    		session.setAttribute("name", name);
    		out.println("location='ServiceProfile';");
    		out.println("</script>");
      }
      else {
    	  System.out.println("Data is available.");
    	  session.setAttribute("name", name);
    	  session.setAttribute("id", id);
    	  request.setAttribute("record", list);
    	  request.getRequestDispatcher("update_info").include(request, response);   
    	  }
      
      
      
	}

}
