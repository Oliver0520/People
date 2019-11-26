package com.example.demo.controller;



import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.criteria.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Pay;
import com.example.demo.rep.PayRepository;



@RestController
@CrossOrigin
public class PayController {
	@Autowired
	private PayRepository payRepository;
	@PostMapping("/selectPayAll")
	public Object  selectAll( Integer pay_id, String pay_gjz,String start_time,String end_time,int page,int rows) {
		//System.out.println(payid);		
		
		PageRequest pageRequest = new PageRequest((page-1),rows);
		Page<Pay> findAll = payRepository.findAll(paytiaojian(pay_id,pay_gjz,start_time,end_time),pageRequest);
		List<Pay> list=findAll.getContent();
		long totalElements = findAll.getTotalElements();
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("total", totalElements);
		map.put("rows", list);
		return map;
	}
	
	
	private Specification<Pay> paytiaojian(final Integer pay_id,final String pay_gjz,final String start_time,final String end_time) {
		
		return new Specification<Pay>() {

			public Predicate toPredicate(Root<Pay> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
				Predicate conjunction = cb.conjunction();
				List<Expression<Boolean>> expressions = conjunction.getExpressions();	
				if(!StringUtils.isEmpty(pay_id)) {
					expressions.add(cb.equal(root.<String>get("pay_id"),pay_id));
				}
				if(!StringUtils.isEmpty(pay_gjz)) {
					expressions.add(cb.like(root.<String>get("py_name"), "%"+pay_gjz+"%"));
					
				} /*
					 * if else {
					 * 
					 * expressions.add(cb.like(root.<String>get("py_formulate"), "%"+pay_gjz+"%"));
					 * 
					 * } if {
					 * 
					 * expressions.add(cb.like(root.<String>get("py_registrant"), "%"+pay_gjz+"%"));
					 * }
					 */
				/*
				 * if(!StringUtils.isEmpty(start_time)&&!StringUtils.isEmpty(end_time)) {
				 * expressions.add(cb.between(root.get("py_time"),start_time,end_time)); }
				 */
				return conjunction;
			}
			
		};
	}
}
