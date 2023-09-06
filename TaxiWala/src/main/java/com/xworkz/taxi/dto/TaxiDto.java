package com.xworkz.taxi.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Table(name="taxi")
@Entity
@NamedQuery(name="findTaxiByLocation",query = "select dto from TaxiDto dto where location=:loc")
@NamedQuery(name="updateTaxiByEarning",query = "update  from TaxiDto dto set dto.taxiNo=:tx where dto.earnings=:er")
@NamedQuery(name="updateTaxiAvailableAndNoOftripsById",query = "update from TaxiDto dto set dto.isAvailable=:al , dto.noOfTrips=:tp where dto.id=:cd")
@NamedQuery(name="ReadAll",query = "select dto from TaxiDto dto")
public class TaxiDto {
   @Id
	private int id;
	private int taxiNo;
	private int earnings;
	private boolean isAvailable;
	private String location;
	private int noOfTrips;
	
	public TaxiDto() {
		System.out.println("Default Constructor");
	}

	public TaxiDto(int id, int taxiNo, int earnings, boolean isAvailable, String location, int noOfTrips) {
		super();
		this.id = id;
		this.taxiNo = taxiNo;
		this.earnings = earnings;
		this.isAvailable = isAvailable;
		this.location = location;
		this.noOfTrips = noOfTrips;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getTaxiNo() {
		return taxiNo;
	}

	public void setTaxiNo(int taxiNo) {
		this.taxiNo = taxiNo;
	}

	public int getEarnings() {
		return earnings;
	}

	public void setEarnings(int earnings) {
		this.earnings = earnings;
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getNoOfTrips() {
		return noOfTrips;
	}

	public void setNoOfTrips(int noOfTrips) {
		this.noOfTrips = noOfTrips;
	}

	@Override
	public String toString() {
		return "TaxiDto [id=" + id + ", taxiNo=" + taxiNo + ", earnings=" + earnings + ", isAvailable=" + isAvailable
				+ ", location=" + location + ", noOfTrips=" + noOfTrips + "]";
	}
	
	
}
