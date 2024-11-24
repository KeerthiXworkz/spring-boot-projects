package com.xworkz.empapp;

import com.xworkz.empapp.dto.EmployeeDto;
import com.xworkz.empapp.repository.EmployeeRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;


@DataJpaTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class EmployeeRepositoryTest {

    @Autowired
    EmployeeRepository repository;
    @Test
    @Order(1)
    @Rollback(value = false)
    public void saveEmp(){

        EmployeeDto employeeDto = EmployeeDto.builder()
                .empName("keerthi")
                .department("Developer")
                .address("CTA").
                salary(50000).build();
        repository.save(employeeDto);
        Assertions.assertThat(employeeDto.getId()).isGreaterThan(0);

    }

}
