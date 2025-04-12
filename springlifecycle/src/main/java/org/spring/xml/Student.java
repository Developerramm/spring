package org.spring.xml;

public class Student {
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

    public void init(){
        System.out.println("init method called here");
    }

    public void destroy(){
        System.out.println("Destroy method is being called");
    }
}
