package com.xworkz.empapp.service;

import com.xworkz.empapp.dto.EmployeeDto;

import javax.persistence.Id;
import java.util.List;

public interface EmployeeService {

    public List<EmployeeDto> addEmployee(List<EmployeeDto> dto);

     public List<EmployeeDto> getAllEmployee();

     public EmployeeDto getEmpById(int id);
     public  void deleteEmp(int id);
}
