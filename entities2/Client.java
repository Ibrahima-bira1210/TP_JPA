package com.example.tp_jpa.entities2;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import lombok.Setter;

@Entity
@Getter @Setter
public class Client extends Personne {
    @Embedded
    private Address address;

    @Basic
    @Column(name = "VILLE")
    private String ville;

    @Basic
    @Column(name = "ETAT")
    private String etat;


    @Basic
    @Column(name = "CODE_ZIP")
    private String codeZip;


}
