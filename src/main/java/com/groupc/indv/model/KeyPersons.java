package com.groupc.indv.model;

import javax.persistence.*;

import com.groupc.indv.enums.RelationsType;

@Entity
@Table(name = "key_persons")
public class KeyPersons {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
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
