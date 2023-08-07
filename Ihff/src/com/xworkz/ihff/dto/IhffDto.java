package com.xworkz.ihff.dto;

import com.sun.jdi.Type;

public class IhffDto {

	private String name;
	private String pro;
	private int height;
	private IhffRulesDto rules;
	private Type type;
	
	
	public IhffDto(String name, String pro, int height, IhffRulesDto physiq,
			com.xworkz.ihff.constant.Type menphysique) {
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName() {
		this. name = name;
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

	public IhffRulesDto getRules() {
		return rules;
	}

	public void setRules(IhffRulesDto rules) {
		this.rules = rules;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "IhffDto [name=" + name + ", pro=" + pro + ", height=" + height + ", rules=" + rules + ", type=" + type
				+ "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
