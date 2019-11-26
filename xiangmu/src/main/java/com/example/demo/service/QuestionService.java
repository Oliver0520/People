package com.example.demo.service;


import java.util.Date;
import java.util.Map;

import com.example.demo.entity.Question;

public interface QuestionService {

	Map<String,Object> findAll(Integer page,Integer rows,Question question);
}
