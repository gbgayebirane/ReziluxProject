package com.rezilux.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.rezilux.entities.Client;


@Repository
public interface IClient extends JpaRepository<Client, Integer> {
	@Query("select c from Client c where c.lastName like :x")
	public List<Client>  chercher(@Param("x")String mc); 
	
	@Query("select c from Client c ")
	public List<Client>  client(); 
}
