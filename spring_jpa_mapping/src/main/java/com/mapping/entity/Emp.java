package com.mapping.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Emp {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String empName;

    @OneToOne(mappedBy = "emp",cascade = CascadeType.ALL)
    private Mobile mobile; // this is foreign key

    @OneToMany(mappedBy = "emp",cascade = CascadeType.ALL)
    private List<Address> address;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Mobile getMobile() {
        return mobile;
    }

    public void setMobile(Mobile mobile) {
        this.mobile = mobile;
    }
}
