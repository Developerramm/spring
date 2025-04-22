package com.mapping.entity;

import jakarta.persistence.*;

@Entity
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int d;
    private String address;
    private String type;

    @ManyToOne
    private Emp emp;

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
