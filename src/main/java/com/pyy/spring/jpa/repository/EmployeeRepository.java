package com.pyy.spring.jpa.repository;

import com.pyy.spring.jpa.model.Employee;
import com.pyy.spring.jpa.model.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee,Integer> {
}
