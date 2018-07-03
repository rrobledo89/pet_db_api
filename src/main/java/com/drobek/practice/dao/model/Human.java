package com.drobek.practice.dao.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;

//@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})

@Entity
public class Human {
//    @Override
//    public String toString() {
//        return "Human{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", age=" + age +
//                '}';
//    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private int age;


    public List<Toys> getToys() {
        return toys;
    }

    public void setToys(List<Toys> toys) {
        this.toys = toys;
    }

    @OneToMany(fetch = FetchType.EAGER , mappedBy = "human", targetEntity=Toys.class)
    private List <Toys> toys;



//
//    @OneToMany(mappedBy = "human", cascade = CascadeType.ALL,fetch = FetchType.EAGER)
//    private List<Toys> toys;


//    public List<Toys> getToys() {
//        return toys;
//    }
//
//    public void setToys(List<Toys> toys) {
//        this.toys = toys;
//    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
