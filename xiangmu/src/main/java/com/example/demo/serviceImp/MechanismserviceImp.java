package com.example.demo.serviceImp;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.ExampleMatcher.GenericPropertyMatchers;

import com.example.demo.entity.Mechanism;
import com.example.demo.rep.MechanismRep;
import com.example.demo.service.Mechanismservice;
@Service
public class MechanismserviceImp implements Mechanismservice{
	@Autowired
	private MechanismRep mechanismrep;
	
	public Map<String, Object> selectmech(Integer page,Integer rows,Mechanism mechanism){
	PageRequest fenye = PageRequest.of(1,5);
	ExampleMatcher tiaojian = ExampleMatcher.matching().withMatcher("m_name", GenericPropertyMatchers.contains());
	Example<Mechanism> jieguo = Example.of(mechanism,tiaojian);
	List<Mechanism> findAll = mechanismrep.findAll(jieguo);
	Page<Mechanism> findAll2 = mechanismrep.findAll(jieguo,fenye);
	Map<String, Object> map=new HashMap<String, Object>();
	
	map.put("rows", findAll2.getContent());
	map.put("total", findAll.size());
	
	
	return map;
	
}
	
	
	
	
	public List<Mechanism> selectAll(){
		
		List<Mechanism> findAll = mechanismrep.findAll();
		return findAll;
		
	}
}
