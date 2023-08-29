package com.xworkz.employee;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.employee.config.EmployeeConfig;
import com.xworkz.employee.dto.EmployeeDto;
import com.xworkz.employee.service.EmployeeServImpl;
import com.xworkz.employee.service.EmployeeService;

public class EmployeeRunner {

	public static void main(String[] Args) {

		EmployeeDto dto = new EmployeeDto(1, "Varun", "Umesh", "Male", 23, "B.E", "Kannada",
				"varunviovarunvio@gmail.com", "BanShankari", 6, "Single");
		EmployeeDto dto1 = new EmployeeDto(2, "Arun", "Suresh", "Male", 21, "B.E", "Tamil", "arun@gmail.com", "BTM", 3,
				"Married");
		EmployeeDto dto2 = new EmployeeDto(3, "Tharun", "Ramesh", "Male", 25, "B.E", "Hindi", "Tharun@gmail.com",
				"KENGERI", 7, "Couple");
		
		ApplicationContext context = new AnnotationConfigApplicationContext(EmployeeConfig.class);

		EmployeeService service = context.getBean(EmployeeServImpl.class);

		service.save(dto2);
//		System.out.println("--------------------");
//		EmployeeDto result = service.findByName("Tharun");
//		System.out.println(result);
//
//		System.out.println("--------------------");
//		EmployeeDto Find = service.findByNameAndAge("Varun", 25);
//		System.out.println(Find);
//
//		System.out.println("--------------------");
//		boolean update = service.updateAgeByFatherName(25, "Umesh");
//		System.out.println(update);
//
//		System.out.println("--------------------");
//		boolean up = service.updateAddressByGenderAndExperience("JAynagar", "Male", 6);
//		System.out.println(up);
		
		System.out.println("--------------------");
//		service.DeleteByEmail("Tharun@gmail.com");
		
//	service.DeleteByQualificationAndMaritalStatus("B.E","Single");
		
	
//		List<EmployeeDto> list  = service.ReadAll();
//		for (EmployeeDto  ref: list) {
//			System.out.println(ref);
		}

	

}
