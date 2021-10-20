package com.example.tp_jpa.entities;

import jakarta.persistence.*;

@Entity
public class Client extends Personne {
    @Embedded
    private Address address;
    private String ville;
    private String etat;
    private String codeZip;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Basic
    @Column(name = "VILLE")
    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    @Basic
    @Column(name = "ETAT")
    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    @Basic
    @Column(name = "CODE_ZIP")
    public String getCodeZip() {
        return codeZip;
    }

    public void setCodeZip(String codeZip) {
        this.codeZip = codeZip;
    }

}
