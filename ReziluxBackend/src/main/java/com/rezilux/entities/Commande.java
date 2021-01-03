package com.rezilux.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;


@Entity
public class Commande {
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)  //AUTO INCREMENTs
	private int idC;
	@Column(length=200)
	private String ref;
	@Column
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date date;
	@Column(length=200)
	private int status;
	@ManyToOne
	private Client client= new Client();
	@OneToMany(mappedBy="commande")
    private List<Detail> detail =new ArrayList<Detail>();
	public Commande() {
		super();
	}
	public Commande(int idC, String ref, Date date, int status, Client client, List<Detail> detail) {
		super();
		this.idC = idC;
		this.ref = ref;
		this.date = date;
		this.status = status;
		this.client = client;
		this.detail = detail;
	}
	public int getIdC() {
		return idC;
	}
	public void setIdC(int idC) {
		this.idC = idC;
	}
	public String getRef() {
		return ref;
	}
	public void setRef(String ref) {
		this.ref = ref;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public List<Detail> getDetail() {
		return detail;
	}
	public void setDetail(List<Detail> detail) {
		this.detail = detail;
	}
	
}
