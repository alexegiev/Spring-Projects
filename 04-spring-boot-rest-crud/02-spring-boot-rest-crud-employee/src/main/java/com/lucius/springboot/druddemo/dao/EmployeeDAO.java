package com.lucius.springboot.druddemo.dao;

import com.lucius.springboot.druddemo.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> findAll();
}
