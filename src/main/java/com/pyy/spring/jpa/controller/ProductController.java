package com.pyy.spring.jpa.controller;
import com.pyy.spring.jpa.model.Product;
import com.pyy.spring.jpa.sercive.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    ProductService productService;

    @RequestMapping(value = "/")
    public @ResponseBody String welcome(){
        return "welcome to pstore ^_^ ";
    }

    @GetMapping("/all")
    public @ResponseBody
    List<Product> getAllProducts(){
        return productService.getAllProducts();
    }

    @GetMapping("/getbyid/{id}")
    public Product getById(@PathVariable Integer id){
        return productService.getById(id);
    }

    @GetMapping("/getbyname/{name}")
    public Product getByname(@PathVariable String name){
        return productService.getByName(name);
    }

    @PostMapping("/add/{name}/{kind}/{price}")
    public String insertProduct(@PathVariable String name,@PathVariable String kind,@PathVariable Double price){
        productService.addProduct(name,kind,price);
        return "add product successful！";
    }
    @DeleteMapping("/delete/{id}")
    public String deleteProduct(@PathVariable Integer id){
        productService.deleteProduct(id);
        return "delete product successful！";
    }
}
