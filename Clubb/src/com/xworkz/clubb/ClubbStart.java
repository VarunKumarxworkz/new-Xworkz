package com.xworkz.clubb;
import com.xworkz.clubb.dto.ClubbDto;
import com.xworkz.clubb.service.ClubbService;
import com.xworkz.clubb.service.ClubbServiceImpl;

public class ClubbStart {
public static void main(String[] args) {
	ClubbDto dto = new ClubbDto(1,"dark","banasankari",1000,"Couples","Dont Drink And Drive");
	ClubbDto dto1 = new ClubbDto(2,"white","jaynagar",1500,"Couples","Dont Drink And Drive");
	ClubbDto dto2 = new ClubbDto(3,"bullbull","Briget",2000,"Couples","Dont Drink And Drive");
	ClubbService service = new ClubbServiceImpl();
	
//	boolean SAVe = service.save(dto2);
//	System.out.println(SAVe);
//  service.read(1);	
	service.update(dto2);
}

}
