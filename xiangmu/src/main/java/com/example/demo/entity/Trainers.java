package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="trainers")
public class Trainers {//被培训人员表
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ts_id;//编号
	 @ManyToOne	  
	 @JoinColumn(nullable=false,name="tp_id",referencedColumnName = "tp_id")
	private TrainingPlan trainingplan;//多对一的培训计划编号
	@Column(nullable=false)
	private int Ts_zhuangtai;//（考核中，考核失败（定时清除失败的，并发送通知），考核通过，等待开始，培训中，培训结束）
	 @ManyToOne	  
	 @JoinColumn(nullable=false,name="e_id",referencedColumnName = "e_id")
	private Employee employee;//人员编号
	@Column(nullable=false)
	private String ts_qingkuang;//考核情况
	@Column(nullable=true)
	private Integer ts_yuliui;//预留字段x
	@Column(nullable=true)
	private String ts_yuliuis;//预留字段y
	public int getTs_id() {
		return ts_id;
	}
	public void setTs_id(int ts_id) {
		this.ts_id = ts_id;
	}

	public int getTs_zhuangtai() {
		return Ts_zhuangtai;
	}
	public void setTs_zhuangtai(int ts_zhuangtai) {
		Ts_zhuangtai = ts_zhuangtai;
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
	
	public TrainingPlan getTrainingplan() {
		return trainingplan;
	}
	public void setTrainingplan(TrainingPlan trainingplan) {
		this.trainingplan = trainingplan;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public Trainers() {
		super();
	}
	@Override
	public String toString() {
		return "Trainers [ts_id=" + ts_id + ", trainingplan=" + trainingplan + ", Ts_zhuangtai=" + Ts_zhuangtai
				+ ", employee=" + employee + ", ts_qingkuang=" + ts_qingkuang + ", ts_yuliui=" + ts_yuliui
				+ ", ts_yuliuis=" + ts_yuliuis + "]";
	}


}
