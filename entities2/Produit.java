package com.example.tp_jpa.entities2;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Getter @Setter
public class Produit {

    @Id
    @Column(name = "ID")
    private int id;

    @Basic
    @Column(name = "NOM")
    private String nom;

    @Basic
    @Column(name = "MARQUE_ID")
    private int marqueId;

    @Basic
    @Column(name = "CATEGORIE_ID")
    private int categorieId;

    @Basic
    @Column(name = "ANNEE_MODEL")
    private short anneeModel;

    @Basic
    @Column(name = "PRIX_DEPART")
    private BigDecimal prixDepart;



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
