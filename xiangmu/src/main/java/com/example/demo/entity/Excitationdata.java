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
@Table(name="excitationdata")
public class Excitationdata {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ed_id;//日志编号
	@Column(nullable=false)
	private int  e_id;//	员工编号
	@Column(nullable=false)
	private int  re_id;//激励编号
	@Column(nullable=false)
	@DateTimeFormat(pattern ="yyyy-MM-dd" )
	private String ed_gettime;//领取日期
	@Column(nullable=true)
	private int  ed_yuliui;//预留int
	@Column(nullable=true)
	private String ed_yulius;//预留varchar(255)
	public int getEd_id() {
		return ed_id;
	}
	public void setEd_id(int ed_id) {
		this.ed_id = ed_id;
	}
	public int getE_id() {
		return e_id;
	}
	public void setE_id(int e_id) {
		this.e_id = e_id;
	}
	public int getRe_id() {
		return re_id;
	}
	public void setRe_id(int re_id) {
		this.re_id = re_id;
	}
	public String getEd_gettime() {
		return ed_gettime;
	}
	public void setEd_gettime(String ed_gettime) {
		this.ed_gettime = ed_gettime;
	}
	public int getEd_yuliui() {
		return ed_yuliui;
	}
	public void setEd_yuliui(int ed_yuliui) {
		this.ed_yuliui = ed_yuliui;
	}
	public String getEd_yulius() {
		return ed_yulius;
	}
	public void setEd_yulius(String ed_yulius) {
		this.ed_yulius = ed_yulius;
	}
	public Excitationdata() {
		super();
	}
	@Override
	public String toString() {
		return "Excitationdata [ed_id=" + ed_id + ", e_id=" + e_id + ", re_id=" + re_id + ", ed_gettime=" + ed_gettime
				+ ", ed_yuliui=" + ed_yuliui + ", ed_yulius=" + ed_yulius + "]";
	}

}
