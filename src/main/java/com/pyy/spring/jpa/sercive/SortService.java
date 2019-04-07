package com.pyy.spring.jpa.sercive;

import com.pyy.spring.jpa.model.Sort;
import com.pyy.spring.jpa.repository.SortRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SortService {
    @Autowired
    SortRepository sortRepository;

    public List<Sort> getAllSort(){
        return (List<Sort>)sortRepository.findAll();
    }

    public Sort getById(Integer id){
        return sortRepository.findOne(id);
    }

    public void addSort(String name,String manager){
       Sort sort = new Sort(name,manager);
       sortRepository.save(sort);
    }

    public void deleteSort(Integer id){
        sortRepository.delete(id);
    }

}
