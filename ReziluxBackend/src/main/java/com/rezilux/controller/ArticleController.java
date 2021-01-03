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

import com.rezilux.dao.IArticle;
import com.rezilux.entities.Article;
import com.rezilux.entities.Client;

@RestController
@CrossOrigin("*")
public class ArticleController {

	 @Autowired
	private IArticle article;
	 @RequestMapping(value="/Article",method=RequestMethod.GET)
	 public List<Article> getArticle()
	 {
	 	return article.findAll();
	 }
	
	 @RequestMapping(value="Article/{id}",method=RequestMethod.GET)
	 public Optional<Article> getone(@PathVariable int id)
	 {
	 	return article.findById(id);
	 }
	
	 @RequestMapping(value="/saveArticle",method=RequestMethod.POST)
	 public Article save(@RequestBody Article a)
	 {
	 	return article.save(a);
	 }
	
	 @RequestMapping(value="/Article/delete/{id}",method=RequestMethod.DELETE)
	 public boolean supprimer(@PathVariable int id)
	 {
	 	article.deleteById(id);
	 	return  true;
	 }
	 @RequestMapping(value="/Article/update/{id}",method=RequestMethod.PUT)
	 public Article update(@PathVariable int id,Article a)
	 {
	 	a.setIdA(id);
	 	return article.save(a);
	 }
}
