package com.work.factory.controllers;

import com.work.factory.models.Department;
import com.work.factory.models.Employee;
import com.work.factory.services.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @GetMapping("/api/factory/departments")
    public ResponseEntity<List<Department>> getAllDepartments() {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(departmentService.getAllDepartments());
    }

    @PostMapping("/api/factory/departments")
    public ResponseEntity<Department> createDepartment(@RequestBody Department department) {
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(departmentService.createDepartment(department));
    }
}
