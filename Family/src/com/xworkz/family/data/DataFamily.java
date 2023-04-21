package com.xworkz.family.data;

public class DataFamily {
  
	public String FamilyName;
	public int noOfMembers;
	public String HeadOfthefamily;
	public int noOfChildern;
	public String FamilyType;
	
	
	public DataFamily(String FamilyName, int noOfMembers, String HeadOfthefamily, int noOfChildern,String FamilyType) {
		
	this.FamilyName = FamilyName;
	this.noOfMembers = noOfMembers;
	this.HeadOfthefamily = HeadOfthefamily;
	this.noOfChildern = noOfChildern;
	this.FamilyType = FamilyType;
		
		
	}
	
	
	public String toString() {
		return "FamilyName= "+FamilyName    +"FamilyMembers ="+noOfMembers +"Head ="+HeadOfthefamily  +"Children ="+noOfChildern +"Type ="+FamilyType;
		
	}
	
	public boolean equals(DataFamily  family01) {
		
		if( this.FamilyName.equals(FamilyName) && this.HeadOfthefamily.equals(HeadOfthefamily) && this.noOfMembers ==family01.noOfMembers) {
			
			return true;	
		}
		else {
			return false;
		}
		
		
	}
	
	
	
	
	
}
