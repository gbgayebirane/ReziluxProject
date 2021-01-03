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

import com.rezilux.dao.IDetail;
import com.rezilux.entities.Detail;

@RestController
@CrossOrigin("*")
public class DetailController
{
	@Autowired
	private IDetail detail;
	@RequestMapping(value="/Detail",method=RequestMethod.GET)
	 public List<Detail> getdetail()
	 {
	 	return detail.findAll();
	 }
	
	 @RequestMapping(value="Detail/{id}",method=RequestMethod.GET)
	 public Optional<Detail> getone(@PathVariable int id)
	 {
	 	return detail.findById(id);
	 }
	
	 @RequestMapping(value="/saveDetail",method=RequestMethod.POST)
	 public Detail save(@RequestBody Detail d)
	 {
	 	return detail.save(d);
	 }
	 @RequestMapping(value="/Detail/delete/{id}",method=RequestMethod.DELETE)
	 public boolean supprimer(@PathVariable int id)
	 {
	 	detail.deleteById(id);
	 	return  true;
	 }
	 @RequestMapping(value="/Detail/update/{id}",method=RequestMethod.PUT)
	 public Detail update(@PathVariable int id,Detail  a)
	 {
	 	a.setId(id);
	 	return detail.save(a);
	 }
}
