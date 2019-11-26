package com.example.demo.rep;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entity.Question;

public interface QuestionRep extends JpaRepository<Question, Integer>,JpaSpecificationExecutor<Question> {

}
