package com.pyy.spring.jpa.repository;

import com.pyy.spring.jpa.model.Sort;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SortRepository extends CrudRepository<Sort,Integer> {
}
