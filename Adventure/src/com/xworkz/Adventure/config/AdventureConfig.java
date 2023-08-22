package com.xworkz.Adventure.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.xworkz.Adventure.interfaces.Caving;
import com.xworkz.Adventure.interfaces.Cycling;
import com.xworkz.Adventure.interfaces.Exploring;
import com.xworkz.Adventure.interfaces.Hiking;
import com.xworkz.Adventure.interfaces.MountainBiking;
import com.xworkz.Adventure.interfaces.Paragliding;
import com.xworkz.Adventure.interfaces.RockClimbing;
import com.xworkz.Adventure.interfaces.SandBoarding;
import com.xworkz.Adventure.interfaces.ScubaDiving;
import com.xworkz.Adventure.interfaces.ZipLining;

@Configuration
public class AdventureConfig {

	@Bean
	public Hiking getHiking() {
		return new Hiking();
		
	}
	@Bean
	public ScubaDiving getScubaDiving() {
		return new ScubaDiving();
	}
	@Bean
	public Exploring getExploring() {
		return new Exploring();
	}
	@Bean
	public RockClimbing getRockClimbing() {
		return new RockClimbing();
	}
	@Bean
	public Caving getCaving() {
		return new Caving();
	}
	@Bean
	public SandBoarding getSandBoarding() {
		return new SandBoarding();
	}
	@Bean
	public Paragliding getParagliding() {
		return  new Paragliding();
	}
	@Bean
	public ZipLining getZipLining() {
		return new ZipLining();
	}
	@Bean
	public Cycling getCycling() {
		return new Cycling();
	}
	@Bean
	public MountainBiking getMountainBiking() {
		return new MountainBiking();
	}
	
	
	
	
}
