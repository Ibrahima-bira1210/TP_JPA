package com.example.tp_jpa.entities;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.sql.Date;

@Entity
public class Commande {
    private int numero;
    private Integer clientId;
    private byte statut;
    private Date dateCommande;
    private Date dateLivraisonVoulue;
    private Date dateLivraison;
    private int magasinId;
    private int vendeurId;

    @Id
    @Column(name = "NUMERO")
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Basic
    @Column(name = "CLIENT_ID")
    public Integer getClientId() {
        return clientId;
    }

    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }

    @Basic
    @Column(name = "STATUT")
    public byte getStatut() {
        return statut;
    }

    public void setStatut(byte statut) {
        this.statut = statut;
    }

    @Basic
    @Column(name = "DATE_COMMANDE")
    public Date getDateCommande() {
        return dateCommande;
    }

    public void setDateCommande(Date dateCommande) {
        this.dateCommande = dateCommande;
    }

    @Basic
    @Column(name = "DATE_LIVRAISON_VOULUE")
    public Date getDateLivraisonVoulue() {
        return dateLivraisonVoulue;
    }

    public void setDateLivraisonVoulue(Date dateLivraisonVoulue) {
        this.dateLivraisonVoulue = dateLivraisonVoulue;
    }

    @Basic
    @Column(name = "DATE_LIVRAISON")
    public Date getDateLivraison() {
        return dateLivraison;
    }

    public void setDateLivraison(Date dateLivraison) {
        this.dateLivraison = dateLivraison;
    }

    @Basic
    @Column(name = "MAGASIN_ID")
    public int getMagasinId() {
        return magasinId;
    }

    public void setMagasinId(int magasinId) {
        this.magasinId = magasinId;
    }

    @Basic
    @Column(name = "VENDEUR_ID")
    public int getVendeurId() {
        return vendeurId;
    }

    public void setVendeurId(int vendeurId) {
        this.vendeurId = vendeurId;
    }

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
