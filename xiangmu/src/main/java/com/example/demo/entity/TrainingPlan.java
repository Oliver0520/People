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
@Table(name="trainingplan")
public class TrainingPlan {//培训计划表
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int tp_id;//	Int	F	编号
	@Column(nullable=false)
	private String tp_fanwei;//		培训范围
	@Column(nullable=false)
	private String tp_fangshi;//	培训方式

	@Column(nullable=false,precision = 12, scale =2)
	private BigDecimal tp_feiyong;//培训费用
	@Column(nullable=false)
	private int tp_renshu;//	培训人数
	@Column(nullable=false)
	@DateTimeFormat(pattern ="yyyy-MM-dd" )
	private String tp_start;//	培训开始时间
	@Column(nullable=true)
	@DateTimeFormat(pattern ="yyyy-MM-dd" )
	private String tp_end;//	培训结束时间
	@Column(nullable=false)
	private int tp_qingkuang;//实施情况（未开始，已开始,进行中，结束）
	@Column(nullable=false)
	private String tp_pingjia;//评价
	@Column(nullable=true)
	private Integer tp_yuliui;//预留字段x
	@Column(nullable=true)
	private String tp_yuliuis;//预留字段y
	public int getTp_id() {
		return tp_id;
	}
	public void setTp_id(int tp_id) {
		this.tp_id = tp_id;
	}
	public String getTp_fanwei() {
		return tp_fanwei;
	}
	public void setTp_fanwei(String tp_fanwei) {
		this.tp_fanwei = tp_fanwei;
	}
	public String getTp_fangshi() {
		return tp_fangshi;
	}
	public void setTp_fangshi(String tp_fangshi) {
		this.tp_fangshi = tp_fangshi;
	}
	public BigDecimal getTp_feiyong() {
		return tp_feiyong;
	}
	public void setTp_feiyong(BigDecimal tp_feiyong) {
		this.tp_feiyong = tp_feiyong;
	}
	public int getTp_renshu() {
		return tp_renshu;
	}
	public void setTp_renshu(int tp_renshu) {
		this.tp_renshu = tp_renshu;
	}
	public String getTp_start() {
		return tp_start;
	}
	public void setTp_start(String tp_start) {
		this.tp_start = tp_start;
	}
	public String getTp_end() {
		return tp_end;
	}
	public void setTp_end(String tp_end) {
		this.tp_end = tp_end;
	}
	public int getTp_qingkuang() {
		return tp_qingkuang;
	}
	public void setTp_qingkuang(int tp_qingkuang) {
		this.tp_qingkuang = tp_qingkuang;
	}
	public String getTp_pingjia() {
		return tp_pingjia;
	}
	public void setTp_pingjia(String tp_pingjia) {
		this.tp_pingjia = tp_pingjia;
	}
	public int getTp_yuliui() {
		return tp_yuliui;
	}
	public void setTp_yuliui(int tp_yuliui) {
		this.tp_yuliui = tp_yuliui;
	}
	public String getTp_yuliuis() {
		return tp_yuliuis;
	}
	public void setTp_yuliuis(String tp_yuliuis) {
		this.tp_yuliuis = tp_yuliuis;
	}
	
	public TrainingPlan() {
		super();
	}
	@Override
	public String toString() {
		return "TrainingPlan [tp_id=" + tp_id + ", tp_fanwei=" + tp_fanwei + ", tp_fangshi=" + tp_fangshi
				+ ", tp_feiyong=" + tp_feiyong + ", tp_renshu=" + tp_renshu + ", tp_start=" + tp_start + ", tp_end="
				+ tp_end + ", tp_qingkuang=" + tp_qingkuang + ", tp_pingjia=" + tp_pingjia + ", tp_yuliui=" + tp_yuliui
				+ ", tp_yuliuis=" + tp_yuliuis + "]";
	}

}
