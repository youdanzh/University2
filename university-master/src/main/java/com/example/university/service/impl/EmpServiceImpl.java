package com.example.university.service.impl;

import com.example.university.domain.entity.Employee;
import com.example.university.respository.EmployeeRepository;
import com.example.university.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpServiceImpl implements EmpService {
    private final EmployeeRepository employeeRepository;

    @Autowired
    public EmpServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public List<Employee> findByAge(int age) {
        List<Employee> Emp =employeeRepository.findByAge(age);
        return Emp;
    }
}


