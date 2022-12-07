package com.example.university.respository;
import com.example.university.domain.entity.Employee;
import com.example.university.domain.entity.Employee;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository{
    List<Employee> findByAge(int age);
    List<Employee> findAll();
}