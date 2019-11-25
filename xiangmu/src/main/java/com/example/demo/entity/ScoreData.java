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
@Table(name="scoredata")
public class ScoreData {//考试题
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int sd_id;//考题编号
	@Column(nullable=false)
	private String  sd_qid;//考试题目id拼接
	@Column(nullable=false)
	private String  sd_qanswer;//应试者答案拼接
	@Column(nullable=true)
	private int sd_yuliui;//预留字段1
	@Column(nullable=true)
	private String  sd_yuliuis;//预留字段2
	public int getSd_id() {
		return sd_id;
	}
	public void setSd_id(int sd_id) {
		this.sd_id = sd_id;
	}
	public String getSd_qid() {
		return sd_qid;
	}
	public void setSd_qid(String sd_qid) {
		this.sd_qid = sd_qid;
	}
	public String getSd_qanswer() {
		return sd_qanswer;
	}
	public void setSd_qanswer(String sd_qanswer) {
		this.sd_qanswer = sd_qanswer;
	}
	public int getSd_yuliui() {
		return sd_yuliui;
	}
	public void setSd_yuliui(int sd_yuliui) {
		this.sd_yuliui = sd_yuliui;
	}
	public String getSd_yuliuis() {
		return sd_yuliuis;
	}
	public void setSd_yuliuis(String sd_yuliuis) {
		this.sd_yuliuis = sd_yuliuis;
	}
	
	public ScoreData() {
		super();
	}
	@Override
	public String toString() {
		return "ScoreData [sd_id=" + sd_id + ", sd_qid=" + sd_qid + ", sd_qanswer=" + sd_qanswer + ", sd_yuliui="
				+ sd_yuliui + ", sd_yuliuis=" + sd_yuliuis + "]";
	}

}
