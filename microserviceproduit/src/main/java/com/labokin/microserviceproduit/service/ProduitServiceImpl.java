package com.labokin.microserviceproduit.service;

import com.labokin.microserviceproduit.dao.ProduitDao;
import com.labokin.microserviceproduit.model.Produit;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class ProduitServiceImpl implements ProduitService{
    private final ProduitDao depot;

    @Override
    public List<Produit> produits() {
        return depot.findAll();
    }

    @Override
    public Produit enregistrer(Produit produit) {
        return depot.save(produit);
    }
}
