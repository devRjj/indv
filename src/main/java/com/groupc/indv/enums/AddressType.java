package com.groupc.indv.enums;

public enum AddressType {
		
    D01("Residence"), D02("Company"), D03("Res Cum Off"),
    D04("Permanent"), D05("Current"), D06("Foreign"),
    D07("Military"), D08("Other"), D12("Mortgage property address");
	
    private final String description;
	
    private AddressType(String description) {
        this.description = description;
    }
}
