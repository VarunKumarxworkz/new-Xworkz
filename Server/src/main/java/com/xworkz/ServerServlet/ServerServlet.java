package com.xworkz.ServerServlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns = "/shuheb")
public class ServerServlet extends HttpServlet {
	
	public ServerServlet(){
		System.out.println("Why Server is Always Busy");
	}

	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)  {
	System.out.println("Tell the reason Why Server is Busy");
		
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) {
		
		System.out.println("solve the problem");
	}
	
	
}
