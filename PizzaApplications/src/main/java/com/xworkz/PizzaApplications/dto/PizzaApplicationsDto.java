package com.xworkz.PizzaApplications.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

public class PizzaApplicationsDto {
	
	private String name;
	@NotBlank
	@NotEmpty
	private String type;
	@NotBlank
	@NotEmpty
	private String size;
	@NotBlank
	@NotEmpty
	private String address;
	@NotBlank
	@NotEmpty
	private String paymentMode;
	@NotBlank
	@NotEmpty
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPaymentMode() {
		return paymentMode;
	}
	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}
	@Override
	public String toString() {
		return "PizzaApplicationsDto [name=" + name + ", type=" + type + ", size=" + size + ", address=" + address
				+ ", paymentMode=" + paymentMode + "]";
	}
	
	
	
	
}
