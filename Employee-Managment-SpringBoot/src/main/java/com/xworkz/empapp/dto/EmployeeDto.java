package com.xworkz.empapp.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@NoArgsConstructor
@Entity
@Builder
@AllArgsConstructor
@Table(name = "employee_data")

public class EmployeeDto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotNull(message = "name should not be null")
    @Size(min=3,max = 50)
    private String empName;
    @NotNull(message = "department should not be null")
    private String department;
    @NotNull(message = "salary should not be null")
    @Size(min = 0 ,max = 1000000)
    private double salary;
    @NotNull(message = "address should not be null")
    private String address;

}
