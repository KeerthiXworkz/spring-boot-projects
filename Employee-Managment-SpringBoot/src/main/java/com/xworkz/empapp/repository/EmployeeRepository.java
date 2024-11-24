package com.xworkz.empapp.repository;


import com.xworkz.empapp.dto.EmployeeDto;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.Id;

public interface EmployeeRepository extends JpaRepository<EmployeeDto, Integer> {
}
