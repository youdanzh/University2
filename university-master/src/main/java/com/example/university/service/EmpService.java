package com.example.university.service;

import com.example.university.domain.CommonResponse;
import com.example.university.domain.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.List;

@Service
public interface EmpService {
    List<Employee> findAll();
    List<Employee> findByAge(int age);


}
