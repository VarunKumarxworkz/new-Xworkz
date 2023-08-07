package com.xworkz.facebook;

public class Runner {

	public static void main(String[] args) {
		
		try {
			turnOn(-1);
		} catch (IndexOutOfBoundsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MyOwnException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	
	
	public static void turnOn(int value) throws IndexOutOfBoundsException, MyOwnException{
		
		if(value<0) {
			throw new MyOwnException("Throwing my own exception" + value);
		}
		else {
			throw new IndexOutOfBoundsException();
		}
	}

}

class MyOwnException extends Exception{
	
	public MyOwnException(String message) {
		super(message);
		
	}

}
