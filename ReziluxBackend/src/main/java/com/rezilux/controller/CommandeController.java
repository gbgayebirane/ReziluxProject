package com.rezilux.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rezilux.dao.ICommande;
import com.rezilux.entities.Commande;

@RestController
@CrossOrigin("*")
public class CommandeController {
	@Autowired
	private ICommande commande;
	 @RequestMapping(value="/Commande",method=RequestMethod.GET)
	 public List<Commande> getCommande()
	 {
	 	return commande.findAll();
	 }
	 
	 @RequestMapping(value="Commande/{id}",method=RequestMethod.GET)
	 public Optional<Commande> getone(@PathVariable int id)
	 {
	 	return commande.findById(id);
	 }
	
	 @RequestMapping(value="/saveCommande",method=RequestMethod.POST)
	 public Commande save(@RequestBody Commande c)
	 {
	 	return commande.save(c);
	 }
	
	 @RequestMapping(value="/Commande/delete/{id}",method=RequestMethod.DELETE)
	 public boolean supprimer(@PathVariable int id)
	 {
	 	commande.deleteById(id);
	 	return  true;
	 }
	 @RequestMapping(value="/Commande/update/{id}",method=RequestMethod.PUT)
	 public Commande update(@PathVariable int id,Commande c)
	 {
	 	c.setIdC(id);
	 	return commande.save(c);
	 }
}
