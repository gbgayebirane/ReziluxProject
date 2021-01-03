package com.rezilux.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rezilux.entities.Detail;


@Repository
public interface IDetail extends JpaRepository<Detail, Integer>{

}
