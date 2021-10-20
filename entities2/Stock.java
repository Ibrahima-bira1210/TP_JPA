package com.example.tp_jpa.entities2;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@IdClass(StockPK.class)
@Getter @Setter
public class Stock {

    @Id
    @Column(name = "MAGASIN_ID")
    private int magasinId;

    @Id
    @Column(name = "PRODUIT_ID")
    private int produitId;

    @Basic
    @Column(name = "QUANTITE")
    private int quantite;


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
