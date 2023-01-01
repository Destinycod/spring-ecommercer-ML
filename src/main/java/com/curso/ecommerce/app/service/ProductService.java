package com.curso.ecommerce.app.service;

import com.curso.ecommerce.app.model.Product;

import java.util.Optional;

public interface ProductService {

    Product save(Product product);
    Optional<Product> getById(Long id);
    void update(Product product);
    void deleteById(Long id);

}
