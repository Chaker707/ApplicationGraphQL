package tn.enig.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import tn.enig.model.Produit;

public interface ProduitDao extends CrudRepository<Produit, Integer>{
	
	@Query("select p from Produit p where p.categorie.id= :id")
	public Iterable<Produit> getAllProdByCat(@Param("id") Integer id);

}
