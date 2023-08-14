package com.nhut.employeemanager.service.imp;

import com.nhut.employeemanager.model.Employee;
import com.nhut.employeemanager.repository.EmployeeRepository;
import java.util.List;

public interface EmployeeServiceImp {
    Employee addEmployee(Employee employee);
    List<Employee> findAllEmployees();
    Employee updateEmployee(Employee employee);
    void deleteEmployee(Long id);
    Employee findEmployeeById(Long id);
}
