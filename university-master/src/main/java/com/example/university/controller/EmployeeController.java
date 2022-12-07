

package com.example.university.controller;

import com.example.university.domain.entity.Employee;
import com.example.university.exception.InternalServerErrorException;
import com.example.university.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    private final EmpService empService;

    @Autowired
    EmployeeController(EmpService empService){
        this.empService = empService;
    }

    @GetMapping
    public ResponseEntity<List<Employee>> findAll(){
        return new ResponseEntity<>(empService.findAll(), HttpStatus.OK);
    }


    @GetMapping("/{age}")
    public ResponseEntity<List<Employee>> findByAge(@PathVariable int age){
        return new ResponseEntity<>(empService.findByAge(age), HttpStatus.OK);
    }

    @ExceptionHandler(InternalServerErrorException.class)
    public ResponseEntity<String> internalServerErrorException(){
        return new ResponseEntity<>("Internal Server Error Exception", HttpStatus.INTERNAL_SERVER_ERROR);
    }
}