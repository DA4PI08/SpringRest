package com.springrest.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Entity
@Table
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
public class Users implements Comparable<String> {
    @Id
    @GeneratedValue
    String id;
    String firstName;
    String lastName;
    String userType;
    String about;
    String emailId;
    String firm;


    @Override
    public int compareTo(String o) {
        return 0;
    }
}
