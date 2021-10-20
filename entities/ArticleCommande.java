package com.example.tp_jpa.entities;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "article_commande", schema = "vente", catalog = "")
@IdClass(ArticleCommandePK.class)
public class ArticleCommande {
    private int numeroCommande;
    private int ligne;
    private int produitId;
    private int quantite;
    private BigDecimal prixDepart;
    private BigDecimal remise;

    @Id
    @Column(name = "NUMERO_COMMANDE")
    public int getNumeroCommande() {
        return numeroCommande;
    }

    public void setNumeroCommande(int numeroCommande) {
        this.numeroCommande = numeroCommande;
    }

    @Id
    @Column(name = "LIGNE")
    public int getLigne() {
        return ligne;
    }

    public void setLigne(int ligne) {
        this.ligne = ligne;
    }

    @Basic
    @Column(name = "PRODUIT_ID")
    public int getProduitId() {
        return produitId;
    }

    public void setProduitId(int produitId) {
        this.produitId = produitId;
    }

    @Basic
    @Column(name = "QUANTITE")
    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    @Basic
    @Column(name = "PRIX_DEPART")
    public BigDecimal getPrixDepart() {
        return prixDepart;
    }

    public void setPrixDepart(BigDecimal prixDepart) {
        this.prixDepart = prixDepart;
    }

    @Basic
    @Column(name = "REMISE")
    public BigDecimal getRemise() {
        return remise;
    }

    public void setRemise(BigDecimal remise) {
        this.remise = remise;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ArticleCommande that = (ArticleCommande) o;

        if (numeroCommande != that.numeroCommande) return false;
        if (ligne != that.ligne) return false;
        if (produitId != that.produitId) return false;
        if (quantite != that.quantite) return false;
        if (prixDepart != null ? !prixDepart.equals(that.prixDepart) : that.prixDepart != null) return false;
        if (remise != null ? !remise.equals(that.remise) : that.remise != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = numeroCommande;
        result = 31 * result + ligne;
        result = 31 * result + produitId;
        result = 31 * result + quantite;
        result = 31 * result + (prixDepart != null ? prixDepart.hashCode() : 0);
        result = 31 * result + (remise != null ? remise.hashCode() : 0);
        return result;
    }
}
