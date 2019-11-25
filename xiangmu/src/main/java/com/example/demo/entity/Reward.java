package com.example.demo.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="reward")
public class Reward {//激励奖项表
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int re_id;//int激励ID
	@Column(nullable=false)
	private String re_name;//varchar(255)	F	激励名称
	@Column(nullable=false)
	private int re_max;//Int激励最大数量
	
	@Column(nullable=false,precision = 12, scale =2)
	private BigDecimal re_money;//decimal激励价值
	@Column(nullable=true)
	private int re_yuliui;//int预留int
	@Column(nullable=true)
	private String re_yulius;//预留varchar(255)
	public int getRe_id() {
		return re_id;
	}
	public void setRe_id(int re_id) {
		this.re_id = re_id;
	}
	public String getRe_name() {
		return re_name;
	}
	public void setRe_name(String re_name) {
		this.re_name = re_name;
	}
	public int getRe_max() {
		return re_max;
	}
	public void setRe_max(int re_max) {
		this.re_max = re_max;
	}
	public BigDecimal getRe_money() {
		return re_money;
	}
	public void setRe_money(BigDecimal re_money) {
		this.re_money = re_money;
	}
	public int getRe_yuliui() {
		return re_yuliui;
	}
	public void setRe_yuliui(int re_yuliui) {
		this.re_yuliui = re_yuliui;
	}
	public String getRe_yulius() {
		return re_yulius;
	}
	public void setRe_yulius(String re_yulius) {
		this.re_yulius = re_yulius;
	}
	public Reward() {
		super();
	}
	@Override
	public String toString() {
		return "Reward [re_id=" + re_id + ", re_name=" + re_name + ", re_max=" + re_max + ", re_money=" + re_money
				+ ", re_yuliui=" + re_yuliui + ", re_yulius=" + re_yulius + ", getRe_id()=" + getRe_id()
				+ ", getRe_name()=" + getRe_name() + ", getRe_max()=" + getRe_max() + ", getRe_money()=" + getRe_money()
				+ ", getRe_yuliui()=" + getRe_yuliui() + ", getRe_yulius()=" + getRe_yulius() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

}
