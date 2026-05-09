package com.employee.example.employee_management.Service;

import com.employee.example.employee_management.Entity.Employee;
import com.employee.example.employee_management.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository repository;
    // Save the Employee
    public void saveEmployee(Employee employee){
        repository.save(employee);
    }
    // Get All Employees
    public List<Employee> getAllEmployees(){
        return repository.findAll();
    }
    //Get Employee By Id
    public Employee getEmployeeById(int id){
        return repository.findById(id).orElse(null);
    }
    //Delete Employee
    public void deleteEmployee(int id){
        repository.deleteById(id);
    }

}