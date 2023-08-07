package com.xworkz.vehicle.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Table(name = "vehicle")
@Entity
@NamedQuery(name="findByName",query = "select dto from VehicleDto dto where dto.name=:nm")
@NamedQuery(name="findByConsumeAndPower",query = "select dto from VehicleDto dto where dto.consume=:con and dto.power=:pow")
@NamedQuery(name="updateTypeByName",query = "update from VehicleDto dto set dto.type=:ty where dto.name=:nm")
@NamedQuery(name="updateLaunchedInAndPowerByid",query = "update VehicleDto dto set dto.launchedIn=:ld , dto.power=:pow where dto.id=:id")
@NamedQuery(name="deleteBylaunchedIn",query = "delete from VehicleDto dto where dto.launchedIn=:lnd")
@NamedQuery(name="readAll",query = "select dto from VehicleDto dto")
public class VehicleDto {
	@Id
	private int id;
	private String name;
	private String type;
	private String consume;
	private int power;
	private int launchedIn;
	
   public VehicleDto() {
	   System.out.println("defaultConstructor");
   }

public VehicleDto(int id, String name, String type, String consume, int power, int launchedIn) {
	super();
	this.id = id;
	this.name = name;
	this.type = type;
	this.consume = consume;
	this.power = power;
	this.launchedIn = launchedIn;
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

public String getType() {
	return type;
}

public void setType(String type) {
	this.type = type;
}

public String getConsume() {
	return consume;
}

public void setConsume(String consume) {
	this.consume = consume;
}

public int getPower() {
	return power;
}

public void setPower(int power) {
	this.power = power;
}

public int getLaunchedIn() {
	return launchedIn;
}

public void setLaunchedIn(int launchedIn) {
	this.launchedIn = launchedIn;
}

@Override
public String toString() {
	return "VehicleDto [id=" + id + ", name=" + name + ", type=" + type + ", consume=" + consume + ", power=" + power
			+ ", launchedIn=" + launchedIn + "]";
}
	
	
	
}
