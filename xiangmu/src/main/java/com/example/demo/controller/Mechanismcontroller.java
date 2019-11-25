package com.example.demo.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Mechanism;
import com.example.demo.rep.MechanismRep;
import com.example.demo.service.Mechanismservice;

@RestController
@CrossOrigin
public class Mechanismcontroller {
	@Autowired
	private MechanismRep mechanism;
	@Autowired
	private Mechanismservice mechanismservice;
public Map<String, Object> selectmech(Integer page,Integer rows,Mechanism mechanism){
	PageRequest pageRequest = PageRequest.of(page,(page-1)*rows);
	
	return null;
	
}
}
