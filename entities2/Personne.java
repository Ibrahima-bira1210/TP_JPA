package com.example.tp_jpa.entities2;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Entity
@Getter @Setter
public class Personne {
    @Id
    @Column(name = "ID")
    private int id;
    @Basic
    @Column(name = "PRENOM")
    private String prenom;
    @Basic
    @Column(name = "NOM")
    private String nom;
    @Basic
    @Column(name = "EMAIL")
    private String email;
    @Basic
    @Column(name = "TELEPHONE")
    private String telephone;

    public int getId() {
        return id;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Personne)) return false;
        Personne personne = (Personne) o;
        return id == personne.id && nom.equals(personne.nom) && prenom.equals(personne.prenom) && telephone.equals(personne.telephone) && email.equals(personne.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nom, prenom, telephone, email);
    }

    @Override
    public String toString() {
        return "Personne{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", telephone='" + telephone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
