package com.example.demo.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.serviceImp.EmployeeserviceImp;

@RestController
@CrossOrigin

public class Employeecontroller {
@Autowired
private EmployeeserviceImp employeeserviceimp;
@PostMapping(value="selectemployee")
	public Map<String, Object>selectemp(Integer page,Integer rows,Employee employee){
	Map<String, Object> selectEmployee = employeeserviceimp.selectEmployee(page, rows, employee);
		return selectEmployee;
				
	}
@PostMapping(value="findAllemp")
	public List<Employee> findAll(){
		List<Employee> findAll = employeeserviceimp.findAll();
		return findAll;
	}
	
}
