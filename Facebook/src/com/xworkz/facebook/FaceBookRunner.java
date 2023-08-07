package com.xworkz.facebook;

import java.sql.Date;

import com.xworkz.facebook.dto.FaceBookDto;
import com.xworkz.facebook.service.ServiceImp;

public class FaceBookRunner {
	
	public static void main(String[] args) throws Exception {
		Date date = new Date(2001,11,4);
		FaceBookDto dto = new FaceBookDto(7,"arun","aio",date,"jithan@gmail.com",866724670,"Male","ARMA");
	    ServiceImp ser = new ServiceImp();
	
		//ser.save(dto);
		//ser.update("arun","aro", date,"arun@gmail.com",87654332,"male","Cjiu12");
		//ser.read();
		//ser.delete(2);
	   // ser.deleteByfirstname("arun");
	   // ser.updateByemail("varunvio@gamil.com");
		//ser.readByemail("jithan@gamil.com");
	}
}
