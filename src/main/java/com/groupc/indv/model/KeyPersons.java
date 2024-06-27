package com.groupc.indv.model;

import com.groupc.indv.enums.RelationsType;

public class KeyPersons {
	
	private RelationsType relationType;
	
	private String nameOfTheKeyPerson;

	public RelationsType getRelationType() {
		return relationType;
	}

	public void setRelationType(RelationsType relationType) {
		this.relationType = relationType;
	}

	public String getNameOfTheKeyPerson() {
		return nameOfTheKeyPerson;
	}

	public void setNameOfTheKeyPerson(String nameOfTheKeyPerson) {
		this.nameOfTheKeyPerson = nameOfTheKeyPerson;
	}

}
