package com.etc.employee.controller.repositaory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.etc.employee.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}
