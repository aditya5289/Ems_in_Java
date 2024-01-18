package com.app.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.pojos.Department;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class DepartmentDaoImpl implements DepartmentDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void saveDepartment(Department department) {
        entityManager.persist(department);
    }

    @Override
    public Department getDepartmentById(Long id) {
        return entityManager.find(Department.class, id);
    }

    @Override
    public List<Department> getAllDepartments() {
        return entityManager.createQuery("SELECT d FROM Department d", Department.class).getResultList();
    }
}
