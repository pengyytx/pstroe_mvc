package com.pyy.spring.jpa.controller;

import com.pyy.spring.jpa.model.Sort;
import com.pyy.spring.jpa.sercive.SortService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sort")
public class SortController {

    @Autowired
    SortService sortService;

    @RequestMapping("/welcome")
    public String welcome(){
        return "welcome to sort page";
    }

    @GetMapping("/getall")
    public List<Sort> getAllSort(){
        return (List<Sort>)sortService.getAllSort();
    }

    @GetMapping("/getbyid/{id}")
    public Sort getById(@PathVariable Integer id){
        return sortService.getById(id);
    }

    @PostMapping("/add/{name}/{manager}")
    public String addSort(@PathVariable String name, @PathVariable String manager){
        sortService.addSort(name,manager);
        return "add sort successful!";
    }

    @DeleteMapping("/delete/{id}")
    public String deleteSort(@PathVariable Integer id){
        sortService.deleteSort(id);
        return "delete successful!";
    }
}
