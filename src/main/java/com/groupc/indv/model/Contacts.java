package com.groupc.indv.model;

import com.groupc.indv.enums.TelephoneType;

public class Contacts {
	
	private TelephoneType typeOfNumber;
	
	private String number;

	public TelephoneType getTypeOfNumber() {
		return typeOfNumber;
	}

	public void setTypeOfNumber(TelephoneType typeOfNumber) {
		this.typeOfNumber = typeOfNumber;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}
	

}
