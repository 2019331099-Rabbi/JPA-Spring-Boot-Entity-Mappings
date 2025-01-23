package com.work.factory.services;

import com.work.factory.models.Department;
import com.work.factory.models.Employee;
import com.work.factory.repositories.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;

    public List<Department> getAllDepartments() {
        return departmentRepository.findAll();
    }

    public Department createDepartment(Department department) {
        Department savedDepartment = departmentRepository.save(department);
        return savedDepartment;
    }
}
