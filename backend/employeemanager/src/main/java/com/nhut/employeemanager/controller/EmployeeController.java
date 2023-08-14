package com.nhut.employeemanager.controller;

import com.nhut.employeemanager.model.Employee;
import com.nhut.employeemanager.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/all")
    public ResponseEntity<?> getAllEmployees(){
        List<Employee> employees = employeeService.findAllEmployees();

        return new ResponseEntity<>(employees ,HttpStatus.OK);
    }
    @GetMapping("/find/{id}")
    public ResponseEntity<?> getEmployeeById(@PathVariable Long id){
        Employee employee = employeeService.findEmployeeById(id);

        return new ResponseEntity<>(employee ,HttpStatus.OK);
    }
    @PostMapping("/add")
    public ResponseEntity<?> addEmployee(@RequestBody Employee employee){
        Employee newemployee = employeeService.addEmployee(employee);

        return new ResponseEntity<>(newemployee ,HttpStatus.CREATED);
    }

    @PostMapping("/update")
    public ResponseEntity<?> updateEmployee(@RequestBody Employee employee){
        Employee updateEmployee = employeeService.updateEmployee(employee);

        return new ResponseEntity<>(updateEmployee ,HttpStatus.OK);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteEmployeeById(@PathVariable Long id){
        employeeService.deleteEmployee(id);

        return new ResponseEntity<>(HttpStatus.OK);
    }
}
