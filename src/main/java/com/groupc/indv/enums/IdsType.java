package com.groupc.indv.enums;

public enum IdsType {
	
	Passport("ID01"),
	Voter_ID("ID02"),
	UID("ID03"),
	Others("ID04"),
	Ration_Card("ID05"),
	DrivingLicenseNumber("ID06"),
	Pan("ID07"),
	NregaCard_Number("ID08"),
	CKYC("ID09");

	private final String telephoneCode;
	
	private IdsType(String teleCode) {
		this.telephoneCode = teleCode;
	}
}
