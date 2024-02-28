package com.springrest.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Entity
@Table
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class TestModel {
    @Id
    String id;
    String name;
}
