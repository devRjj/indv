package com.groupc.indv.model;

import com.groupc.indv.enums.RelationsType;

public class Nominee {
	
	public RelationsType getRelationType() {
		return relationType;
	}

	public void setRelationType(RelationsType relationType) {
		this.relationType = relationType;
	}

	public String getNameOfRelative() {
		return nameOfRelative;
	}

	public void setNameOfRelative(String nameOfRelative) {
		this.nameOfRelative = nameOfRelative;
	}

	private RelationsType relationType;
	
	private String nameOfRelative;
}
