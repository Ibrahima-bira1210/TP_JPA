package com.example.tp_jpa.entities2;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

@Entity
@Getter @Setter
public class Commande {
    @Id
    @Column(name = "NUMERO")
    private int numero;


    @Basic
    @Column(name = "CLIENT_ID")
    private Integer clientId;

    @Basic
    @Column(name = "STATUT")
    private byte statut;

    @Basic
    @Column(name = "DATE_COMMANDE")
    private Date dateCommande;

    @Basic
    @Column(name = "DATE_LIVRAISON_VOULUE")
    private Date dateLivraisonVoulue;

    @Basic
    @Column(name = "DATE_LIVRAISON")
    private Date dateLivraison;

    @Basic
    @Column(name = "MAGASIN_ID")
    private int magasinId;

    @Basic
    @Column(name = "VENDEUR_ID")
    private int vendeurId;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Commande commande = (Commande) o;

        if (numero != commande.numero) return false;
        if (statut != commande.statut) return false;
        if (magasinId != commande.magasinId) return false;
        if (vendeurId != commande.vendeurId) return false;
        if (clientId != null ? !clientId.equals(commande.clientId) : commande.clientId != null) return false;
        if (dateCommande != null ? !dateCommande.equals(commande.dateCommande) : commande.dateCommande != null)
            return false;
        if (dateLivraisonVoulue != null ? !dateLivraisonVoulue.equals(commande.dateLivraisonVoulue) : commande.dateLivraisonVoulue != null)
            return false;
        if (dateLivraison != null ? !dateLivraison.equals(commande.dateLivraison) : commande.dateLivraison != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = numero;
        result = 31 * result + (clientId != null ? clientId.hashCode() : 0);
        result = 31 * result + (int) statut;
        result = 31 * result + (dateCommande != null ? dateCommande.hashCode() : 0);
        result = 31 * result + (dateLivraisonVoulue != null ? dateLivraisonVoulue.hashCode() : 0);
        result = 31 * result + (dateLivraison != null ? dateLivraison.hashCode() : 0);
        result = 31 * result + magasinId;
        result = 31 * result + vendeurId;
        return result;
    }
}
