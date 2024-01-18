package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.app.pojos.Department;
import com.app.pojos.Employee;
import com.app.service.DepartmentService;

import java.util.List;


@Controller
@RequestMapping("/department")
public class DepartmentController {

    private final DepartmentService departmentService;

    @Autowired
    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @GetMapping("/all")
    public String showAllDepartments(Model model) {
    	
    	System.out.println("AT LOACTION 1 ");
        List<Department> departments = departmentService.getAllDepartments();
    	System.out.println("AT LOACTION 2 ");
        model.addAttribute("departments", departments);
    	System.out.println("AT LOACTION 3 ");
       return "/department/departments";

    
    }

    @GetMapping("/hire/{departmentId}")
    public String showHireEmployeeForm(@PathVariable Long departmentId, Model model) {
        Department department = departmentService.getDepartmentById(departmentId);
        model.addAttribute("department", department);
        model.addAttribute("employee", new Employee());
     
        
        return "/employee/index2";  // Updated the view name
    }
}

