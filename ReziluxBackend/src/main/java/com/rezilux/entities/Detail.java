package com.rezilux.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Detail {
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)  //AUTO INCREMENT
	private int id;
	@Column(length=200)
	private int quantity;
	@Column(length=200)
	private Double price;
	@ManyToOne
	private Article article= new Article();
	@ManyToOne
	private Commande commande= new Commande();
	public Detail() {
		super();
	}
	public Detail(int id, int quantity, Double price, Article article, Commande commande) {
		super();
		this.id = id;
		this.quantity = quantity;
		this.price = price;
		this.article = article;
		this.commande = commande;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Article getArticle() {
		return article;
	}
	public void setArticle(Article article) {
		this.article = article;
	}
	public Commande getCommande() {
		return commande;
	}
	public void setCommande(Commande commande) {
		this.commande = commande;
	}
	
}
