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
@Table(name="transfer")
public class Transfer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int tr_id;//Id
	@Column(nullable=false)
	private int e_id;//	员工id
	@Column(nullable=false)
	private String e_name;//员工姓名
	@Column(nullable=false)
	@DateTimeFormat(pattern ="yyyy-MM-dd" )
	private String tr_Registrattime;//登记时间
	@Column(nullable=false)
	private String tr_Registrant;//登记人
	@Column(nullable=false)
	@DateTimeFormat(pattern ="yyyy-MM-dd" )
	private String tr_Audittime;//审核时间
	@Column(nullable=false)
	private String tr_Auditor;//审核人
	@Column(nullable=false)
	private String m_name;//原机构名称
	@Column(nullable=false)
	private String p_name;//原职位名称
	@Column(nullable=false)
	private String py_name;//原薪酬标准名称
	@Column(nullable=false)
	private int tr_mechanism;//新的机构id
	@Column(nullable=false)
	private int tr_position;//新的职位id
	@Column(nullable=false)
	private int tr_pay;//新的薪酬标准id
	@Column(nullable=false)
	private int  tr_state;//调动状态
	@Column(nullable=true)
	private int tr_yuliui;//预留字段x
	@Column(nullable=true)
	private String tr_yuliuis;//预留字段y
	public int getTr_id() {
		return tr_id;
	}
	public void setTr_id(int tr_id) {
		this.tr_id = tr_id;
	}
	public int getE_id() {
		return e_id;
	}
	public void setE_id(int e_id) {
		this.e_id = e_id;
	}
	public String getE_name() {
		return e_name;
	}
	public void setE_name(String e_name) {
		this.e_name = e_name;
	}
	public String getTr_Registrattime() {
		return tr_Registrattime;
	}
	public void setTr_Registrattime(String tr_Registrattime) {
		this.tr_Registrattime = tr_Registrattime;
	}
	public String getTr_Registrant() {
		return tr_Registrant;
	}
	public void setTr_Registrant(String tr_Registrant) {
		this.tr_Registrant = tr_Registrant;
	}
	public String getTr_Audittime() {
		return tr_Audittime;
	}
	public void setTr_Audittime(String tr_Audittime) {
		this.tr_Audittime = tr_Audittime;
	}
	public String getTr_Auditor() {
		return tr_Auditor;
	}
	public void setTr_Auditor(String tr_Auditor) {
		this.tr_Auditor = tr_Auditor;
	}
	public String getM_name() {
		return m_name;
	}
	public void setM_name(String m_name) {
		this.m_name = m_name;
	}
	public String getP_name() {
		return p_name;
	}
	public void setP_name(String p_name) {
		this.p_name = p_name;
	}
	public String getPy_name() {
		return py_name;
	}
	public void setPy_name(String py_name) {
		this.py_name = py_name;
	}
	public int getTr_mechanism() {
		return tr_mechanism;
	}
	public void setTr_mechanism(int tr_mechanism) {
		this.tr_mechanism = tr_mechanism;
	}
	public int getTr_position() {
		return tr_position;
	}
	public void setTr_position(int tr_position) {
		this.tr_position = tr_position;
	}
	public int getTr_pay() {
		return tr_pay;
	}
	public void setTr_pay(int tr_pay) {
		this.tr_pay = tr_pay;
	}
	public int getTr_state() {
		return tr_state;
	}
	public void setTr_state(int tr_state) {
		this.tr_state = tr_state;
	}
	public int getTr_yuliui() {
		return tr_yuliui;
	}
	public void setTr_yuliui(int tr_yuliui) {
		this.tr_yuliui = tr_yuliui;
	}
	public String getTr_yuliuis() {
		return tr_yuliuis;
	}
	public void setTr_yuliuis(String tr_yuliuis) {
		this.tr_yuliuis = tr_yuliuis;
	}
	
	public Transfer() {
		super();
	}
	@Override
	public String toString() {
		return "Transfer [tr_id=" + tr_id + ", e_id=" + e_id + ", e_name=" + e_name + ", tr_Registrattime="
				+ tr_Registrattime + ", tr_Registrant=" + tr_Registrant + ", tr_Audittime=" + tr_Audittime
				+ ", tr_Auditor=" + tr_Auditor + ", m_name=" + m_name + ", p_name=" + p_name + ", py_name=" + py_name
				+ ", tr_mechanism=" + tr_mechanism + ", tr_position=" + tr_position + ", tr_pay=" + tr_pay
				+ ", tr_state=" + tr_state + ", tr_yuliui=" + tr_yuliui + ", tr_yuliuis=" + tr_yuliuis + "]";
	}

	
}
