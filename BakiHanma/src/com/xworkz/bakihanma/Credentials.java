package com.xworkz.bakihanma;

public enum Credentials {
  
	URL("jdbc:mysql://localhost:3306/baki"),USER("root"),Pass("Xworkzodc@123");
	 String name;
	 Credentials(String name) {
	  this.name=name;
	}
	  
}
