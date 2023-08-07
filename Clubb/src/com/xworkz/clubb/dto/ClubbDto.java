package com.xworkz.clubb.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Table(name = "club")
@Entity
public class ClubbDto {
    @Id
    private int id;
	private String name;
	private String location;
	private int price;
	private String Allowed;
	private String rules;
	public ClubbDto(int id, String name, String location, int price, String allowed, String rules) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.price = price;
		Allowed = allowed;
		this.rules = rules;
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
	public String getAllowed() {
		return Allowed;
	}
	public void setAllowed(String allowed) {
		Allowed = allowed;
	}
	public String getRules() {
		return rules;
	}
	public void setRules(String rules) {
		this.rules = rules;
	}
	@Override
	public String toString() {
		return "ClubbDto [id=" + id + ", name=" + name + ", location=" + location + ", price=" + price + ", Allowed="
				+ Allowed + ", rules=" + rules + "]";
	}
	
	
	
	
}
