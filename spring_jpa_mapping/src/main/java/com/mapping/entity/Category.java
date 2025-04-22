package com.mapping.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String categoryName;

    @ManyToMany(mappedBy = " categories",cascade = CascadeType.ALL)
    private List<Product> products;
}
