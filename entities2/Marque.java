package com.example.tp_jpa.entities2;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Marque {

    @Id
    @Column(name = "ID")
    private int id;

    @Basic
    @Column(name = "NOM")
    private String nom;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Marque marque = (Marque) o;

        if (id != marque.id) return false;
        if (nom != null ? !nom.equals(marque.nom) : marque.nom != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (nom != null ? nom.hashCode() : 0);
        return result;
    }
}
