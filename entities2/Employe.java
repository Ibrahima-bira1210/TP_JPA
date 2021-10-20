package com.example.tp_jpa.entities2;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Setter;

@Entity
@Getter @Setter
public class Employe extends Personne {

    @Basic
    @Column(name = "ACTIF")
    private byte actif;

    @Basic
    @Column(name = "MAGASIN_ID")
    private int magasinId;

    @Basic
    @Column(name = "MANAGER_ID")
    private Integer managerId;


}
