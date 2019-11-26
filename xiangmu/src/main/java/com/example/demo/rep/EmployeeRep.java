package com.example.demo.rep;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Employee;

public interface EmployeeRep extends JpaRepository<Employee, Integer>{

}
