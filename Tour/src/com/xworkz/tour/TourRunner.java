package com.xworkz.tour;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.tour.app.Goa;
import com.xworkz.tour.app.KannyaKumari;
import com.xworkz.tour.app.KodaiKanal;
import com.xworkz.tour.app.Ooty;
import com.xworkz.tour.app.Pondichery;
import com.xworkz.tour.app.TourInterface;
import com.xworkz.tour.config.TourConfig;

public class TourRunner {

	public static void main(String [] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(TourConfig.class);
		
		TourInterface ooy = context.getBean(Ooty.class);
		ooy.Vehicle();
		ooy.Package();
		
		
		TourInterface kodai = context.getBean(KodaiKanal.class);
		kodai.Vehicle();
		kodai.Package();
		
		TourInterface goa = context.getBean(Goa.class);
		goa.Vehicle();
		goa.Package();
		
		TourInterface Pondi = context.getBean(Pondichery.class);
		Pondi.Vehicle();
		Pondi.Package();
		
		TourInterface Kannya = context.getBean(KannyaKumari.class);
		Kannya.Vehicle();
		Kannya.Package();
		
	}
	
}
