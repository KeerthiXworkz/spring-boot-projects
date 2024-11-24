package com.xworkz.empapp.service.impl;

import com.xworkz.empapp.customexception.NameNotNullException;
import com.xworkz.empapp.dto.EmployeeDto;
import com.xworkz.empapp.repository.EmployeeRepository;
import com.xworkz.empapp.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeRepository repository;



//    public static  boolean validateFields(EmployeeDto dto) throws NameNotNullException{
//        boolean isvalidated=false;
//        try {
//
//        if (dto.getEmpName().equals(null)) {
//
//            throw new NameNotNullException("Name should be not null");
//        }
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//          return isvalidated;
//    }

    @Override
    public List<EmployeeDto> addEmployee(List<EmployeeDto> dto) {


       List<EmployeeDto> list =  repository.saveAll(dto);
       return list;

    }

    @Override
    public List<EmployeeDto> getAllEmployee() {

        List<EmployeeDto> list=repository.findAll();
        return list;
    }

    @Override
    public EmployeeDto getEmpById(int id) {

        EmployeeDto dto =repository.findById(id).orElseThrow(()->new RuntimeException("Employee not found"));
        return dto;
    }

    @Override
    public void deleteEmp(int id) {

        repository.deleteById(id);
    }
}
