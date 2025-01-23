package com.work.factory.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "addresses")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String city;

    @OneToOne(mappedBy = "address")
    @JsonIgnore
    private Employee employee;

    public void setEmployee(Employee employee) {
        this.employee = employee;
        if (employee.getAddress() != this) {
            employee.setAddress(this);
        }
    }
}
