package com.example.university.domain.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Entity
@Table(name = "student")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column(name = "age")
    private int age;

    @Column(name = "name")
    private String name;
    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }
}
