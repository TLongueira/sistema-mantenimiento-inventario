package com.tlongueira.springapp.bussiness.services;

import java.util.List;

import com.tlongueira.springapp.bussiness.entities.Product;


public interface ProductManager {

    public void increasePrice(int percentage);
    
    public List<Product> getProducts();

}