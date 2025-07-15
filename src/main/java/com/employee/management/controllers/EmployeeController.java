package com.employee.management.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.employee.management.entities.Employee;
import com.employee.management.exceptions.EmployeeNotFoundException;
import com.employee.management.repositories.EmployeeRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/employees")  // << This part is crucial
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    // Get all employees
    @GetMapping       //("/employees")
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    // Create a new employee
    @PostMapping //("/employees")
    public Employee createEmployee(@RequestBody Employee employee) {
        return employeeRepository.save(employee);
    }

    // Get employee by ID
    @GetMapping("/{empId}")  //("/employees/{empId}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable int empId) {
        Employee employee = employeeRepository.findById(empId)
                .orElseThrow(() -> new EmployeeNotFoundException("Employee with Employee Id " + empId + " does not exist"));
        return ResponseEntity.ok(employee);
    }

    // Update employee
    //@PutMapping("/employees/{empId}")
    @PutMapping("/{empId}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable int empId, @RequestBody Employee employeeDetails) {
        Employee employee = employeeRepository.findById(empId)
                .orElseThrow(() -> new EmployeeNotFoundException("Employee with Employee Id " + empId + " does not exist"));

        employee.setEmpName(employeeDetails.getEmpName());
        employee.setDesignation(employeeDetails.getDesignation());
        employee.setEmpSalary(employeeDetails.getEmpSalary());

        Employee updatedEmployee = employeeRepository.save(employee);
        return ResponseEntity.ok(updatedEmployee);
    }

    // Delete employee
    //@DeleteMapping("/employees/{empId}")
    @DeleteMapping("/{empId}")
    public ResponseEntity<Map<String, Boolean>> deleteEmployee(@PathVariable int empId) {
        Employee employee = employeeRepository.findById(empId)
                .orElseThrow(() -> new EmployeeNotFoundException("Employee with Employee Id " + empId + " does not exist"));

        employeeRepository.delete(employee);

        Map<String, Boolean> response = new HashMap<>();
        response.put("Deleted", Boolean.TRUE);
        return ResponseEntity.ok(response);
    }
}
