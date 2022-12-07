package com.example.university.domain.entity;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "EMPLOYEE")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column(name = "AGE")
    private int age;

    @Column(name = "NAME")
    private String name;

    public Employee(String name, int age){
        this.name = name;
        this.age = age;
    }
}

