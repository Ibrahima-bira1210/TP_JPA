package com.example.tp_jpa.entities;

import jakarta.persistence.*;

@Entity
@IdClass(StockPK.class)
public class Stock {
    private int magasinId;
    private int produitId;
    private int quantite;

    @Id
    @Column(name = "MAGASIN_ID")
    public int getMagasinId() {
        return magasinId;
    }

    public void setMagasinId(int magasinId) {
        this.magasinId = magasinId;
    }

    @Id
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Stock stock = (Stock) o;

        if (magasinId != stock.magasinId) return false;
        if (produitId != stock.produitId) return false;
        if (quantite != stock.quantite) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = magasinId;
        result = 31 * result + produitId;
        result = 31 * result + quantite;
        return result;
    }
}
