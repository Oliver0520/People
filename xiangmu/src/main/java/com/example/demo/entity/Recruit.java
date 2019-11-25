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
@Table(name="recruit")
public class Recruit {//招聘表
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ru_id;//	招聘编号
	@Column(nullable=false)
	private int p_id;//	int	F	职位id
	@Column(nullable=false)
	private int m_id;//	int	F	机构id
	@Column(nullable=false)
	private String ru_type	;//varchar(255)	F	招聘类型
	@Column(nullable=false)
	private String ru_name;//	varchar(255)	F	职位名称
	@Column(nullable=false)
	private int ru_number;//	int	F	招聘人数
	@Column(nullable=false)
	@DateTimeFormat(pattern ="yyyy-MM-dd" )
	private String ru_stime;//	datetime	F	发布日期
	@Column(nullable=false)
	@DateTimeFormat(pattern ="yyyy-MM-dd" )
	private String ru_etime;//	datetime	F	截止日期
	@Column(nullable=false)
	private String m_introduce;//	varchar(255)	F	职位描述
	@Column(nullable=false)
	private String ru_skill;//	varchar(255)	F	招聘要求
	@Column(nullable=false)
	private String e_name;//	varchar(255)	F	登记人姓名
	@Column(nullable=false)
	@DateTimeFormat(pattern ="yyyy-MM-dd" )
	private String e_time;//	datetime	F	登记时间
	@Column(nullable=true)
	private int ru_yuliui;//	int	T	预留字段1
	@Column(nullable=true)
	private String ru_yuliuis;//	varchar(255)	T	预留字段2
	public int getRu_id() {
		return ru_id;
	}
	public void setRu_id(int ru_id) {
		this.ru_id = ru_id;
	}
	public int getP_id() {
		return p_id;
	}
	public void setP_id(int p_id) {
		this.p_id = p_id;
	}
	public int getM_id() {
		return m_id;
	}
	public void setM_id(int m_id) {
		this.m_id = m_id;
	}
	public String getRu_type() {
		return ru_type;
	}
	public void setRu_type(String ru_type) {
		this.ru_type = ru_type;
	}
	public String getRu_name() {
		return ru_name;
	}
	public void setRu_name(String ru_name) {
		this.ru_name = ru_name;
	}
	public int getRu_number() {
		return ru_number;
	}
	public void setRu_number(int ru_number) {
		this.ru_number = ru_number;
	}
	public String getRu_stime() {
		return ru_stime;
	}
	public void setRu_stime(String ru_stime) {
		this.ru_stime = ru_stime;
	}
	public String getRu_etime() {
		return ru_etime;
	}
	public void setRu_etime(String ru_etime) {
		this.ru_etime = ru_etime;
	}
	public String getM_introduce() {
		return m_introduce;
	}
	public void setM_introduce(String m_introduce) {
		this.m_introduce = m_introduce;
	}
	public String getRu_skill() {
		return ru_skill;
	}
	public void setRu_skill(String ru_skill) {
		this.ru_skill = ru_skill;
	}
	public String getE_name() {
		return e_name;
	}
	public void setE_name(String e_name) {
		this.e_name = e_name;
	}
	public String getE_time() {
		return e_time;
	}
	public void setE_time(String e_time) {
		this.e_time = e_time;
	}
	public int getRu_yuliui() {
		return ru_yuliui;
	}
	public void setRu_yuliui(int ru_yuliui) {
		this.ru_yuliui = ru_yuliui;
	}
	public String getRu_yuliuis() {
		return ru_yuliuis;
	}
	public void setRu_yuliuis(String ru_yuliuis) {
		this.ru_yuliuis = ru_yuliuis;
	}
	
	public Recruit() {
		super();
	}
	@Override
	public String toString() {
		return "Recruit [ru_id=" + ru_id + ", p_id=" + p_id + ", m_id=" + m_id + ", ru_type=" + ru_type + ", ru_name="
				+ ru_name + ", ru_number=" + ru_number + ", ru_stime=" + ru_stime + ", ru_etime=" + ru_etime
				+ ", m_introduce=" + m_introduce + ", ru_skill=" + ru_skill + ", e_name=" + e_name + ", e_time="
				+ e_time + ", ru_yuliui=" + ru_yuliui + ", ru_yuliuis=" + ru_yuliuis + "]";
	}

	
}
