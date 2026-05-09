package com.employee.example.employee_management.Repository;

import com.employee.example.employee_management.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
}