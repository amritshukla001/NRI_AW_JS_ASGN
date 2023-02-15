package com.user;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class AddServlet extends HttpServlet{
	
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		String name = req.getParameter("name");
		String pass = req.getParameter("pass");
		String email = req.getParameter("email");
		String gender = req.getParameter("gender");
		String course = req.getParameter("course");
		String terms = req.getParameter("terms");
		
		PrintWriter out = res.getWriter();
		
		if(terms != null)
		{
			out.println("<h1>My Form Data: </h1><br>");
			out.println("<b>Name:</b>"+name+"<br>");
			out.println("<b>Password:</b> "+pass+"<br>");
			out.println("<b>Email:</b> "+email+"<br>");
			out.println("<b>Gender: </b>"+gender+"<br>");
			out.println("<b>Course: </b>"+course+"<br>");
				
		}
		else
		{
			out.println("<h1>You have not aqccepted terms and conditions.</h1>");
		}
		
		
			}
	
}
