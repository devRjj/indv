package com.groupc.indv.enums;

public enum CreditPurposeTypeDescription {
		
	    A01("Auto Loan (Personal)"),
	    A02("Auto Overdraft"),
	    A03("Two-Wheeler Loan"),
	    A04("Commercial Vehicle Loan"),
	    A05("Commercial Equipment Loan"),
	    A06("Housing Loan"),
	    A07("Property Loan"),
	    A08("Loan Against Shares / Securities"),
	    A09("Gold Loan"),
	    A10("Education Loan"),
	    A11("Leasing"),
	    A12("Personal Loan"),
	    A13("Consumer Loan"),
	    A14("Loan to Professional"),
	    A15("Credit Card"),
	    A16("Charge Card"),
	    A17("Fleet Card"),
	    A18("Loan against Card"),
	    A19("Overdraft"),
	    A20("Loan Against Bank Deposits"),
	    A21("OD on Savings Account"),
	    A22("Non-Funded Credit Facility"),
	    A23("Business Loan General"),
	    A24("Business Loan Priority Sector Small Business"),
	    A25("Business Loan Priority Sector Agriculture"),
	    A26("Business Loan Priority Sector Others"),
	    A27("Business Non-Funded Credit Facility General"),
	    A28("Business Non-Funded Credit Facility-Priority Sector-Small Business"),
	    A29("Business Non-Funded Credit Facility-Priority Sector-Agriculture"),
	    A30("Business Non-Funded Credit Facility-Priority Sector-Others"),
	    A31("Business Loan Against Bank Deposits"),
	    A32("Other"),
	    A33("Commercial Vehicle Loan"),
	    A34("Telco Wireless"),
	    A35("Telco Broadband"),
	    A36("Telco Landline"),
	    A37("Microfinance Business Loan"),
	    A38("Microfinance Personal Loan"),
	    A39("Microfinance Housing Loan"),
	    A40("Microfinance Others"),
	    A41("Used Car Loan"),
	    A42("Construction Equipment Loan"),
	    A43("Used Tractor Loan"),
	    A60("Staff Loan"),
	    A61("Secured Credit Card"),
	    A62("Corporate Credit Card"),
	    A63("Kisan Credit Card"),
	    A64("Loan on Credit Card"),
	    A65("Prime Minister Jana Dhan Yojana - Overdraft"),
	    A66("Mudra Loans – Shishu / Kishor / Tarun"),
	    A67("Business Loan - Secured"),
	    A68("Business Loan - Unsecured"),
	    A69("Pradhan Mantri Awas Yojana - CLSS"),
	    A70("Seller Financing"),
	    A71("GECL Loan Secured"),
	    A72("GECL Loan Unsecured"),
	    A74("Short Term Personal Loan"),
	    A75("Priority Sector Gold Loan"),
	    A76("Temporary Overdraft"),
	    T01("JLG Group"),
	    T02("JLG Individual"),
	    T03("Individual"),
	    T04("SHG Group"),
	    T05("SHG Individual"),
	    T06("SHG Group- Govt"),
	    T07("SHG Intra- Group"),
	    T08("Others");

	    private final String description;

	    private CreditPurposeTypeDescription(String description) {
	        this.description = description;
	    }

}
