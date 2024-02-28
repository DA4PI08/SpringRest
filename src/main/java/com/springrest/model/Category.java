package com.springrest.model;

import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;

public class Category {

    @Id
    String id;
    @OneToMany
    List<Product> productList;



}
