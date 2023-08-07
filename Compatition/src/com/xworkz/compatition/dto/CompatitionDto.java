package com.xworkz.compatition.dto;

import com.sun.jdi.Type;

public class CompatitionDto {

	private String name;
	private String pro;
	private int height;
	private Type type;
	private CompatitionRules rules;
	
	public  CompatitionDto(String name,String pro,int height,Type type,CompatitionRules rules ) {
		super();
		this.name = name;
		this.pro = pro;
		this.height = height;
		this.type = type;
		this.rules = rules;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}


	public String getPro() {
		return pro;
	}


	public void setPro(String pro) {
		this.pro = pro;
	}


	public int getHeight() {
		return height;
	}


	public void setHeight(int height) {
		this.height = height;
	}


	public Type getType() {
		return type;
	}


	public void setType(Type type) {
		this.type = type;
	}


	public CompatitionRules getRules() {
		return rules;
	}


	public void setRules(CompatitionRules rules) {
		this.rules = rules;
	}
	
	public String toString() {
		return "Name = " + name  + "Pro =" + pro + "Height =" + height + "Type = " + type + "Rules =" + rules  ;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
