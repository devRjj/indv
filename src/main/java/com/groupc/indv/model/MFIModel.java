package com.groupc.indv.model;

import javax.persistence.*;

@Entity
@Table(name = "mfi")
public class MFIModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private boolean indv;
    private boolean score;
    private boolean group;
   
	public boolean isIndv() {
		return indv;
	}
	public void setIndv(boolean indv) {
		this.indv = indv;
	}
	public boolean isScore() {
		return score;
	}
	public void setScore(boolean score) {
		this.score = score;
	}
	public boolean isGroup() {
		return group;
	}
	public void setGroup(boolean group) {
		this.group = group;
	}

    
}
