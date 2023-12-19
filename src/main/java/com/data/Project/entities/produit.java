package com.data.Project.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="t-produit")
public class produit {
  
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	long id;
	@Column(name="nom")
	String nom ;
	String description ;
	double prix ;
	public long getId() {
		return id;
	}
	@Override
	public String toString() {
		return "produit [id=" + id + ", nom=" + nom + ", description=" + description + ", prix=" + prix + "]";
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	public produit(String nom, String description, double prix) {
		super();
		this.nom = nom;
		this.description = description;
		this.prix = prix;
	}
	public produit() {
		super();
	} 
}
