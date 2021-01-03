package com.rezilux.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Article {
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)  //AUTO INCREMENT
	private int idA;
	@Column(length=200)
	private String name;
	@Column(length=200)
	private Double price;
	@Column(length=200)
	private String image;
	@OneToMany(mappedBy="article")
    private List<Detail> detail =new ArrayList<Detail>();
	public Article() {
		super();
	}
	public Article(int idA, String name, Double price, String image, List<Detail> detail) {
		super();
		this.idA = idA;
		this.name = name;
		this.price = price;
		this.image = image;
		this.detail = detail;
	}
	
	public int getIdA() {
		return idA;
	}
	public void setIdA(int idA) {
		this.idA = idA;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public List<Detail> getDetail() {
		return detail;
	}
	public void setDetail(List<Detail> detail) {
		this.detail = detail;
	}
	
}
