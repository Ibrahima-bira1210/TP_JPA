package com.example.tp_jpa.entities2;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Table(name = "article_commande", schema = "vente", catalog = "")
@IdClass(ArticleCommandePK.class)
@Getter @Setter
public class ArticleCommande {
    @Id
    @Column(name = "NUMERO_COMMANDE")
    private int numeroCommande;

    @Id
    @Column(name = "LIGNE")
    private int ligne;

    @Basic
    @Column(name = "PRODUIT_ID")
    private int produitId;


    @Basic
    @Column(name = "QUANTITE")
    private int quantite;

    @Basic
    @Column(name = "PRIX_DEPART")
    private BigDecimal prixDepart;

    @Basic
    @Column(name = "REMISE")
    private BigDecimal remise;



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
