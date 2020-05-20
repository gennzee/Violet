package com.xa.model;

import javax.persistence.*;

/**
 * Created by anhnx on 20/05/2020.
 */
@Entity
@Table(name = "contact")
public class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String address;
    @Column(name = "mobile_number")
    private String mobileNumber;
    @Column
    private String email;
    @Column(name = "google_map")
    private String googleMap;

    public Contact() {
    }

    public Contact(String address, String mobileNumber, String email, String googleMap) {
        this.address = address;
        this.mobileNumber = mobileNumber;
        this.email = email;
        this.googleMap = googleMap;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGoogleMap() {
        return googleMap;
    }

    public void setGoogleMap(String googleMap) {
        this.googleMap = googleMap;
    }
}
