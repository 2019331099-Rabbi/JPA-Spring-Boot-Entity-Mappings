package com.work.factory.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "employees")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id", referencedColumnName = "id")
    private Address address;

    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;


//    @ManyToMany(mappedBy = "employees", fetch = FetchType.EAGER)
    @ManyToMany(mappedBy = "employees", fetch = FetchType.EAGER)
    private List<Club> clubs = new ArrayList<>();

    public void setAddress(Address address) {
        this.address = address;
        if (address != null) {
            address.setEmployee(this);
        }
    }

    public void setDepartment(Department department) {
        this.department = department;
        if (department != null) {
            department.getEmployees().add(this);
        }
    }
}
