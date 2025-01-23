package com.work.factory.controllers;

import com.work.factory.models.Employee;
import com.work.factory.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/api/factory/employees")
    public ResponseEntity<List<Employee>> getAllEmployees() {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(employeeService.getAllEmployees());
    }

    @PostMapping("/api/factory/employees")
    public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee) {
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(employeeService.createEmployee(employee));
    }

    @DeleteMapping("/api/factory/employees/{id}")
    public ResponseEntity<String> deleteEmployee(@PathVariable Long id) {
        employeeService.deleteEmployee(id);
        return ResponseEntity
                .status(HttpStatus.OK)
                .body("Deleted Successfully");
    }
}
