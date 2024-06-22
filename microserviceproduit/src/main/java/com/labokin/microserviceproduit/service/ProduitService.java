package com.labokin.microserviceproduit.service;

import com.labokin.microserviceproduit.model.Produit;

import java.util.List;

public interface ProduitService {
    List<Produit> produits();
    Produit enregistrer(Produit produit);
}
