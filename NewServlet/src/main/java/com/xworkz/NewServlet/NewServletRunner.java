package com.xworkz.NewServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns = "/gym")
public class NewServletRunner extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws  IOException {
		System.out.println("Mens Go To Gym");
        String FirstName = req.getParameter("firstname");
        String LastName = req.getParameter("lastname");
        String Email = req.getParameter("email");
        String JobRole = req.getParameter("jobRole");
        String Certification = req.getParameter("certification");
        
		System.out.println(FirstName);
		System.out.println(LastName);
		System.out.println(Email);
		System.out.println(JobRole);
		System.out.println(Certification);
		
		resp.setContentType("text/HTML");
		PrintWriter writer = resp.getWriter();
		writer.println("<h1>MENS GO TO GYM *****</h1>");
		writer.println("<h1>"+ FirstName + "</h1><br>");
		writer.println("<h1>"+ LastName + "</h1><br>");
		writer.println("<h1>"+ Email + "</h1><br>");
		writer.println("<h1>"+ JobRole + "</h1><br>");
		writer.println("<h1>"+ Certification + "</h1><br>");
		writer.println("<form>\r\n"
				+ " <input type=\"button\" value=\"Go back!\" onclick=\"history.back()\">\r\n"
				+ "</form>");
	}
	
	
	

}
