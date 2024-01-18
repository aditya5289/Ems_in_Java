package com.app.pojos;

import java.time.LocalDate;
import java.time.Period;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "employees")
public class Employee {

    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employee_id")
    private Long employeeId;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    @Column(name = "salary")
    private double salary;

    @Column(name = "dob")
    private LocalDate dob;

    
    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;

    // Constructors
    public Employee() {
    }

    public Employee(String name, String email, double salary, LocalDate dob, Department department) {
        this.name = name;
        this.email = email;
        this.salary = salary;
        this.dob = dob;
        this.department = department;
    }

    // Getters and Setters
    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public int getAge() {
        if (dob != null) {
            LocalDate currentDate = LocalDate.now();
            return Period.between(dob, currentDate).getYears();
        } else {
            return 0; // or handle this case according to your requirements
        }
    }
    
    // toString, hashCode, equals, and other methods if needed
}
