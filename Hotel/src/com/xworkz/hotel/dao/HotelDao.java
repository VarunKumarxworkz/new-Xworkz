package com.xworkz.hotel.dao;

import com.xworkz.hotel.dto.HotelDto;

public class HotelDao {

	HotelDto[] hotel = new HotelDto[10];
	
	public HotelDto[] saveDetail(HotelDto dto) throws HotelDtoIsNotNull {
		if(dto!=null) {
			for(int i=0;i<hotel.length;i++) {
				if(hotel[i]== null) {
					hotel[i] = dto;
					System.out.println("details saved");
					return hotel;
				}
				
		}
		System.out.println("dto is null");
		
	}
		else {
			throw new HotelDtoIsNotNull("hoteldto is not null checkthat");				 
				}
		return hotel;
	}
	public  HotelDto[] readHotel() {
		return hotel;
	}
	
	public HotelDto[] updatelocationByname(String name,String uplocation) {
		for(int i=0;i<hotel.length;i++) {
			if(hotel[i]!=null) {
				if(hotel[i].getName()!=null && hotel[i].getLocation()!=null) {
					if(hotel[i].getName().equals(name)) {
						hotel[i].setLocation(uplocation);
						System.out.println("location updated");
						return hotel;
					}
				}
			}
			
		}
		return hotel;
	}
	
	public HotelDto[] findByprice(int findprice){
		for(int i=0;i<hotel.length;i++) {
			if(hotel[i]!=null) {
				if(hotel[i].getPrice()!=0) {
					if(hotel[i].getPrice() == (findprice)) {
						System.out.println("price is founded");
						return hotel;
					}
				}
			}
		}
		return hotel;
		
	}
	
	public boolean deleteBylocation(String dellocation) {
		for(int i=0;i<hotel.length;i++) {
			if(hotel[i]!=null) {
				if(hotel[i].getLocation()!=null) {
					if(hotel[i].getLocation().equals(dellocation)) {
						hotel[i].setLocation(null);
						System.out.println("location deleted");
						return true;
					}
				}
			}
		}
		return false;
	}
	
	
	
}
