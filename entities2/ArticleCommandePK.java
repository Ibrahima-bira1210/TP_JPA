package com.example.tp_jpa.entities2;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter @Setter
public class ArticleCommandePK implements Serializable {
    @Column(name = "NUMERO_COMMANDE")
    @Id
    private int numeroCommande;

    @Column(name = "LIGNE")
    @Id
    private int ligne;

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
