package com.example.employeeservice.service;

import com.example.employeeservice.model.Employee;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class EmployeeService {
    private static final Map<Integer, Employee> employeeRepo = new HashMap<>();

    static {
        employeeRepo.put(1, new Employee(1, "Alice", "HR"));
        employeeRepo.put(2, new Employee(2, "Bob", "Engineering"));
    }

    public List<Employee> getAllEmployees() {
        return new ArrayList<>(employeeRepo.values());
    }

    public Employee getEmployeeById(int id) {
        return employeeRepo.get(id);
    }
}

