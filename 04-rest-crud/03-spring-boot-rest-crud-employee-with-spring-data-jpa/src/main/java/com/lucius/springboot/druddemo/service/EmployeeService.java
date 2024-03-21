package com.lucius.springboot.druddemo.service;

import com.lucius.springboot.druddemo.dao.EmployeeDAO;
import com.lucius.springboot.druddemo.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();

    Employee findById(int theId);

    Employee save(Employee theEmployee);

    void deleteById(int theId);
}
