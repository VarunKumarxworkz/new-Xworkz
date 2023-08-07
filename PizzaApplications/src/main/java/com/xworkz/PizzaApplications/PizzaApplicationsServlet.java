package com.xworkz.PizzaApplications;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.PizzaApplications.dto.PizzaApplicationsDto;
import com.xworkz.PizzaApplications.service.PizzaApplicationsServiceImp;
@WebServlet(urlPatterns = "/pizaa")
public class PizzaApplicationsServlet extends HttpServlet {
	
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PizzaApplicationsDto dto = new PizzaApplicationsDto();
		
		dto.setName(req.getParameter("name"));
		dto.setAddress(req.getParameter("address"));
		dto.setType(req.getParameter("type"));
		dto.setSize(req.getParameter("size"));
		dto.setPaymentMode(req.getParameter("mode"));
		PizzaApplicationsServiceImp ser = new PizzaApplicationsServiceImp();
		try {
			ser.validateAndSave(dto);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		resp.setContentType("text/HTML");
		PrintWriter write = resp.getWriter();
		write.println(dto);
		
		
		
	}
	
	
	

}
