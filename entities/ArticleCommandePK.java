package com.example.tp_jpa.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Id;

import java.io.Serializable;

public class ArticleCommandePK implements Serializable {
    private int numeroCommande;
    private int ligne;

    @Column(name = "NUMERO_COMMANDE")
    @Id
    public int getNumeroCommande() {
        return numeroCommande;
    }

    public void setNumeroCommande(int numeroCommande) {
        this.numeroCommande = numeroCommande;
    }

    @Column(name = "LIGNE")
    @Id
    public int getLigne() {
        return ligne;
    }

    public void setLigne(int ligne) {
        this.ligne = ligne;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ArticleCommandePK that = (ArticleCommandePK) o;

        if (numeroCommande != that.numeroCommande) return false;
        if (ligne != that.ligne) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = numeroCommande;
        result = 31 * result + ligne;
        return result;
    }
}
