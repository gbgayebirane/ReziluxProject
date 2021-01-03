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
public class Client {
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)  //AUTO INCREMENT
	private int idC;
	@Column(length=200)
	private String firstName;
	@Column(length=200)
	private String lastName;
	@Column(length=200)
	private String email;
	@Column(length=200)
	private String phoneNumber;
	@OneToMany(mappedBy="client")
    private List<Commande> commande =new ArrayList<Commande>();
	public Client() {
		super();
	}
	public Client(int idC, String firstName, String lastName, String email, String phoneNumber
			) {
		super();
		this.idC = idC;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}
	public int getIdC() {
		return idC;
	}
	public void setIdC(int idC) {
		this.idC = idC;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
}
