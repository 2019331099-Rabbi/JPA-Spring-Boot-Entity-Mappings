package com.work.factory;

import com.work.factory.models.Address;
import com.work.factory.models.Club;
import com.work.factory.models.Department;
import com.work.factory.models.Employee;
import com.work.factory.repositories.AddressRepository;
import com.work.factory.repositories.ClubRepository;
import com.work.factory.repositories.DepartmentRepository;
import com.work.factory.repositories.EmployeeRepository;
import jakarta.persistence.ManyToMany;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class DataInitializer {
    private final EmployeeRepository employeeRepository;
    private final AddressRepository addressRepository;
    private final DepartmentRepository departmentRepository;
    private final ClubRepository clubRepository;

    @Autowired
    public DataInitializer(EmployeeRepository employeeRepository, AddressRepository addressRepository, DepartmentRepository departmentRepository, ClubRepository clubRepository) {
        this.employeeRepository = employeeRepository;
        this.addressRepository = addressRepository;
        this.departmentRepository = departmentRepository;
        this.clubRepository = clubRepository;
    }

    @Bean
    public CommandLineRunner initializeData() {
        return args -> {
//            Employee employee1 = new Employee();
//            employee1.setName("Urmi");
//            Employee employee2 = new Employee();
//            employee2.setName("Shahed");
//            Employee employee3 = new Employee();
//            employee3.setName("Fatima");
//
//            employeeRepository.save(employee1);
//            employeeRepository.save(employee2);
//            employeeRepository.save(employee3);
//
////            One To One
//            Address address1 = new Address();
//            address1.setCity("Dhaka");
//            Address address2 = new Address();
//            address2.setCity("Sylhet");
//            Address address3 = new Address();
//            address3.setCity("Kapasia");
//
//            employee1.setAddress(address1);
//            employee2.setAddress(address2);
//            employee3.setAddress(address3);
//            address1.setEmployee(employee1);
//            address2.setEmployee(employee2);
//            address3.setEmployee(employee3);
//
//            addressRepository.save(address1);
//            addressRepository.save(address2);
//            addressRepository.save(address3);
//            employeeRepository.save(employee1);
//            employeeRepository.save(employee2);
//            employeeRepository.save(employee3);
//
//            // ManyToOne -- OneToMany
//            Department department1 = new Department();
//            department1.setName("HR");
//            Department department2 = new Department();
//            department2.setName("IT");
//
//            employee1.setDepartment(department1);
//            employee2.setDepartment(department1);
//            employee3.setDepartment(department2);
//
//            department1.getEmployees().add(employee1);
//            department1.getEmployees().add(employee2);
//            department2.getEmployees().add(employee3);
//
//            departmentRepository.save(department1);
//            departmentRepository.save(department2);
//            employeeRepository.save(employee1);
//            employeeRepository.save(employee2);
//            employeeRepository.save(employee3);
//
//            // ManyToMany
//            Club club1 = new Club();
//            club1.setName("Football Club");
//
//            Club club2 = new Club();
//            club2.setName("Cricket Club");
//
//            club1.getEmployees().add(employee1);
//            club1.getEmployees().add(employee2);
//            club1.getEmployees().add(employee3);
//
//            club2.getEmployees().add(employee1);
//            club2.getEmployees().add(employee2);
//
//            employee1.getClubs().add(club1);
//            employee1.getClubs().add(club2);
//            employee2.getClubs().add(club1);
//            employee2.getClubs().add(club2);
//            employee3.getClubs().add(club1);
//            clubRepository.save(club1);
//            clubRepository.save(club2);
//
//            employeeRepository.save(employee1);
//            employeeRepository.save(employee2);
//            employeeRepository.save(employee3);

            System.out.println("Fetching Employee");
            employeeRepository.findById(1L);
        };
    }
}
