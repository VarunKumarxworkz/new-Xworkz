package com.xworkz.buss.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Table(name = "bus")
@Entity
public class BussDto {

	@Id
	private int id;
	private String name;
	private String location;
	private int price;
	private int noOfseats;
	private int noOfpassangers;
	public BussDto () {
		System.out.println("default constructor");
	}
	public BussDto(int id, String name, String location, int price, int noOfseats, int noOfpassangers) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.price = price;
		this.noOfseats = noOfseats;
		this.noOfpassangers = noOfpassangers;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getNoOfseats() {
		return noOfseats;
	}
	public void setNoOfseats(int noOfseats) {
		this.noOfseats = noOfseats;
	}
	public int getNoOfpassangers() {
		return noOfpassangers;
	}
	public void setNoOfpassangers(int noOfpassangers) {
		this.noOfpassangers = noOfpassangers;
	}
	@Override
	public String toString() {
		return "BussDto [id=" + id + ", name=" + name + ", location=" + location + ", price=" + price + ", noOfseats="
				+ noOfseats + ", noOfpassangers=" + noOfpassangers + "]";
	}
	
	
	
	
}
