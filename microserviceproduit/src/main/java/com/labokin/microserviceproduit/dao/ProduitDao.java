package com.labokin.microserviceproduit.dao;

import com.labokin.microserviceproduit.model.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProduitDao extends JpaRepository<Produit,Long> {
}
