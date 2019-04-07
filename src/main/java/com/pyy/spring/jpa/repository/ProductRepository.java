package com.pyy.spring.jpa.repository;

import com.pyy.spring.jpa.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product,Integer> {

    Product findByName(String name);
}
