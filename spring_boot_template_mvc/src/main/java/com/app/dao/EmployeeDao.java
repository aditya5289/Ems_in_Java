package com.app.dao;

import java.util.List;

import com.app.pojos.Employee;

public interface EmployeeDao {
    
    void saveEmployee(Employee employee);
    
    Employee getEmployeeById(Long id);
    
    List<Employee> getAllEmployees();
    
    // Other methods if needed
}
