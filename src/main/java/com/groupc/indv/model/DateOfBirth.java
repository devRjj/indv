package com.groupc.indv.model;

import javax.persistence.*;

@Entity
@Table(name = "date_of_birth")
public class DateOfBirth {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String dobDate;
    private String age;
    private String ageAsOn;

	public String getDobDate() {
		return dobDate;
	}

	public void setDobDate(String dobDate) {
		this.dobDate = dobDate;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getAgeAsOn() {
		return ageAsOn;
	}

	public void setAgeAsOn(String ageAsOn) {
		this.ageAsOn = ageAsOn;
	}


}
