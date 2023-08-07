package com.xworkz.hotel;

import com.xworkz.hotel.constant.Type;
import com.xworkz.hotel.dao.HotelDao;
import com.xworkz.hotel.dao.HotelDtoIsNotNull;
import com.xworkz.hotel.dto.FoodListDto;
import com.xworkz.hotel.dto.HotelDto;

public class HotelRunner {

	public static void main(String[] args) throws HotelDtoIsNotNull {

		//FoodListDto food = new  FoodListDto("Chappathi",50,"icecream","tea");
		// HotelDto dto = new HotelDto("Aryas","btm",Type.nonveg,food,1000);
		//HotelDto dto1 = new HotelDto(null,null,null,null,0);
		
		HotelDto dtoooo = new HotelDto();
		
		
		HotelDao dao = new HotelDao();
		
		dao.saveDetail(dtoooo); 
		
//		HotelDto[] hol = dao.readHotel();
//		for(int i=0;i<hol.length;i++) {
//			if(hol[i]!=null) {
//				System.out.println(hol[i]);	
//			}
//			
//		}
//		
//	
//		dao.updatelocationByname("Aryas","Saraki" );
//		
//		HotelDto[] hrl = dao.readHotel();
//		for(int i=0;i<hrl.length;i++) {
//			if(hrl[i]!=null) {
//				System.out.println(hrl[i]);	
//			}
//			
//		}
//		
//	dao.findByprice(1000);
//	HotelDto[] hul = dao.readHotel();
//	for(int i=0;i<hul.length;i++) {
//		if(hul[i]!=null) {
//			System.out.println(hul[i]);	
//		}
//		
//	}
//	
//     dao.deleteBylocation("Saraki");
//     
//     HotelDto[] hrrl = dao.readHotel();
//		for(int i=0;i<hrrl.length;i++) {
//			if(hrrl[i]!=null) {
//				System.out.println(hrrl[i]);	
//			}
//			
//		}
//		
//	
//		
	}

}
