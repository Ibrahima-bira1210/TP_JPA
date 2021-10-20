package com.example.tp_jpa.entities;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
    @Column(name = "address", nullable = false)
    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}



