package com.springrest.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Product {

    @Id
    String Id;
    String name;
    String description;
    @ManyToOne
    Category category;

}
