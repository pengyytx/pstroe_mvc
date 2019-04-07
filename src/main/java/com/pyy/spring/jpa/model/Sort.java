package com.pyy.spring.jpa.model;

import javax.persistence.*;

@Entity
@Table(name = "sort")
public class Sort {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "identity")
    private String identity;

    @Column(name = "salary")
    private Double salary;

    public Sort() {

    }

    public Sort(String name, String identity, Double salary) {
        this.name = name;
        this.identity = identity;
        this.salary = salary;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}
