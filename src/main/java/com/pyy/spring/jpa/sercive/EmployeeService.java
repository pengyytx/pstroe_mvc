package com.pyy.spring.jpa.sercive;

import com.pyy.spring.jpa.model.Employee;
import com.pyy.spring.jpa.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployee(){
        return (List<Employee>) employeeRepository.findAll();
    }

    public Employee getById(Integer id){
        return employeeRepository.findOne(id);
    }

    public void addEmployee(String name,String identity,Double salary){
        Employee employee = new Employee(name,identity,salary);
        employeeRepository.save(employee);
    }

    public void deleteEmployee(Integer id){
        employeeRepository.delete(id);
    }

}
