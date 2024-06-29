package com.groupc.indv.model;

import javax.persistence.*;

@Entity
@Table(name = "applicant")
public class ApplicantModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "name_id", referencedColumnName = "applicantId")
    private Applicantname nameOfApplicant;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "dob_id", referencedColumnName = "id")
    private DateOfBirth dob;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "identity_id", referencedColumnName = "id")
    private Identity identity;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "relative_info_id", referencedColumnName = "id")
    private Relations relativeInformation;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "key_person_id", referencedColumnName = "id")
    private KeyPersons keyperson;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "nominee_id", referencedColumnName = "id")
    private Nominee nominee;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "contact_details_id", referencedColumnName = "id")
    private Contacts contactDetails;

    private String email;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Applicantname getNameOfApplicant() {
		return nameOfApplicant;
	}

	public void setNameOfApplicant(Applicantname nameOfApplicant) {
		this.nameOfApplicant = nameOfApplicant;
	}

	public DateOfBirth getDob() {
		return dob;
	}

	public void setDob(DateOfBirth dob) {
		this.dob = dob;
	}

	public Identity getIdentity() {
		return identity;
	}

	public void setIdentity(Identity identity) {
		this.identity = identity;
	}

	public Relations getRelativeInformation() {
		return relativeInformation;
	}

	public void setRelativeInformation(Relations relativeInformation) {
		this.relativeInformation = relativeInformation;
	}

	public KeyPersons getKeyperson() {
		return keyperson;
	}

	public void setKeyperson(KeyPersons keyperson) {
		this.keyperson = keyperson;
	}

	public Nominee getNominee() {
		return nominee;
	}

	public void setNominee(Nominee nominee) {
		this.nominee = nominee;
	}

	public Contacts getContactDetails() {
		return contactDetails;
	}

	public void setContactDetails(Contacts contactDetails) {
		this.contactDetails = contactDetails;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}