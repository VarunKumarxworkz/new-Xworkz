package com.xworkz.food;

import com.xworkz.food.dao.FoodDao;
import com.xworkz.food.dto.FoodDto;

public class FoodRunner {

	public static void main(String[] args) {
		
		FoodDto obj = new FoodDto("Muddhe", 50,"veg");
		
		FoodDao dao =  new FoodDao();
		
		dao.saveDetails(obj);
		
		
		FoodDto[] rea = dao.readFood();
		for(int i=0;i<rea.length;i++) {
			if(rea[i]!=null) {
			System.out.println(rea[i]);
		}
		}
		
		
		dao.updateCostByName("Muddhe", 60);
		
		FoodDto[] rew = dao.readFood();
		for(int i=0;i<rew.length;i++) {
			if(rew[i]!=null) {
			System.out.println(rew[i]);
		}
		}
		System.out.println("-----------------change to null-----------------------");
		dao.deleteByName("Muddhe");
		
		FoodDto[] ret = dao.readFood();
		for(int i=0;i<ret.length;i++) {
			if(ret[i]!=null) {
			System.out.println(ret[i]);
		}
		}
		
		dao.searchBytype("veg");
		FoodDto[] ros = dao.readFood();
		for(int i=0;i<ros.length;i++) {
			if(ros[i]!=null) {
			System.out.println(ros[i]);
		}
		}
		
		
	}
	
	
	
}
