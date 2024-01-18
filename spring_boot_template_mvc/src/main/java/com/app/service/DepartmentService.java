package com.app.service;

import java.util.List;

import com.app.pojos.Department;

public interface DepartmentService {
    
    void saveDepartment(Department department);
    
    Department getDepartmentById(Long id);
    
    List<Department> getAllDepartments();
    
    // Other methods if needed
}
