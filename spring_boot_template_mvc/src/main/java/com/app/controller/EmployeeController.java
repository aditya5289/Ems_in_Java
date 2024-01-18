package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.app.pojos.Employee;
import com.app.service.EmployeeService;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

    private final EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/hireEmployeeform")
    public String showEmployeeForm(Model model) {
        // Add any necessary data to the model
        model.addAttribute("employee", new Employee());
        return "/employee/hireEmployeeform";  // Updated the view name
    }

    @PostMapping("/hireEmployee")
    public String hireEmployee(@ModelAttribute Employee employee, Model model) {
        try {
            // Validate and process hiring logic
            employeeService.validateEmployee(employee);
            employeeService.hireEmployee(employee);
            // Redirect to hireEmployeeForm.jsp with updated data
            return "redirect:/employee/hireEmployeeform";  // Updated the URL
        } catch (IllegalArgumentException e) {
            // Add error message and forward back to the form
            model.addAttribute("error", e.getMessage());
            return "/employee/hireEmployeeform";  // Updated the view name
        }
    }
}
