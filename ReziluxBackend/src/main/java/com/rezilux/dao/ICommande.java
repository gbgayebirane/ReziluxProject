package com.rezilux.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rezilux.entities.Commande;

@Repository
public interface ICommande extends JpaRepository<Commande, Integer>{

}
