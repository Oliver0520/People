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
@Table(name="excitation")
public class Excitation {//激励预发放表
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ex_id;//激励列表id
	@Column(nullable=false)
	private int e_id;//员工编号
	@Column(nullable=false)
	private int e_state;//员工状态

	@Column(nullable=false,precision = 12, scale =2)
	private BigDecimal pd_xiaoji;//绩效金额
	@Column(nullable=false)
	private int re_id;//激励奖项
	@Column(nullable=false)
	@DateTimeFormat(pattern ="yyyy-MM-dd" )
	private String ex_begintime;//激励发放日期
	@Column(nullable=false)
	private int ex_getTorF;//激励领取状态
	@Column(nullable=false)
	@DateTimeFormat(pattern ="yyyy-MM-dd" )
	private String re_validitytime;//激励有效期
	@Column(nullable=true)
	private int ex_yuliui;//预留int
	@Column(nullable=true)
	private String ex_yulius;//预留varchar(255)
	public int getEx_id() {
		return ex_id;
	}
	public void setEx_id(int ex_id) {
		this.ex_id = ex_id;
	}
	public int getE_id() {
		return e_id;
	}
	public void setE_id(int e_id) {
		this.e_id = e_id;
	}
	public int getE_state() {
		return e_state;
	}
	public void setE_state(int e_state) {
		this.e_state = e_state;
	}
	public BigDecimal getPd_xiaoji() {
		return pd_xiaoji;
	}
	public void setPd_xiaoji(BigDecimal pd_xiaoji) {
		this.pd_xiaoji = pd_xiaoji;
	}
	public int getRe_id() {
		return re_id;
	}
	public void setRe_id(int re_id) {
		this.re_id = re_id;
	}
	public String getEx_begintime() {
		return ex_begintime;
	}
	public void setEx_begintime(String ex_begintime) {
		this.ex_begintime = ex_begintime;
	}
	public int getEx_getTorF() {
		return ex_getTorF;
	}
	public void setEx_getTorF(int ex_getTorF) {
		this.ex_getTorF = ex_getTorF;
	}
	public String getRe_validitytime() {
		return re_validitytime;
	}
	public void setRe_validitytime(String re_validitytime) {
		this.re_validitytime = re_validitytime;
	}
	public int getEx_yuliui() {
		return ex_yuliui;
	}
	public void setEx_yuliui(int ex_yuliui) {
		this.ex_yuliui = ex_yuliui;
	}
	public String getEx_yulius() {
		return ex_yulius;
	}
	public void setEx_yulius(String ex_yulius) {
		this.ex_yulius = ex_yulius;
	}
	
	
	public Excitation() {
		super();
	}
	@Override
	public String toString() {
		return "Excitation [ex_id=" + ex_id + ", e_id=" + e_id + ", e_state=" + e_state + ", pd_xiaoji=" + pd_xiaoji
				+ ", re_id=" + re_id + ", ex_begintime=" + ex_begintime + ", ex_getTorF=" + ex_getTorF
				+ ", re_validitytime=" + re_validitytime + ", ex_yuliui=" + ex_yuliui + ", ex_yulius=" + ex_yulius
				+ "]";
	}

	
	
	
	
}
