package com.pyy.spring.jpa.sercive;

import com.pyy.spring.jpa.model.Product;
import com.pyy.spring.jpa.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    public List<Product> getAllProducts(){
        return (List<Product>)productRepository.findAll();
    }

    public Product getById(Integer id){
        return productRepository.findOne(id);

    }

    public Product getByName(String name){
        return productRepository.findByName(name);
    }

    public void addProduct(String name,String kind,Double price){
        Product product = new Product(name,kind,price);
        productRepository.save(product);
    }

    @Transactional
    public void deleteProduct(Integer id){
        productRepository.delete(id);
    }


}
