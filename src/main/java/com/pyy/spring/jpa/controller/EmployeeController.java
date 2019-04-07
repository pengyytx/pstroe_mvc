package com.pyy.spring.jpa.controller;

import com.pyy.spring.jpa.model.Employee;
import com.pyy.spring.jpa.sercive.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;
    @RequestMapping("/employee")
    public String welcome(){
        return "welcome to pstore family~";
    }
    @GetMapping("/employee/getall")
    public List<Employee> getALlEmployee(){
        return employeeService.getAllEmployee();
    }
    @GetMapping("/employee/{id}")
    public Employee getById(@PathVariable Integer id){
        return employeeService.getById(id);
    }
    @PostMapping("/employee/add/{name}/{manager}")
    public String addEmployee(@PathVariable String name,@PathVariable String manager){
        employeeService.addEmployee(name,manager);
        return "add employee successful!";
    }

    @DeleteMapping("/employee/delete/{id}")
    public String deleteEmployee(@PathVariable Integer id){
        employeeService.deleteEmployee(id);
        return "delete employee successful";
    }

}
