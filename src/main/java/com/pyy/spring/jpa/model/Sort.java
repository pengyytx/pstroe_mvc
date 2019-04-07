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

    @Column(name = "manager")
    private String manager;

    public Sort() {
    }

    public Sort(String name, String manager) {
        this.name = name;
        this.manager = manager;
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

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }
}
