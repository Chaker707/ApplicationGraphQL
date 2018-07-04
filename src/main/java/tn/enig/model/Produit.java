package tn.enig.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Produit {

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;	
	private String description;
	private float prix;

	@ManyToOne
	@JoinColumn(name="categorie_id")
	private Categorie categorie;
	
	
	public Produit(String description, float prix, Categorie categorie) {		
		this.description = description;
		this.prix=prix;
		this.categorie = categorie;
	}
	
	public Produit() {			
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public float getPrix() {
		return prix;
	}

	public void setPrix(float prix) {
		this.prix = prix;
	}

	public Categorie getCategorie() {
		return this.categorie;
	}

	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}
	
	@Override
	public String toString() {
		return "Produit {id=" + id + ", description=" + description + ", Categorie=" + categorie + "}";
	}

	
	
}
