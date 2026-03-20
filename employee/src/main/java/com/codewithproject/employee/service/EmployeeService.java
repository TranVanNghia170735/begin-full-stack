package com.codewithproject.employee.service;

import com.codewithproject.employee.entity.Employee;
import com.codewithproject.employee.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmployeeService {
    private final EmployeeRepository employeeRepository;

    public Employee postEmployee (Employee employee){
        return employeeRepository.save(employee);
    }
}
