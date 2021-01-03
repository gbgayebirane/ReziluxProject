package com.rezilux.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rezilux.entities.Article;


@Repository
public interface IArticle extends JpaRepository<Article, Integer> {

}
