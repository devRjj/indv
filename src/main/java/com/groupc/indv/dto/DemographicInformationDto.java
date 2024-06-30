package com.groupc.indv.dto;

import java.util.List;

import com.groupc.indv.model.AddressDetails;
import com.groupc.indv.model.Contacts;
import com.groupc.indv.model.Identity;
import com.groupc.indv.model.Relations;
import com.groupc.indv.enums.Gender;
import com.groupc.indv.enums.TelephoneType;
import com.groupc.indv.model.Applicantname;
import com.groupc.indv.model.DateOfBirth;
import com.groupc.indv.model.KeyPersons;
import com.groupc.indv.model.Nominee;

public class DemographicInformationDto {
	
	private String applicantId;
	
	private Applicantname name;
    private DateOfBirth dob;

    private Identity idType;
    private String idValue;

    private Relations relationType;
    private String relationValue;

    private KeyPersons keyPersonType;
    private String keyPersonValue;
    
    private Nominee nomineeType;
    private String nomineeValue;
    
    private TelephoneType phoneType;
    private String phoneNumber;
    
    private Gender gender;
    private String email;
    
    private List<Identity> ids;
    
    private List<AddressDetails> address;
    
    private List<Relations> relations;
    
    private List<Contacts> contactDetails;
    
    public String getApplicantId() {
		return applicantId;
	}

	public void setApplicantId(String applicantId) {
		this.applicantId = applicantId;
	}

	public Applicantname getName() {
		return name;
	}

	public void setName(Applicantname name) {
		this.name = name;
	}

	public DateOfBirth getDob() {
		return dob;
	}

	public void setDob(DateOfBirth dob) {
		this.dob = dob;
	}

	public Identity getIdType() {
		return idType;
	}

	public void setIdType(Identity idType) {
		this.idType = idType;
	}

	public String getIdValue() {
		return idValue;
	}

	public void setIdValue(String idValue) {
		this.idValue = idValue;
	}

	public Relations getRelationType() {
		return relationType;
	}

	public void setRelationType(Relations relationType) {
		this.relationType = relationType;
	}

	public String getRelationValue() {
		return relationValue;
	}

	public void setRelationValue(String relationValue) {
		this.relationValue = relationValue;
	}

	public KeyPersons getKeyPersonType() {
		return keyPersonType;
	}

	public void setKeyPersonType(KeyPersons keyPersonType) {
		this.keyPersonType = keyPersonType;
	}

	public String getKeyPersonValue() {
		return keyPersonValue;
	}

	public void setKeyPersonValue(String keyPersonValue) {
		this.keyPersonValue = keyPersonValue;
	}

	public Nominee getNomineeType() {
		return nomineeType;
	}

	public void setNomineeType(Nominee nomineeType) {
		this.nomineeType = nomineeType;
	}

	public String getNomineeValue() {
		return nomineeValue;
	}

	public void setNomineeValue(String nomineeValue) {
		this.nomineeValue = nomineeValue;
	}

	public TelephoneType getPhoneType() {
		return phoneType;
	}

	public void setPhoneType(TelephoneType phoneType) {
		this.phoneType = phoneType;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Identity> getIds() {
		return ids;
	}

	public void setIds(List<Identity> ids) {
		this.ids = ids;
	}

	public List<AddressDetails> getAddress() {
		return address;
	}

	public void setAddress(List<AddressDetails> address) {
		this.address = address;
	}

	public List<Relations> getRelations() {
		return relations;
	}

	public void setRelations(List<Relations> relations) {
		this.relations = relations;
	}

	public List<Contacts> getContactDetails() {
		return contactDetails;
	}

	public void setContactDetails(List<Contacts> contactDetails) {
		this.contactDetails = contactDetails;
	}

}