package com.groupc.indv.model;

import javax.persistence.*;

import com.groupc.indv.enums.AddressType;
import com.groupc.indv.enums.StateCode;

@Entity
@Table(name = "address_details")
public class AddressDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private AddressType addressType;

    private String address;
    private String city;

    @Enumerated(EnumType.STRING)
    private StateCode state;

    private String pincode;

    public AddressDetails() { }

    public AddressDetails(AddressType addressType, String address, String city, StateCode state, String pincode) {
        this.addressType = addressType;
        this.address = address;
        this.city = city;
        this.state = state;
        this.pincode = pincode;
    }
    
    public AddressType getAddressType() {
        return addressType;
    }

    public void setAddressType(AddressType addressType) {
        this.addressType = addressType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public StateCode getState() {
        return state;
    }

    public void setState(StateCode state) {
        this.state = state;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }
}
