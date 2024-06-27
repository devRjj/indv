package com.groupc.indv.dto;

import com.groupc.indv.enums.Gender;
import com.groupc.indv.enums.TelephoneType;
import com.groupc.indv.model.Applicantname;
import com.groupc.indv.model.DOB;
import com.groupc.indv.model.Identity;
import com.groupc.indv.model.KeyPersons;
import com.groupc.indv.model.Nominee;
import com.groupc.indv.model.Relations;

public class PersonalInfo {
	
	private Applicantname name;
	
	private DOB dob;
	
	private Identity idType;
	private Identity idValue;
	
	private Relations relationType;
	private Relations relationValue;
	
	private KeyPersons keyPersonType;
	private KeyPersons keyPersonValue;

	private Nominee nomineeType;
	private Nominee nomineeValue;

	private TelephoneType phoneType;
	private TelephoneType phoneNumber;
	
	private Gender gender;
	private String email;
	
	public Applicantname getName() {
		return name;
	}
	public void setName(Applicantname name) {
		this.name = name;
	}
	public DOB getDob() {
		return dob;
	}
	public void setDob(DOB dob) {
		this.dob = dob;
	}
	public Identity getIdType() {
		return idType;
	}
	public void setIdType(Identity idType) {
		this.idType = idType;
	}
	public Identity getIdValue() {
		return idValue;
	}
	public void setIdValue(Identity idValue) {
		this.idValue = idValue;
	}
	public Relations getRelationType() {
		return relationType;
	}
	public void setRelationType(Relations relationType) {
		this.relationType = relationType;
	}
	public Relations getRelationValue() {
		return relationValue;
	}
	public void setRelationValue(Relations relationValue) {
		this.relationValue = relationValue;
	}
	public KeyPersons getKeyPersonType() {
		return keyPersonType;
	}
	public void setKeyPersonType(KeyPersons keyPersonType) {
		this.keyPersonType = keyPersonType;
	}
	public KeyPersons getKeyPersonValue() {
		return keyPersonValue;
	}
	public void setKeyPersonValue(KeyPersons keyPersonValue) {
		this.keyPersonValue = keyPersonValue;
	}
	public Nominee getNomineeType() {
		return nomineeType;
	}
	public void setNomineeType(Nominee nomineeType) {
		this.nomineeType = nomineeType;
	}
	public Nominee getNomineeValue() {
		return nomineeValue;
	}
	public void setNomineeValue(Nominee nomineeValue) {
		this.nomineeValue = nomineeValue;
	}
	public TelephoneType getPhoneType() {
		return phoneType;
	}
	public void setPhoneType(TelephoneType phoneType) {
		this.phoneType = phoneType;
	}
	public TelephoneType getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(TelephoneType phoneNumber) {
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


}
