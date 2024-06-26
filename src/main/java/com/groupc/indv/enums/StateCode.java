package com.groupc.indv.enums;

public enum StateCode {
		
		AP("Andhra Pradesh"),
		AR("Andhra Pradesh "),
		AS("Assam"),
		BR("Bihar"),
		CG("Chhattisgarh"),
		GA("Goa"),
		GJ("Gujarat"),
		HR("Haryana"),
		HP("Himachal Pradesh"),
		JK("Jammu & Kashmir"),
		JH("Jharkhand"),
		KA("Karnataka"),
		KL("Kerala"),
		MP("Madhya Pradesh"),
		MH("Maharashtra"),
		MN("Manipur"),
		ML("Meghalaya"),
		MZ("Mizoram"),
		NL("Nagaland"),
		OR("Orissa"),
		PB ("Punjab"), 
		RJ ("Rajasthan"), 
		SK ("Sikkim"), 
		TN ("Tamil Nadu"),
		TS ("Telangana"), 
		TR ("Tripura"), 
		UK ("Uttarakhand"), 
		UP ("Uttar Pradesh"), 
		WB ("West Bengal"),
		AN ("Andaman & Nicobar"),
		CH ("Chandigarh"), 
		DN ("Dadra and Nagar Haveli"),
		DD ("Daman & Diu"),
		DL ("Delhi"), 
		LD ("Lakshadweep"), 
		PY ("Pondicherry"),
		DNHDD ("Dadra & Nagar Haveli and Daman & Diu"), 
		LA ("Ladakh");
		
	    private final String stateName;

	    private StateCode(String stateName) {
	        this.stateName = stateName;
	    }

}
