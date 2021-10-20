package com.example.tp_jpa.entities;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employe extends Personne {

    private byte actif;
    private int magasinId;
    private Integer managerId;



    @Basic
    @Column(name = "ACTIF")
    public byte getActif() {
        return actif;
    }

    public void setActif(byte actif) {
        this.actif = actif;
    }

    @Basic
    @Column(name = "MAGASIN_ID")
    public int getMagasinId() {
        return magasinId;
    }

    public void setMagasinId(int magasinId) {
        this.magasinId = magasinId;
    }

    @Basic
    @Column(name = "MANAGER_ID")
    public Integer getManagerId() {
        return managerId;
    }

    public void setManagerId(Integer managerId) {
        this.managerId = managerId;
    }


}
