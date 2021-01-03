package com.rezilux.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rezilux.dao.IClient;
import com.rezilux.entities.Article;
import com.rezilux.entities.Client;

@RestController
@CrossOrigin("*")
public class ClientController {
	
	@Autowired
	private IClient client;
	@RequestMapping(value="/Client",method=RequestMethod.GET)
	 public List<Client> getClients()
	 {
	 	return client.findAll();
	 }
	
	
	 @RequestMapping(value="Client/{id}",method=RequestMethod.GET)
	 public Optional<Client> getone(@PathVariable int id)
	 {
	 	return client.findById(id);
	 }
	
	 @RequestMapping(value="/saveClient",method=RequestMethod.POST)
	 public Client save(@RequestBody Client c)
	 {
	 	return client.save(c);
	 }
	 
	 @RequestMapping(value="/Client/delete/{id}",method=RequestMethod.DELETE)
	 public boolean supprimer(@PathVariable int id)
	 {
	 	client.deleteById(id);
	 	return  true;
	 }
	 @RequestMapping(value="/chercherClient",method=RequestMethod.GET)
	    public List<Client> cherchersanspagination(
	    @RequestParam(name="mc",defaultValue="") String mc)
	    {
	    	return client.chercher("%"+mc+"%");

	    }
	 @RequestMapping(value="/Client/update/{id}",method=RequestMethod.PUT)
	 public Client update(@PathVariable int id,Client c)
	 {
	 	c.setIdC(id);
	 	return client.save(c);
	 }

}
