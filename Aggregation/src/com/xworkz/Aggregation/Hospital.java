package com.xworkz.Aggregation;

public class Hospital {
  
	String hospitalName;
	long phoneNumber;
	Employee emp;
	Treatment Recover;
	Patient Sufferers;
	Doctor Doc;
	
public Hospital(String hospitalName,long phoneNumber,Employee emp,Treatment Recover,Patient Sufferers,Doctor Doc) {
	this.hospitalName = hospitalName;
	this.phoneNumber = phoneNumber;
	this.emp = emp;
	this.Recover = Recover;
	this.Sufferers = Sufferers;
	this.Doc = Doc;
}



	
	
	
	
	
	
	
	
	
public static void main(String[] args) {

	
	Doctor doc = new Doctor("Umesh","MBBS","Nutrietion",67,200000);
	
	Patient Pat = new Patient("Jay","HeartAttack",45,50000,7867654325l);
	
	Employee Emp = new Employee("ulaga","Cleaner",15000,10,18);
	
	Treatment tre = new Treatment("plainRadioGraphy",6000,6,"radiation",15);
	
	Hospital hos = new Hospital("VIP",9876567956l,Emp,tre,Pat,doc);
	
	System.out.println(doc.Name);
	System.out.println(doc.Desigination);
	System.out.println(doc.Specialization);
	System.out.println(doc.Age);
	System.out.println(doc.Salary);
	
	
	System.out.println(Emp.Id);
	System.out.println(Emp.Position);
	System.out.println(Emp.Wages);
    System.out.println(Emp.hourOfWorking);

}
	
}
