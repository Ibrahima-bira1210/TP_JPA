package com.example.tp_jpa.entities;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Objects;

@Entity
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



    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
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
