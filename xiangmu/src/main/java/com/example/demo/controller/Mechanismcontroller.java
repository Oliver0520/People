package com.example.demo.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Mechanism;
import com.example.demo.serviceImp.MechanismserviceImp;

@RestController
@CrossOrigin
public class Mechanismcontroller {
	@Autowired
	private MechanismserviceImp mechanismseriveimp;

	@GetMapping(value = "selectmechanism")
	public Map<String, Object> selectmech(Integer page, Integer rows, Mechanism mechanism) {
		return mechanismseriveimp.selectmech(page, rows, mechanism);
	}

	@GetMapping(value = "selectall")
	public List<Mechanism> selectAll() {
		List<Mechanism> selectAll = mechanismseriveimp.selectAll();
		return selectAll;
	}
}
