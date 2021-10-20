package com.example.tp_jpa.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Id;

import java.io.Serializable;

public class StockPK implements Serializable {
    private int magasinId;
    private int produitId;

    @Column(name = "MAGASIN_ID")
    @Id
    public int getMagasinId() {
        return magasinId;
    }

    public void setMagasinId(int magasinId) {
        this.magasinId = magasinId;
    }

    @Column(name = "PRODUIT_ID")
    @Id
    public int getProduitId() {
        return produitId;
    }

    public void setProduitId(int produitId) {
        this.produitId = produitId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StockPK stockPK = (StockPK) o;

        if (magasinId != stockPK.magasinId) return false;
        if (produitId != stockPK.produitId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = magasinId;
        result = 31 * result + produitId;
        return result;
    }
}
