package com.groupc.indv.model;

import javax.persistence.*;

@Entity
@Table(name = "applicant")
public class ApplicantModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "name_id", referencedColumnName = "id")
    private ApplicantName nameOfApplicant;

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

    // Getters and setters
}