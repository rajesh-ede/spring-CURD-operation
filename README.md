Employee Management System

A complete Spring Boot + MySQL CRUD Application built using:

Spring Boot
Spring Data JPA
Thymeleaf
MySQL
Bootstrap

This project demonstrates a real-world CRUD architecture used in enterprise applications.

Features

✅ Add Employee
✅ View All Employees
✅ Update Employee
✅ Delete Employee
✅ MySQL Database Integration
✅ Spring Boot MVC Architecture
✅ Thymeleaf Dynamic UI
✅ Bootstrap Responsive Design

Tech Stack
Technology	Purpose
Java 17	Programming Language
Spring Boot	Backend Framework
Spring MVC	Request Handling
Spring Data JPA	Database Operations
Hibernate	ORM Framework
Thymeleaf	Frontend Template Engine
MySQL	Database
Bootstrap	UI Styling
Maven	Dependency Management
Project Structure
src/main/java
└── com.employee.example.employee_management
        ├── controller
        │      └── EmployeeController.java
        │
        ├── entity
        │      └── Employee.java
        │
        ├── repository
        │      └── EmployeeRepository.java
        │
        ├── service
        │      └── EmployeeService.java
        │
        └── EmployeeManagementApplication.java

src/main/resources
        ├── templates
        │      ├── index.html
        │      ├── add-employee.html
        │      └── edit-employee.html
        │
        └── application.properties
Application Flow
Browser
   ↓
Controller
   ↓
Service
   ↓
Repository
   ↓
Hibernate/JPA
   ↓
MySQL Database
How This Project Works
1. User Opens Application
http://localhost:8080

Controller handles request:

@GetMapping("/")
2. Controller Calls Service
service.getAllEmployees();
3. Service Calls Repository
repository.findAll();
4. Hibernate Generates SQL
select * from employees;
5. Data Sent To Thymeleaf
model.addAttribute("employees", employees);
6. Thymeleaf Displays Data
<tr th:each="emp : ${employees}">

| Operation       | Method                  |
| --------------- | ----------------------- |
| Create Employee | repository.save()       |
| Read Employees  | repository.findAll()    |
| Update Employee | repository.save()       |
| Delete Employee | repository.deleteById() |

Important Spring Boot Concepts Used
Annotation	Purpose
@SpringBootApplication	Main Spring Boot Configuration
@Controller	Handles Browser Requests
@Service	Business Logic Layer
@Entity	Maps Java Class To Database Table
@Repository	Database Access Layer
@Autowired	Dependency Injection
@GetMapping	Handle GET Requests
@PostMapping	Handle POST Requests
@ModelAttribute	Bind Form Data To Java Object
