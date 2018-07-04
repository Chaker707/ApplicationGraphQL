package tn.enig.dao;

import org.springframework.data.repository.CrudRepository;

import tn.enig.model.Produit;

public interface ProduitDao extends CrudRepository<Produit, Integer>{

}
