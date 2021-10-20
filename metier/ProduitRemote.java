package com.example.tp_jpa.metier;

import com.example.tp_jpa.entities.Produit;
import jakarta.ejb.Remote;

import java.util.List;

@Remote
public interface ProduitRemote {
    List<Produit> findAll();
}
