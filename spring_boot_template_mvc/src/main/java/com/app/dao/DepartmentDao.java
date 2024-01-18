package com.app.dao;

import java.util.List;

import com.app.pojos.Department;

public interface DepartmentDao {
    
    void saveDepartment(Department department);
    
    Department getDepartmentById(Long id);
    
    List<Department> getAllDepartments();
    
    // Other methods if needed
}
