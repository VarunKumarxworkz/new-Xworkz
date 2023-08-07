package com.xworkz.flipkart;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns = "FlipKart.jsp",initParams = {@WebInitParam(name="UserName",value="Varun"),@WebInitParam(name="PassWord",value="GymLove")})
public class FlipKartServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter writer = resp.getWriter();
		String Name = req.getParameter("userName");
		String PassWord = req.getParameter("password");
		resp.setContentType("text/html");
		
		String name = getInitParameter("UserName");
		String password = getInitParameter("PassWord");
		
		if(!name.isEmpty() && !password.isEmpty()) {
			if(Name.equals(name)&& PassWord.equals(password)) {
				req.getRequestDispatcher("/Welcome.jsp").forward(req, resp);
				System.out.println("login succesfull");
			}
		}
		else {
			req.getRequestDispatcher("/Flipkart.jsp").include(req, resp);
			System.out.println("Basterd check the detail da");
			
		}
		
	}
	
	
	
}
