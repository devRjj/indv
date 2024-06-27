package com.groupc.indv.enums;

public enum TelephoneType {
	
	Residence("P01"),
	Company("P02"),
	Mobile("P03"),
	Permanent("P04"),
	Foreign("P05"),
	Other("P06"),
	Untagged("P07");
	
	private final String telephoneCode;
	
	private TelephoneType(String teleCode) {
		this.telephoneCode = teleCode;
	}

}
