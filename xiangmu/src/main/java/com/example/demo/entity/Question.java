package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="question")
public class Question {//题库表
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int q_id;//	bigint	F	题目编号
	@Column(nullable=false)
	private int q_type;//	int	F	题类型
	@Column(nullable=false)
	private String q_questionStem;//	varchar(255)	F	题目
	@Column(nullable=false)
	private String q_answerA;//	varchar(255)	F	答案A
	@Column(nullable=false)
	private String q_answerB;//	varchar(255)	F	答案B
	@Column(nullable=false)
	private String q_answerC;//	varchar(255)	F	答案C
	@Column(nullable=false)
	private String q_answerD;//	varchar(255)	F	答案D
	@Column(nullable=false)
	private String q_answer;//	varchar(2)	F	正确答案
	@Column(nullable=true)
	private String q_analysis;//varchar(255)答案解析
	@Column(nullable=false)
	private String e_name;//	varchar(255)	F	登记人姓名
	@Column(nullable=false)
	@DateTimeFormat(pattern ="yyyy-MM-dd" )
	private String q_time;//	datetime	F	登记时间
	@Column(nullable=true)
	private String q_forward;//	varchar(255)	T	题目来源
	@Column(nullable=true)
	private int q_yuliui;//	int预留字段1
	@Column(nullable=true)
	private String q_yuliuis;//	varchar(255)预留字段2
	public int getQ_id() {
		return q_id;
	}
	public void setQ_id(int q_id) {
		this.q_id = q_id;
	}
	public int getQ_type() {
		return q_type;
	}
	public void setQ_type(int q_type) {
		this.q_type = q_type;
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
	public String getQ_time() {
		return q_time;
	}
	public void setQ_time(String q_time) {
		this.q_time = q_time;
	}
	public String getQ_forward() {
		return q_forward;
	}
	public void setQ_forward(String q_forward) {
		this.q_forward = q_forward;
	}
	public int getQ_yuliui() {
		return q_yuliui;
	}
	public void setQ_yuliui(int q_yuliui) {
		this.q_yuliui = q_yuliui;
	}
	public String getQ_yuliuis() {
		return q_yuliuis;
	}
	public void setQ_yuliuis(String q_yuliuis) {
		this.q_yuliuis = q_yuliuis;
	}
	
	public Question() {
		super();
	}
	@Override
	public String toString() {
		return "Question [q_id=" + q_id + ", q_type=" + q_type + ", q_questionStem=" + q_questionStem + ", q_answerA="
				+ q_answerA + ", q_answerB=" + q_answerB + ", q_answerC=" + q_answerC + ", q_answerD=" + q_answerD
				+ ", q_answer=" + q_answer + ", q_analysis=" + q_analysis + ", e_name=" + e_name + ", q_time=" + q_time
				+ ", q_forward=" + q_forward + ", q_yuliui=" + q_yuliui + ", q_yuliuis=" + q_yuliuis + "]";
	}

	
	
	
}
