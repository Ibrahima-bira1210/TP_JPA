package com.example.tp_jpa.entities2;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Magasin {

    @Id
    @Column(name = "ID")
    private int id;

    @Basic
    @Column(name = "NOM")
    private String nom;

    @Basic
    @Column(name = "TELEPHONE")
    private String telephone;

    @Basic
    @Column(name = "EMAIL")
    private String email;


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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Magasin magasin = (Magasin) o;

        if (id != magasin.id) return false;
        if (nom != null ? !nom.equals(magasin.nom) : magasin.nom != null) return false;
        if (telephone != null ? !telephone.equals(magasin.telephone) : magasin.telephone != null) return false;
        if (email != null ? !email.equals(magasin.email) : magasin.email != null) return false;
        if (adresse != null ? !adresse.equals(magasin.adresse) : magasin.adresse != null) return false;
        if (ville != null ? !ville.equals(magasin.ville) : magasin.ville != null) return false;
        if (etat != null ? !etat.equals(magasin.etat) : magasin.etat != null) return false;
        if (codeZip != null ? !codeZip.equals(magasin.codeZip) : magasin.codeZip != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (nom != null ? nom.hashCode() : 0);
        result = 31 * result + (telephone != null ? telephone.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (adresse != null ? adresse.hashCode() : 0);
        result = 31 * result + (ville != null ? ville.hashCode() : 0);
        result = 31 * result + (etat != null ? etat.hashCode() : 0);
        result = 31 * result + (codeZip != null ? codeZip.hashCode() : 0);
        return result;
    }
}
