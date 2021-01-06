package com.cv.showrecord;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cv.dao.DisplayDao;
import com.cv.data.InfoData;

@WebServlet("/com.cv.showrecord.Histroy_for_updation")
public class Histroy_for_updation extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	     response.setContentType("text/html");
         PrintWriter out=response.getWriter();
         
         
         HttpSession session=request.getSession();
         String name=(String)session.getAttribute("name");
         String id=(String)session.getAttribute("id");
         
         List<InfoData> list=DisplayDao.getDisplay(id);
         
         if(list.isEmpty()) {
        		out.println("<script type=\"text/javascript\">");
            	out.println("alert('Data is not available.');");
            	out.println("location='reset_info';");
            	out.println("</script>");
            }
         
         else {
        	 session.setAttribute("name", name);
        	 session.setAttribute("id", id);
        	 request.setAttribute("record", list);
        	 request.getRequestDispatcher("reset_info").forward(request, response);
         }
         
         
        		
	}

}
