package com.labokin.microserviceproduit.controller;

import com.labokin.microserviceproduit.model.Produit;
import com.labokin.microserviceproduit.service.ProduitService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class ProduitController {
    private final ProduitService service;
    @GetMapping("/produits")
    public List<Produit> produits(){
        return service.produits();
    }
    @PostMapping("/produit")
    public Produit enregistrer(@RequestBody Produit produit){
        return service.enregistrer(produit);
    }
}
