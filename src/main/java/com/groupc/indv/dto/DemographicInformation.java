package com.groupc.indv.dto;

import java.util.List;

import com.groupc.indv.model.AddressDetails;
import com.groupc.indv.model.Contacts;
import com.groupc.indv.model.Identity;
import com.groupc.indv.model.Relations;

public class DemographicInformation {
	
	private String applicantId;
	
	private PersonalInfo personalInfo;
	
	private List<Identity> ids;
	
	private List<AddressDetails> address;
	
	private List<Relations> relations;
	
	private List<Contacts> contactDetails;

}
