package com.groupc.indv.enums;

public enum CreditPurposeType {
	
	ACCTOUNT_ORIGINATION("CP01"),
	ACCTOUNT_MAINTENANCE("CP02"),
	OTHER("CP03");
	
	private String code;

	private CreditPurposeType(String code) {
		this.code = code;
	}
	
	
}
