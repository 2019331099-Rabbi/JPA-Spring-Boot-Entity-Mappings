package com.work.factory.services;

import com.work.factory.models.Employee;
import com.work.factory.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public Employee createEmployee(Employee employee) {
        System.out.println(employee.getName() + " " + employee.getAddress().getCity() + " " + employee.getDepartment().getName());
        Employee savedEmployee = employeeRepository.save(employee);

        System.out.println("Address From Employee: "+ savedEmployee.getAddress().getCity());
        System.out.println("Employee From Address: " + savedEmployee.getAddress().getEmployee().getName());
        System.out.println("Department From Employee: " + savedEmployee.getDepartment());

        return savedEmployee;
    }

    public Employee deleteEmployee(Long id) {
        Employee employee = employeeRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Users not found"));
        employeeRepository.delete(employee);
        return employee;
    }
}
