package com.tlongueira.springapp.bussiness.repositories;

import org.springframework.data.repository.CrudRepository;

import com.tlongueira.springapp.bussiness.entities.Product;


public interface ProductRepository extends CrudRepository<Product, Integer> {

}