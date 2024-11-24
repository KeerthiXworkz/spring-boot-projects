package com.xworkz.empapp.controller;


import com.xworkz.empapp.dto.EmployeeDto;
import com.xworkz.empapp.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/")
public class EmployeeController {

    @Autowired
    EmployeeService service;

    @PostMapping("save")
    public String  saveEmp(@Valid  @RequestBody List<EmployeeDto> dto ,BindingResult error){

     List<EmployeeDto> list =service.addEmployee(dto);
     if (error.hasErrors()){
         System.out.println( error.getAllErrors());
     }else {
         System.out.println(list);
     }

        return "Employee is successfully saved" ;
    }

    @GetMapping("getAll")
    public List<EmployeeDto> getAll(){

        List<EmployeeDto> list=service.getAllEmployee();
        return list;
    }
    @GetMapping("{id}")
    public  EmployeeDto get(@PathVariable int id){

        EmployeeDto dto = service.getEmpById(id);

        return dto;
    }

    @DeleteMapping("empId")
    public String delete(@RequestParam("id") int id){

        service.deleteEmp(id);
        return  "Employee successfully deleted";
    }

    @GetMapping("message")
    public  String getMessage(){

        return "hello employees";
    }
}
