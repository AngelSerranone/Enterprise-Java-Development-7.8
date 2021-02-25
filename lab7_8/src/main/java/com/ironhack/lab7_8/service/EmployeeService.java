package com.ironhack.lab7_8.service;

import com.ironhack.lab7_8.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ironhack.lab7_8.repository.EmployeeRepository;

import java.util.List;

import static org.aspectj.runtime.internal.Conversions.longValue;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> getAll() {
        return employeeRepository.findAll();
    }

    public void delete(Long id) {
        employeeRepository.deleteById(id);
    }
}
