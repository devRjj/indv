package com.groupc.indv.model;

import javax.persistence.*;

import com.groupc.indv.enums.TelephoneType;

@Entity
@Table(name = "contacts")
public class Contacts {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private TelephoneType typeOfNumber;

    private String number;

	public TelephoneType getTypeOfNumber() {
		return typeOfNumber;
	}

	public void setTypeOfNumber(TelephoneType typeOfNumber) {
		this.typeOfNumber = typeOfNumber;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}
}
