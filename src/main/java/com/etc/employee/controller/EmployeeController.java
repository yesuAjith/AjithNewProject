package com.etc.employee.controller;

import org.springframework.web.bind.annotation.RestController;

import com.etc.employee.dto.EmployeeAdd;
import com.etc.employee.entity.Employee;
import com.etc.employee.repositary.AddressRepositaory;
import com.etc.employee.repositary.EmployeeRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class EmployeeController {
	


	
    
	@PostMapping("/send")
	public Employee saveEmployee (@RequestBody EmployeeAdd addemp) {
		
		return null;
	}
	
	@GetMapping
	public List<Employee>findEmployee(){
		return null;
	}
	

}
