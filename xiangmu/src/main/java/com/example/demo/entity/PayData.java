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
@Table(name="paydata")
public class PayData {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pd_id;//	Int	F	Id
	@Column(nullable=false)
	private int e_id;//	Int	F	员工编号
	@Column(nullable=false)
	@DateTimeFormat(pattern ="yyyy-MM-dd" )
	private String pd_time;//	Date	F	时间
	@Column(nullable=false)
	private String pd_reason;//	Varchar	F	原因
	@Column(nullable=true,precision = 12, scale =2)
	private BigDecimal pd_Jiangli;//	Decimal	T	奖励金额
	@Column(nullable=true,precision = 12, scale =2)
	private BigDecimal pd_xiaoji;//	Decimal	T	效绩金额
	@Column(nullable=true,precision = 12, scale =2)
	private BigDecimal pd_kouchu;//	Decimal	T	应扣金额
	@Column(nullable=true)
	private int pd_yuliui;//	int	T	预留字段x
	@Column(nullable=true)
	private String pd_yuliuis;//	varchar	T	预留字段y
	
	public int getPd_id() {
		return pd_id;
	}
	public void setPd_id(int pd_id) {
		this.pd_id = pd_id;
	}
	public int getE_id() {
		return e_id;
	}
	public void setE_id(int e_id) {
		this.e_id = e_id;
	}
	public String getPd_time() {
		return pd_time;
	}
	public void setPd_time(String pd_time) {
		this.pd_time = pd_time;
	}
	public String getPd_reason() {
		return pd_reason;
	}
	public void setPd_reason(String pd_reason) {
		this.pd_reason = pd_reason;
	}
	public BigDecimal getPd_Jiangli() {
		return pd_Jiangli;
	}
	public void setPd_Jiangli(BigDecimal pd_Jiangli) {
		this.pd_Jiangli = pd_Jiangli;
	}
	public BigDecimal getPd_xiaoji() {
		return pd_xiaoji;
	}
	public void setPd_xiaoji(BigDecimal pd_xiaoji) {
		this.pd_xiaoji = pd_xiaoji;
	}

	public int getPd_yuliui() {
		return pd_yuliui;
	}
	public void setPd_yuliui(int pd_yuliui) {
		this.pd_yuliui = pd_yuliui;
	}
	public String getPd_yuliuis() {
		return pd_yuliuis;
	}
	public void setPd_yuliuis(String pd_yuliuis) {
		this.pd_yuliuis = pd_yuliuis;
	}
	
	
	public BigDecimal getPd_kouchu() {
		return pd_kouchu;
	}
	public void setPd_kouchu(BigDecimal pd_kouchu) {
		this.pd_kouchu = pd_kouchu;
	}

	public PayData() {
		super();
	}
	@Override
	public String toString() {
		return "PayData [pd_id=" + pd_id + ", e_id=" + e_id + ", pd_time=" + pd_time + ", pd_reason=" + pd_reason
				+ ", pd_Jiangli=" + pd_Jiangli + ", pd_xiaoji=" + pd_xiaoji + ", pd_kouchu=" + pd_kouchu
				+ ", pd_yuliui=" + pd_yuliui + ", pd_yuliuis=" + pd_yuliuis + "]";
	}
	
}
