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
@Table(name="traindata")
public class TrainData {//培训日志表
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int td_id;//	Int	F	编号
	@Column(nullable=false)
	private int tp_id;//	Int	F	所属培训计划编号
	@Column(nullable=false)
	@DateTimeFormat(pattern ="yyyy-MM-dd" )
	private String td_itime;//	记录时间、
	@Column(nullable=false)
	private String td_didian;//	培训地点、
	@Column(nullable=false)
	private String td_neirong;//培训内容、
	@Column(nullable=false)
	private String td_mudi;//	培训目的
	@Column(nullable=false)
	private String td_xiaoguo;//培训效果
	@Column(nullable=true)
	private int td_yuliui;//	预留字段x
	@Column(nullable=true)
	private String td_yuliuis;//预留字段y
	
	public int getTd_id() {
		return td_id;
	}
	public void setTd_id(int td_id) {
		this.td_id = td_id;
	}
	public int getTp_id() {
		return tp_id;
	}
	public void setTp_id(int tp_id) {
		this.tp_id = tp_id;
	}
	public String getTd_itime() {
		return td_itime;
	}
	public void setTd_itime(String td_itime) {
		this.td_itime = td_itime;
	}
	public String getTd_didian() {
		return td_didian;
	}
	public void setTd_didian(String td_didian) {
		this.td_didian = td_didian;
	}
	public String getTd_neirong() {
		return td_neirong;
	}
	public void setTd_neirong(String td_neirong) {
		this.td_neirong = td_neirong;
	}
	public String getTd_mudi() {
		return td_mudi;
	}
	public void setTd_mudi(String td_mudi) {
		this.td_mudi = td_mudi;
	}
	public String getTd_xiaoguo() {
		return td_xiaoguo;
	}
	public void setTd_xiaoguo(String td_xiaoguo) {
		this.td_xiaoguo = td_xiaoguo;
	}
	public int getTd_yuliui() {
		return td_yuliui;
	}
	public void setTd_yuliui(int td_yuliui) {
		this.td_yuliui = td_yuliui;
	}
	public String getTd_yuliuis() {
		return td_yuliuis;
	}
	public void setTd_yuliuis(String td_yuliuis) {
		this.td_yuliuis = td_yuliuis;
	}
	
	public TrainData() {
		super();
	}
	@Override
	public String toString() {
		return "Traindata [td_id=" + td_id + ", tp_id=" + tp_id + ", td_itime=" + td_itime + ", td_didian=" + td_didian
				+ ", td_neirong=" + td_neirong + ", td_mudi=" + td_mudi + ", td_xiaoguo=" + td_xiaoguo + ", td_yuliui="
				+ td_yuliui + ", td_yuliuis=" + td_yuliuis + "]";
	}

}
