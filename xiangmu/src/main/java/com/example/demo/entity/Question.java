package com.example.demo.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonFormat;

@Component
@Entity
@Table(name="question")
public class Question {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer q_id;
	@Column(nullable=false)
	private String q_questionStem;
	@Column(nullable=false)
	private String q_answerA;
	@Column(nullable=false)
	private String q_answerB;
	@Column(nullable=false)
	private String q_answerC;
	@Column(nullable=false)
	private String q_answerD;
	@Column(nullable=false)
	private String q_answer;
	@Column(nullable=true)
	private String q_analysis;
	@Column(nullable=false)
	private String e_name;
	@Column(nullable=false)
	@DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
	private Date q_time;
	@Column(nullable=true)
	private String q_forward;
	@Column(nullable=true)
	private Integer q_yuliui;
	@Column(nullable=true)
	private String q_yuliuis;
	@ManyToOne
	@JoinColumn(name="q_type",referencedColumnName = "qt_id")
	private QuestionType questionType;
	public Integer getQ_id() {
		return q_id;
	}
	public void setQ_id(Integer q_id) {
		this.q_id = q_id;
	}
	public String getQ_questionStem() {
		return q_questionStem;
	}
	public void setQ_questionStem(String q_questionStem) {
		this.q_questionStem = q_questionStem;
	}
	public String getQ_answerA() {
		return q_answerA;
	}
	public void setQ_answerA(String q_answerA) {
		this.q_answerA = q_answerA;
	}
	public String getQ_answerB() {
		return q_answerB;
	}
	public void setQ_answerB(String q_answerB) {
		this.q_answerB = q_answerB;
	}
	public String getQ_answerC() {
		return q_answerC;
	}
	public void setQ_answerC(String q_answerC) {
		this.q_answerC = q_answerC;
	}
	public String getQ_answerD() {
		return q_answerD;
	}
	public void setQ_answerD(String q_answerD) {
		this.q_answerD = q_answerD;
	}
	public String getQ_answer() {
		return q_answer;
	}
	public void setQ_answer(String q_answer) {
		this.q_answer = q_answer;
	}
	public String getQ_analysis() {
		return q_analysis;
	}
	public void setQ_analysis(String q_analysis) {
		this.q_analysis = q_analysis;
	}
	public String getE_name() {
		return e_name;
	}
	public void setE_name(String e_name) {
		this.e_name = e_name;
	}
	public Date getQ_time() {
		return q_time;
	}
	public void setQ_time(Date q_time) {
		this.q_time = q_time;
	}
	public String getQ_forward() {
		return q_forward;
	}
	public void setQ_forward(String q_forward) {
		this.q_forward = q_forward;
	}
	public Integer getQ_yuliui() {
		return q_yuliui;
	}
	public void setQ_yuliui(Integer q_yuliui) {
		this.q_yuliui = q_yuliui;
	}
	public String getQ_yuliuis() {
		return q_yuliuis;
	}
	public void setQ_yuliuis(String q_yuliuis) {
		this.q_yuliuis = q_yuliuis;
	}
	public QuestionType getQuestionType() {
		return questionType;
	}
	public void setQuestionType(QuestionType questionType) {
		this.questionType = questionType;
	}
	@Override
	public String toString() {
		return "Question [q_id=" + q_id + ", q_questionStem=" + q_questionStem + ", q_answerA=" + q_answerA
				+ ", q_answerB=" + q_answerB + ", q_answerC=" + q_answerC + ", q_answerD=" + q_answerD + ", q_answer="
				+ q_answer + ", q_analysis=" + q_analysis + ", e_name=" + e_name + ", q_time=" + q_time + ", q_forward="
				+ q_forward + ", q_yuliui=" + q_yuliui + ", q_yuliuis=" + q_yuliuis + ", questionType=" + questionType
				+ "]";
	}
	
	
	
	
}