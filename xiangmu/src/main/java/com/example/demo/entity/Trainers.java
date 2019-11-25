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
@Table(name="trainers")
public class Trainers {//被培训人员表
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ts_id;//编号
	@Column(nullable=false)
	private int tp_id;//培训计划编号
	@Column(nullable=false)
	private int Ts_zhuangtai;//（考核中，考核失败（定时清除失败的，并发送通知），考核通过，等待开始，培训中，培训结束）
	@Column(nullable=false)
	private int e_id;//人员编号
	@Column(nullable=false)
	private String ts_qingkuang;//考核情况
	@Column(nullable=true)
	private int ts_yuliui;//预留字段x
	@Column(nullable=true)
	private String ts_yuliuis;//预留字段y
	public int getTs_id() {
		return ts_id;
	}
	public void setTs_id(int ts_id) {
		this.ts_id = ts_id;
	}
	public int getTp_id() {
		return tp_id;
	}
	public void setTp_id(int tp_id) {
		this.tp_id = tp_id;
	}
	public int getTs_zhuangtai() {
		return Ts_zhuangtai;
	}
	public void setTs_zhuangtai(int ts_zhuangtai) {
		Ts_zhuangtai = ts_zhuangtai;
	}
	public int getE_id() {
		return e_id;
	}
	public void setE_id(int e_id) {
		this.e_id = e_id;
	}
	public String getTs_qingkuang() {
		return ts_qingkuang;
	}
	public void setTs_qingkuang(String ts_qingkuang) {
		this.ts_qingkuang = ts_qingkuang;
	}
	public int getTs_yuliui() {
		return ts_yuliui;
	}
	public void setTs_yuliui(int ts_yuliui) {
		this.ts_yuliui = ts_yuliui;
	}
	public String getTs_yuliuis() {
		return ts_yuliuis;
	}
	public void setTs_yuliuis(String ts_yuliuis) {
		this.ts_yuliuis = ts_yuliuis;
	}
	
	public Trainers() {
		super();
	}
	@Override
	public String toString() {
		return "Trainers [ts_id=" + ts_id + ", tp_id=" + tp_id + ", Ts_zhuangtai=" + Ts_zhuangtai + ", e_id=" + e_id
				+ ", ts_qingkuang=" + ts_qingkuang + ", ts_yuliui=" + ts_yuliui + ", ts_yuliuis=" + ts_yuliuis + "]";
	}

}
