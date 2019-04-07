package com.pyy.spring.jpa.controller;

import com.pyy.spring.jpa.model.Sort;
import com.pyy.spring.jpa.sercive.SortService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class SortController {

    @Autowired
    SortService sortService;

    @RequestMapping("/sort")
    public String welcome(){
        return "welcome to sort page";
    }

    @GetMapping("/sort/getall")
    public List<Sort> getAllSort(){
        return (List<Sort>)sortService.getAllSort();
    }

    @GetMapping("/sort/getbyid/{id}")
    public Sort getById(@PathVariable Integer id){
        return sortService.getById(id);
    }

    @PostMapping("/sort/add/{name}/{identity}/{salary}")
    public String addSort(@PathVariable String name, @PathVariable String identity, @PathVariable Double salary){
        sortService.addSort(name,identity,salary);
        return "add sort successful!";
    }

    @DeleteMapping("/sort/delete/{id}")
    public String deleteSort(@PathVariable Integer id){
        sortService.deleteSort(id);
        return "delete successful!";
    }
}
