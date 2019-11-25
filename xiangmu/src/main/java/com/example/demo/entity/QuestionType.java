package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="questiontype")
public class QuestionType {//题目分类
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int qt_id;//分类编号
	@Column(nullable=false)
	private String qt_name;//	分类名称
	@Column(nullable=false)
	private int qt_parentid;//父类id
	@Column(nullable=true)
	private int qt_yuliui;//预留字段1
	@Column(nullable=true)
	private String qt_yuliuis;//预留字段2
	public int getQt_id() {
		return qt_id;
	}
	public void setQt_id(int qt_id) {
		this.qt_id = qt_id;
	}
	public String getQt_name() {
		return qt_name;
	}
	public void setQt_name(String qt_name) {
		this.qt_name = qt_name;
	}
	public int getQt_parentid() {
		return qt_parentid;
	}
	public void setQt_parentid(int qt_parentid) {
		this.qt_parentid = qt_parentid;
	}
	public int getQt_yuliui() {
		return qt_yuliui;
	}
	public void setQt_yuliui(int qt_yuliui) {
		this.qt_yuliui = qt_yuliui;
	}
	public String getQt_yuliuis() {
		return qt_yuliuis;
	}
	public void setQt_yuliuis(String qt_yuliuis) {
		this.qt_yuliuis = qt_yuliuis;
	}
	
	public QuestionType() {
		super();
	}
	@Override
	public String toString() {
		return "QuestionType [qt_id=" + qt_id + ", qt_name=" + qt_name + ", qt_parentid=" + qt_parentid + ", qt_yuliui="
				+ qt_yuliui + ", qt_yuliuis=" + qt_yuliuis + "]";
	}

}
