package com.employee.example.employee_management.Controller;

import com.employee.example.employee_management.Entity.Employee;
import com.employee.example.employee_management.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class EmployeeController {
    @Autowired
      private EmployeeService service;
    // Home Page
    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("employees",service.getAllEmployees());
        return "index";
    }
    // Add Employee
    @GetMapping("/add")
    public String addEmployeeForm(Model model){
        model.addAttribute("employee",new Employee());
        return "add-employee";
    }
    //Save employee
    @PostMapping("/save")
    public String saveEmployee(@ModelAttribute Employee employee,
                               RedirectAttributes redirectAttributes) {

        service.saveEmployee(employee);

        redirectAttributes.addFlashAttribute(
                "success",
                "Employee Added Successfully!");

        return "redirect:/";
    }
    //Edit Employee
    @GetMapping("/edit/{id}")
    public String editEmployee(@PathVariable int id,Model model){
        model.addAttribute("employee",service.getEmployeeById(id));
        return "edit-employee";
    }
    // Delete employee
    public String deleteEmployee(@PathVariable int id){
        service.deleteEmployee(id);
        return "redirect:/";
    }
}