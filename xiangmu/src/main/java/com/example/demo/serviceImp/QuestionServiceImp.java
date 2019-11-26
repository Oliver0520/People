package com.example.demo.serviceImp;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Expression;
import javax.persistence.criteria.Root;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.example.demo.entity.Question;
import com.example.demo.rep.QuestionRep;
import com.example.demo.service.QuestionService;

@Service
public class QuestionServiceImp implements QuestionService {

	@Autowired
	private QuestionRep qRep;

	@Override
	public Map<String, Object> findAll(Integer page, Integer rows, Question question) {
		// TODO Auto-generated method stub

		page=page-1;
		PageRequest pageRequest = new PageRequest(page,rows);
		String q_questionStem = question.getQ_questionStem();
		Page<Question> adf = qRep.findAll(byname(question),pageRequest);
		Integer number = (int) adf.getTotalElements();
		Map<String, Object> map = new HashMap<String, Object>();

		map.put("rows", adf);
		map.put("total", number);
		return map;

	}

	

	private Specification<Question> byname(final Question question) {
		
		return new Specification<Question>() {

			public Predicate toPredicate(Root<Question> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
				Predicate conjunction = cb.conjunction();
				List<Expression<Boolean>> expressions = conjunction.getExpressions();
				if(!StringUtils.isEmpty(question.getQ_questionStem())) {
					expressions.add(cb.like(root.<String>get("q_questionSteam"), "%"+question.getQ_questionStem()+"%"));
				}
				if(question.getQuestionType().getQt_parentid()!=null) {
					expressions.add(cb.equal(root.<String>get("q_type"),question.getQuestionType().getQt_id()));
				}
				return conjunction;
			}
			
		};
	}
}
