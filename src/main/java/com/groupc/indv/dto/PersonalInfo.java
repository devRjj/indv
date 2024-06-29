package com.groupc.indv.dto;

import com.groupc.indv.enums.Gender;
import com.groupc.indv.enums.TelephoneType;
import com.groupc.indv.model.ApplicantName;
import com.groupc.indv.model.DateOfBirth;
import com.groupc.indv.model.Identity;
import com.groupc.indv.model.KeyPersons;
import com.groupc.indv.model.Nominee;
import com.groupc.indv.model.Relations;

public class PersonalInfo {

    private ApplicantName name;
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

    public ApplicantName getName() {
        return name;
    }

    public void setName(ApplicantName name) {
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

    @Override
    public String toString() {
        return "PersonalInfo{" +
                "name=" + name +
                ", dob=" + dob +
                ", idType=" + idType +
                ", idValue='" + idValue + '\'' +
                ", relationType=" + relationType +
                ", relationValue='" + relationValue + '\'' +
                ", keyPersonType=" + keyPersonType +
                ", keyPersonValue='" + keyPersonValue + '\'' +
                ", nomineeType=" + nomineeType +
                ", nomineeValue='" + nomineeValue + '\'' +
                ", phoneType=" + phoneType +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", gender=" + gender +
                ", email='" + email + '\'' +
                '}';
    }
}
