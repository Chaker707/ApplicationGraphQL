package tn.enig.resolver;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;

import tn.enig.dao.CategorieDao;
import tn.enig.dao.ProduitDao;
import tn.enig.model.Categorie;
import tn.enig.model.Produit;

public class Mutation implements GraphQLMutationResolver {

	private CategorieDao daocat;
	private ProduitDao daoprod;
	
	public Mutation(CategorieDao daocat, ProduitDao daoprod) {		
		this.daocat = daocat;
		this.daoprod = daoprod;
	}
	
	public Produit addProduit(String description, float prix, Integer Categorieid) {
		Produit p= new Produit(description, prix, new Categorie(Categorieid));
		daoprod.save(p);
		return p;		
	}
	
	public boolean deleteProduit(Integer id) {
		daoprod.delete(id);
		return true;
	}
	
	public Produit updateProduit(String description, float prix, Integer id) {
        Produit p = daoprod.findOne(id);
        p.setPrix(prix);
        p.setDescription(description);
        daoprod.save(p);
        return p;
    }
	

	public Categorie addCategorie(String description) {
		Categorie cat= new Categorie(description);
		daocat.save(cat);
		return cat;
	}
	
	
	public boolean deleteCategorie(Integer id) {
		daocat.delete(id);
		return true;
	}
	
	
}
