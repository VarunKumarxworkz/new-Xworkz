package com.xworkz.FitnessApplication;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.FitnessApplication.dto.FitnessApplicationDto;
import com.xworkz.FitnessApplication.service.FitnessApplicationSerImp;
@WebServlet(urlPatterns = "/gym")
public class Servlet extends HttpServlet {

	
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		FitnessApplicationDto dto = new FitnessApplicationDto();
		
		
		String Age  = req.getParameter("age");
		dto.setName(req.getParameter("name"));
		dto.setAge(req.getParameter("age"));
		dto.setHeight(req.getParameter("height"));
		dto.setWeight(req.getParameter("weight"));
		dto.setBMI(req.getParameter("bmi"));
		dto.setPackages(req.getParameter("package"));
		dto.setTiming(req.getParameter("timing"));
		dto.setExperience(req.getParameter("experience"));
		dto.setEmail(req.getParameter("email"));
		dto.setContact(req.getParameter("contact"));
		dto.setAddress(req.getParameter("address"));
		
		FitnessApplicationSerImp serv = new FitnessApplicationSerImp();
		
		try {
			//serv.save(dto);
			serv.findByage(dto, Age);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		resp.setContentType("text/HTML");
		PrintWriter writer = resp.getWriter();
		writer.println(dto);
		
	}
	
	
	
	
}
