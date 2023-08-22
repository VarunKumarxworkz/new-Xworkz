package com.xworkz.Adventure;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.Adventure.config.AdventureConfig;
import com.xworkz.Adventure.interfaces.AdventureInterface;
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

public class AdventureRunner {

	public static void main(String[]args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AdventureConfig.class);
		
		AdventureInterface cave = context.getBean(Caving.class);
		
		cave.Place();
		cave.Package();
		
		
		AdventureInterface cycle = context.getBean(Cycling.class);
		
		cycle.Place();
		cycle.Package();
		
		AdventureInterface explore = context.getBean(Exploring.class);
		explore.Place();
		explore.Package();
		
		AdventureInterface hike = context.getBean(Hiking.class);
		hike.Place();
		hike.Package();
		
		AdventureInterface mountain = context.getBean(MountainBiking.class);
		mountain.Place();
		mountain.Package();
		
		AdventureInterface paraglide = context.getBean(Paragliding.class);
		paraglide.Place();
		paraglide.Package();
		
		AdventureInterface rock = context.getBean(RockClimbing.class);
		rock.Place();
		rock.Package();
		
		AdventureInterface Sand = context.getBean(SandBoarding.class);
		Sand.Place();
		Sand.Package();
		
		AdventureInterface scuba = context.getBean(ScubaDiving.class);
		scuba.Place();
		scuba.Package();
		
		AdventureInterface zip = context.getBean(ZipLining.class);
		zip.Place();
		zip.Package();
		
	}
	
	
}
