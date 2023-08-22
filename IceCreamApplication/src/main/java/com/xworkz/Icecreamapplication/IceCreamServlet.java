package com.xworkz.Icecreamapplication;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.Icecreamapplication.dto.IceCreamDto; 
import com.xworkz.Icecreamapplication.service.IceCreamServ;
import com.xworkz.Icecreamapplication.service.IceCreamServImpl;
@WebServlet(urlPatterns  = "/cream")
public class IceCreamServlet extends HttpServlet {
	IceCreamDto dto = new IceCreamDto();
	IceCreamServ serv = new IceCreamServImpl();
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException { 
		dto.setName(req.getParameter("name"));
		dto.setFlavour(req.getParameter("flavour"));
		dto.setType(req.getParameter("type"));
		try{
			   serv.save(dto);
		   }catch(Exception e) {
			   e.printStackTrace();
			}
		resp.setContentType("text/HTML");
		PrintWriter writer =resp.getWriter();
		writer.print(dto);
	  
	}
	
	
}
