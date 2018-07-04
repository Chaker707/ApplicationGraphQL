package tn.enig.resolver;



import com.coxautodev.graphql.tools.GraphQLQueryResolver;

import tn.enig.dao.CategorieDao;
import tn.enig.dao.ProduitDao;
import tn.enig.model.Categorie;
import tn.enig.model.Produit;

public class Query implements GraphQLQueryResolver {
	
	private CategorieDao daocat;
	private ProduitDao daoprod;
	
	public Query(CategorieDao daocat, ProduitDao daoprod) {		
		this.daocat = daocat;
		this.daoprod = daoprod;
	}
	
	public Iterable<Produit> getAllProduit(){
		return daoprod.findAll();
	}
	
	public Iterable<Categorie> getAllcategorie(){
		return daocat.findAll();
	}
	
	public Produit getProduit(Integer id) {
		return daoprod.findOne(id);
	}
	

}
