package com.xworkz.endurance.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "endurance_table")
@Entity
public class EnduranceDto {
	
	@Id
	private String name;
	private int days;
	private String supplement;
	private String workout;
	private int dosage;
	public EnduranceDto(String name, int days, String supplement, String workout, int dosage) {
		super();
		this.name = name;
		this.days = days;
		this.supplement = supplement;
		this.workout = workout;
		this.dosage = dosage;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDays() {
		return days;
	}
	public void setDays(int days) {
		this.days = days;
	}
	public String getSupplement() {
		return supplement;
	}
	public void setSupplement(String supplement) {
		this.supplement = supplement;
	}
	public String getWorkout() {
		return workout;
	}
	public void setWorkout(String workout) {
		this.workout = workout;
	}
	public int getDosage() {
		return dosage;
	}
	public void setDosage(int dosage) {
		this.dosage = dosage;
	}
	@Override
	public String toString() {
		return "EnduranceDto [name=" + name + ", days=" + days + ", supplement=" + supplement + ", workout=" + workout
				+ ", dosage=" + dosage + "]";
	}
	
	
	
	
	
	
}
