package com.groupc.indv.model;

import javax.persistence.*;

import com.groupc.indv.enums.RelationsType;

@Entity
@Table(name = "relations")
public class Relations {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private RelationsType relationType;

    private String nameOfRelative;

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

}
