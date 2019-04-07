package com.pyy.spring.jpa.controller;

import com.pyy.spring.jpa.model.Employee;
import com.pyy.spring.jpa.sercive.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @RequestMapping("/welcome")
    public String welcome(){
        return "welcome to pstore family~";
    }

    @GetMapping("/getall")
    public List<Employee> getALlEmployee(){
        return employeeService.getAllEmployee();
    }

    @GetMapping("/getbyid/{id}")
    public Employee getById(@PathVariable Integer id){
        return employeeService.getById(id);
    }

    @PostMapping("/add/{name}/{identity}/{salary}")
    public String addEmployee(@PathVariable String name,@PathVariable String identity,@PathVariable Double salary){
        employeeService.addEmployee(name,identity,salary);
        return "add employee successful!";
    }

    @DeleteMapping("/delete/{id}")
    public String deleteEmployee(@PathVariable Integer id){
        employeeService.deleteEmployee(id);
        return "delete employee successful";
    }

}
