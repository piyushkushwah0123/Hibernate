package com.piyush;

import jakarta.persistence.*;

@Entity
public class Student {

    @Id
    @GeneratedValue
    int id;

    String name;

    public Student() {}
}