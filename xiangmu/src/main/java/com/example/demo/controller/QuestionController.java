package com.example.demo.controller;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Question;
import com.example.demo.entity.QuestionType;
import com.example.demo.service.QuestionService;

@RestController
@CrossOrigin
public class QuestionController {

	@Autowired
	private QuestionService qService;
	
	@PostMapping("chaxunceshi")
	public Map<String,Object> chaxuntiku(Integer page,Integer rows,Question question,QuestionType qt){
		question.setQuestionType(qt);
		
		return qService.findAll(page,rows,question);
	}
}
