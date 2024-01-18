package com.app.service;

import java.util.List;

import com.app.pojos.Employee;

public interface EmployeeService {
    
    void saveEmployee(Employee employee);
    
    Employee getEmployeeById(Long id);
    
    List<Employee> getAllEmployees();

	boolean validateEmployee(Employee employee);

	void hireEmployee(Employee employee);
    
    // Other methods if needed
}
