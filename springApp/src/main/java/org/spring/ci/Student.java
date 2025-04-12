package org.spring.ci;

public class Student {
    private int id;
    private String name;
    private String address;

    public Student(int id,String name){
        System.out.println("1 Student constructor is being called");
        this.id = id;
        this.name=name;
    }

    public Student(String name, String address) {
        System.out.println("String Student constructor is being called");
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
