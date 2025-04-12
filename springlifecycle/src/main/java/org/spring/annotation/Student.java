package org.spring.annotation;


import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class Student  {
    private int id;
    private String name;

    public Student(){
        System.out.println("Default constructor is called");
    }

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

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }



    @PostConstruct
    public void destroy() throws Exception {
        System.out.println("destroy se pahle annotation");
    }

    @PreDestroy
    public void init(){
        System.out.println("Initialization ke badd annotation ");
    }
}
