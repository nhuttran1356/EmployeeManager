package com.nhut.employeemanager.service;

import com.nhut.employeemanager.model.Employee;
import com.nhut.employeemanager.repository.EmployeeRepository;
import com.nhut.employeemanager.service.imp.EmployeeServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class EmployeeService implements EmployeeServiceImp {

    @Autowired
    private EmployeeRepository employeeRepository;
    @Override
    public Employee addEmployee(Employee employee) {
        employee.setEmployeeCode(UUID.randomUUID().toString());
        return employeeRepository.save(employee);
    }
}
