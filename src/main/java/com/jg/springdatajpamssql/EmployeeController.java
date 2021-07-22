package com.jg.springdatajpamssql;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/employees")
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeRepository employeeRepository;

    @PostMapping
    public UUID createEmployee(@RequestBody final Employee employee) {
        return employeeRepository.save(Employee.builder()
                .firstName(employee.getFirstName())
                .lastName(employee.getLastName())
                .build())
                .getId();
    }

    @GetMapping
    public List<Employee> getEmployees() {
        return employeeRepository.findAll();
    }
}
