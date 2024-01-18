package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.DepartmentDao;
import com.app.pojos.Department;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentDao departmentDao;

    @Override
    @Transactional
    public void saveDepartment(Department department) {
        // Additional validation logic if needed
        departmentDao.saveDepartment(department);
    }

    @Override
    public Department getDepartmentById(Long id) {
        return departmentDao.getDepartmentById(id);
    }

    @Override
    public List<Department> getAllDepartments() {
        return departmentDao.getAllDepartments();
    }
}
