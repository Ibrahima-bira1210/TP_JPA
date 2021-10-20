package com.example.tp_jpa.entities2;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import lombok.Setter;

import java.io.Serializable;

@Getter @Setter
public class StockPK implements Serializable {

    @Column(name = "MAGASIN_ID")
    @Id
    private int magasinId;

    @Column(name = "PRODUIT_ID")
    @Id
    private int produitId;



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
