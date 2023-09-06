package com.xworkz.javacodetest;

import java.util.Scanner;

public class JavaCodeTestRunner {
	
	public static String stringRevrse(String name) {
		
		String[] str = name.split(" ",3);
		
		StringBuilder build = new StringBuilder();
		
		for(int i=str.length-1;i>=0;i--) {
			build.append(str[i]);
		if(i>0) {
			build.append(" ");
		}
		}
		return build.toString();
		
	}
	
	
	public static void main(String[]args) {
		
		String name= "varun kumar vio";
	
	String reverseString = stringRevrse(name);
	System.out.println(reverseString);
		
		 
	}

}
