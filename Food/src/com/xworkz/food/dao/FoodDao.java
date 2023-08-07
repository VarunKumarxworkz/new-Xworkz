package com.xworkz.food.dao;

import com.xworkz.food.DtoIsNotNullException;
import com.xworkz.food.dto.FoodDto;

public class FoodDao {

	
	FoodDto[] food = new FoodDto[10] ;
	
	
	public FoodDto[] saveDetails(FoodDto dto) throws DtoIsNotNullException  {
		
		if(dto!=null) {
			
			for(int i=0;i<food.length;i++) {
				if(food[i] ==null) {
					food[i] = dto;
					System.out.println("data saved successfully");
					return food;
					
				}
				System.out.println("index contain some values");
				
			}
			System.out.println("loop is not working ");
			
		}
		else{
			throw new DtoIsNotNullException("dto is null check the dto");
		}
		
		return food;
		
		
	}
	
	
	public FoodDto[] readFood() {
		return food;
	}
	
	public boolean updateCostByName(String name,int cost) {
		
	for(int i=0;i<food.length;i++) {
		if(food[i].getname().equals(name)) {
			food[i].setCost(cost); 
			return true;
			
		}
	}
	return false;
	}
	public boolean deleteByName(String deleteName) {
	
		for(int i=0;i<food.length;i++) {
		if(food[i].getname().equals(deleteName)) {
			food[i].setname(null);
			return true;
		}
		}
		return false;
		
		
		
	}
		
  public boolean searchBytype(String Type) {
	  for(int i=0;i<food.length;i++) {
		  if(food[i].getType().equals(Type)) {
			 return true;
		  }
	  }
	return false;
  }
	
	
	
	
	
	
		
		
		
		
	}
	

