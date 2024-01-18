package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.EmployeeDao;
import com.app.pojos.Employee;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeDao employeeDao;

    @Override
    @Transactional
    public void saveEmployee(Employee employee) {
        // Validation logic
        if (validateEmployee(employee)) {
            employeeDao.saveEmployee(employee);
        } else {
            // Handle validation failure
            throw new IllegalArgumentException("Invalid employee details");
        }
    }

    @Override
    public Employee getEmployeeById(Long id) {
        return employeeDao.getEmployeeById(id);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeDao.getAllEmployees();
    }

    @Override
    public boolean validateEmployee(Employee employee) {
        // Custom validation logic
        return employee.getSalary() >= 30000 && employee.getSalary() <= 40000
                && employee.getAge() >= 25 && employee.getAge() <= 35;
    }

    @Override
    public void hireEmployee(Employee employee) {
        // Additional logic for hiring employee, if needed
        // This method can be implemented based on specific requirements
        // For example, linking the employee to a department or setting the join date.
        // For simplicity, it's left as a placeholder.
    }
}
