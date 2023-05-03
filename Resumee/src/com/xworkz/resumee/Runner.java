package com.xworkz.resumee;

import com.xworkz.resumee.dao.ResumeeDao;
import com.xworkz.resumee.dto.AddressDto;
import com.xworkz.resumee.dto.ResumeDto;

public class Runner {

	public static void main(String[] args) {
		
		AddressDto address=new AddressDto(34,"Btm1layout","btm", "btm", "Bangalore");
		 ResumeDto CV=new ResumeDto("Arun", "04-05-2001","Umesh", 246810934l, 21,"arun04@gmail.com", 2023, "BE", address);
		 
		 AddressDto address01=new AddressDto(35,"rvnagar","karamadai", "MTP", "CMB");
		 ResumeDto CV01=new ResumeDto("Varun", "11-04-2001","Umesh.L", 234509876l, 24,"Varun11@gmail.com", 2020, "ME", address01);
		 

		 ResumeeDao Dao=new ResumeeDao();
		 
		 System.out.println("-----------save--------------");
		 Dao.SaveDetails(CV);
		 Dao.SaveDetails(CV01);
		 System.out.println("-----------Read--------------");
		 ResumeDto[] reading=Dao.ReadResume();
			
			for(int j=0;j<reading.length;j++) {
		  		if(reading[j] != null)
		  		System.out.println( reading[j]);
		    	 
		  	}
			
			 System.out.println("----------- Search--------------");	
			 
			 System.out.println("----------- Findbyname--------------");
			 ResumeDto search=Dao.FindByName("Arun");
				System.out.println(search);
			
				System.out.println("----------------- FindByMail----------");   
				ResumeDto searchid =Dao.FindByEmail("Varun11@gmail.com");
				System.out.println(searchid );
				
				
				 System.out.println("----------- Update-------------");	
				 System.out.println("-----------------updatedegreebyname----------");   
					
					Dao.UpdateDegreeByName( "BE","Varun");
					ResumeDto[] read1=Dao.ReadResume();
					 
					for(int j=0;j<read1.length;j++) {
				  		if(read1[j] != null)
				  		System.out.println( read1[j]);
					}
				  		
				  		System.out.println("-----------------updatePhonNumByMailid----------");   
				  		
				  		Dao.UpdatePhoneNumBymail("arun04@gmail.com", 98447852l);
				  		
				  		ResumeDto[] read02=Dao.ReadResume();
						 
						for(int j1=0;j1<read1.length;j1++) {
					  		if(read02[j1] != null)
					  		System.out.println( read02[j1]);
				  	         }
				
						System.out.println("----------------- DeleteAgebyName----------");   
						
						 boolean delete= Dao.DeleteAgebyName("Varun");
						 System.out.println(delete);
						 ResumeDto[] readcv=Dao.ReadResume();
						 
							for(int j1=0;j1<read1.length;j1++) {
						  		if(readcv[j1] != null)
						  		System.out.println( readcv[j1]);
					  	         }
				
				
				
				
				
				
	}

}
