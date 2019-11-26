package com.example.demo.serviceImp;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.ExampleMatcher.GenericPropertyMatchers;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.rep.EmployeeRep;
import com.example.demo.service.Employeeservice;
@Service
public class EmployeeserviceImp implements Employeeservice{
@Autowired
private EmployeeRep employeerep;

public  Map<String, Object> selectEmployee(Integer page,Integer rows,Employee employee){
	page=page-1;
	PageRequest fenye = PageRequest.of(page,rows);
	ExampleMatcher tiaojian = ExampleMatcher.matching().withMatcher("e_name", GenericPropertyMatchers.contains());
	Example<Employee> jieguo = Example.of(employee,tiaojian);
	List<Employee> findAll = employeerep.findAll(jieguo);
	Page<Employee> findAll2 = employeerep.findAll(jieguo,fenye);
	Map<String, Object> map =new HashMap<String, Object>();
	map.put("rows", findAll2.getContent());
	map.put("total", findAll.size());
	return map;
}
	
	public List<Employee> findAll(){
		List<Employee> findAll = employeerep.findAll();
		return findAll;
	}
	
	
	
}
