package com.example.tp_jpa.entities;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.math.BigDecimal;

@Entity
public class Produit {
    private int id;
    private String nom;
    private int marqueId;
    private int categorieId;
    private short anneeModel;
    private BigDecimal prixDepart;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "NOM")
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Basic
    @Column(name = "MARQUE_ID")
    public int getMarqueId() {
        return marqueId;
    }

    public void setMarqueId(int marqueId) {
        this.marqueId = marqueId;
    }

    @Basic
    @Column(name = "CATEGORIE_ID")
    public int getCategorieId() {
        return categorieId;
    }

    public void setCategorieId(int categorieId) {
        this.categorieId = categorieId;
    }

    @Basic
    @Column(name = "ANNEE_MODEL")
    public short getAnneeModel() {
        return anneeModel;
    }

    public void setAnneeModel(short anneeModel) {
        this.anneeModel = anneeModel;
    }

    @Basic
    @Column(name = "PRIX_DEPART")
    public BigDecimal getPrixDepart() {
        return prixDepart;
    }

    public void setPrixDepart(BigDecimal prixDepart) {
        this.prixDepart = prixDepart;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Produit produit = (Produit) o;

        if (id != produit.id) return false;
        if (marqueId != produit.marqueId) return false;
        if (categorieId != produit.categorieId) return false;
        if (anneeModel != produit.anneeModel) return false;
        if (nom != null ? !nom.equals(produit.nom) : produit.nom != null) return false;
        if (prixDepart != null ? !prixDepart.equals(produit.prixDepart) : produit.prixDepart != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (nom != null ? nom.hashCode() : 0);
        result = 31 * result + marqueId;
        result = 31 * result + categorieId;
        result = 31 * result + (int) anneeModel;
        result = 31 * result + (prixDepart != null ? prixDepart.hashCode() : 0);
        return result;
    }
}
