package com.groupc.indv.enums;

public enum Gender {
	
	MALE("G01"),
	FEMALE("G02"),
	OTHERS("G03");
	
	private final String genderCode;
	
	private Gender(String gender){
		this.genderCode = gender;
	}

}
