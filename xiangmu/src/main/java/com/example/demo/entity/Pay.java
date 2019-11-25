package com.example.demo.entity;

import java.math.BigDecimal;

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
@Table(name="pay")
public class Pay {//标准薪酬表
	/*
	 * @ManyToOne
	 * 
	 * @JoinColumn(name="lbid",referencedColumnName = "lbid") private Leibie leibie;
	 */
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int py_id;	//编号（系统自动生成）
@Column(nullable=false)
private String py_name;	//薪酬名称
@Column(nullable=false)
@DateTimeFormat(pattern ="yyyy-MM-dd" )
private String py_time	;//登记时间（系统自动生成）
@Column(nullable=false)
private String py_formulate;	//制定人
@Column(nullable=false)
private String py_registrant;	//登记人（默认为当前登录用户，可以修改）
@Column(nullable=false,precision = 12, scale =2)
private BigDecimal  py_basepay;	//基本工资
@Column(nullable=true,precision = 12, scale =2)
private BigDecimal py_communicationsubsidy;//	通讯补贴
@Column(nullable=true,precision = 12, scale =2)
private BigDecimal py_trafficsubsidy;//	交通补贴
@Column(nullable=true,precision = 12, scale =2)
private BigDecimal py_floatingwages;	//	浮动工资
@Column(nullable=true,precision = 12, scale =2)
private BigDecimal py_regularwages;	//	常规
@Column(nullable=true,precision = 12, scale =2)
private BigDecimal py_compensation;	//	交通补助
@Column(nullable=true,precision = 12, scale =2)
private BigDecimal py_lunchallowance;	//午餐补助
@Column(nullable=true,precision = 12, scale =2)
private BigDecimal py_vehiclerepair;	//	车补
@Column(nullable=true)
private int py_yuliui;	//	预留字段x
@Column(nullable=true)
private String py_yuliuis;	//	预留字段y




public int getPy_id() {
	return py_id;
}
public void setPy_id(int py_id) {
	this.py_id = py_id;
}
public String getPy_name() {
	return py_name;
}
public void setPy_name(String py_name) {
	this.py_name = py_name;
}
public String getPy_time() {
	return py_time;
}
public void setPy_time(String py_time) {
	this.py_time = py_time;
}
public String getPy_formulate() {
	return py_formulate;
}
public void setPy_formulate(String py_formulate) {
	this.py_formulate = py_formulate;
}
public String getPy_registrant() {
	return py_registrant;
}
public void setPy_registrant(String py_registrant) {
	this.py_registrant = py_registrant;
}
public BigDecimal getPy_basepay() {
	return py_basepay;
}
public void setPy_basepay(BigDecimal py_basepay) {
	this.py_basepay = py_basepay;
}
public BigDecimal getPy_communicationsubsidy() {
	return py_communicationsubsidy;
}
public void setPy_communicationsubsidy(BigDecimal py_communicationsubsidy) {
	this.py_communicationsubsidy = py_communicationsubsidy;
}
public BigDecimal getPy_trafficsubsidy() {
	return py_trafficsubsidy;
}
public void setPy_trafficsubsidy(BigDecimal py_trafficsubsidy) {
	this.py_trafficsubsidy = py_trafficsubsidy;
}
public BigDecimal getPy_floatingwages() {
	return py_floatingwages;
}
public void setPy_floatingwages(BigDecimal py_floatingwages) {
	this.py_floatingwages = py_floatingwages;
}
public BigDecimal getPy_regularwages() {
	return py_regularwages;
}
public void setPy_regularwages(BigDecimal py_regularwages) {
	this.py_regularwages = py_regularwages;
}
public BigDecimal getPy_compensation() {
	return py_compensation;
}
public void setPy_compensation(BigDecimal py_compensation) {
	this.py_compensation = py_compensation;
}
public BigDecimal getPy_lunchallowance() {
	return py_lunchallowance;
}
public void setPy_lunchallowance(BigDecimal py_lunchallowance) {
	this.py_lunchallowance = py_lunchallowance;
}
public BigDecimal getPy_vehiclerepair() {
	return py_vehiclerepair;
}
public void setPy_vehiclerepair(BigDecimal py_vehiclerepair) {
	this.py_vehiclerepair = py_vehiclerepair;
}
public int getPy_yuliui() {
	return py_yuliui;
}
public void setPy_yuliui(int py_yuliui) {
	this.py_yuliui = py_yuliui;
}
public String getPy_yuliuis() {
	return py_yuliuis;
}
public void setPy_yuliuis(String py_yuliuis) {
	this.py_yuliuis = py_yuliuis;
}
public Pay() {
	super();
}
@Override
public String toString() {
	return "Pay [py_id=" + py_id + ", py_name=" + py_name + ", py_time=" + py_time + ", py_formulate=" + py_formulate
			+ ", py_registrant=" + py_registrant + ", py_basepay=" + py_basepay + ", py_communicationsubsidy="
			+ py_communicationsubsidy + ", py_trafficsubsidy=" + py_trafficsubsidy + ", py_floatingwages="
			+ py_floatingwages + ", py_regularwages=" + py_regularwages + ", py_compensation=" + py_compensation
			+ ", py_lunchallowance=" + py_lunchallowance + ", py_vehiclerepair=" + py_vehiclerepair + ", py_yuliui="
			+ py_yuliui + ", py_yuliuis=" + py_yuliuis + "]";
}



}
