package com.companyname.springapp.business.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.companyname.springapp.business.entities.Product;

public interface ProductRepository extends CrudRepository<Product, Integer> {

}