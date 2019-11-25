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
@Table(name="score")
public class Score {//成绩表
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int s_id;//	int	F	成绩编号
	@Column(nullable=false)
	private String e_cardId;//应试人身份证号
	@Column(nullable=false)
	private String e_name;//应试人姓名
	@Column(nullable=false)
	@DateTimeFormat(pattern ="yyyy-MM-dd" )
	private String s_time;//应试时间
	@Column(nullable=false)
	private int s_score;//应试成绩
	@Column(nullable=false)
	private int s_data;//考题
	@Column(nullable=true)
	private int s_yuliui;//	预留字段1
	@Column(nullable=true)
	private String s_yuliuis;//	预留字段2
	public int getS_id() {
		return s_id;
	}
	public void setS_id(int s_id) {
		this.s_id = s_id;
	}
	public String getE_cardId() {
		return e_cardId;
	}
	public void setE_cardId(String e_cardId) {
		this.e_cardId = e_cardId;
	}
	public String getE_name() {
		return e_name;
	}
	public void setE_name(String e_name) {
		this.e_name = e_name;
	}
	public String getS_time() {
		return s_time;
	}
	public void setS_time(String s_time) {
		this.s_time = s_time;
	}
	public int getS_score() {
		return s_score;
	}
	public void setS_score(int s_score) {
		this.s_score = s_score;
	}
	public int getS_data() {
		return s_data;
	}
	public void setS_data(int s_data) {
		this.s_data = s_data;
	}
	public int getS_yuliui() {
		return s_yuliui;
	}
	public void setS_yuliui(int s_yuliui) {
		this.s_yuliui = s_yuliui;
	}
	public String getS_yuliuis() {
		return s_yuliuis;
	}
	public void setS_yuliuis(String s_yuliuis) {
		this.s_yuliuis = s_yuliuis;
	}
	
	
	public Score() {
		super();
	}
	public Score(int s_id, String e_cardId, String e_name, String s_time, int s_score, int s_data, int s_yuliui,
			String s_yuliuis) {
		super();
		this.s_id = s_id;
		this.e_cardId = e_cardId;
		this.e_name = e_name;
		this.s_time = s_time;
		this.s_score = s_score;
		this.s_data = s_data;
		this.s_yuliui = s_yuliui;
		this.s_yuliuis = s_yuliuis;
	}
	@Override
	public String toString() {
		return "Score [s_id=" + s_id + ", e_cardId=" + e_cardId + ", e_name=" + e_name + ", s_time=" + s_time
				+ ", s_score=" + s_score + ", s_data=" + s_data + ", s_yuliui=" + s_yuliui + ", s_yuliuis=" + s_yuliuis
				+ "]";
	}

}
