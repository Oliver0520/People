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
@Table(name="employeerole")
public class EmployeeRole {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int er_id;	//编号
	@Column(nullable=false)
	private int u_serinfoid;//	用户ID
	@Column(nullable=false)
	private int r_id;	//	角色ID
	@Column(nullable=true)
	private int er_yuliui;//	预留字段1
	@Column(nullable=true)
	private String er_yuliuis;//	预留字段2
	public int getEr_id() {
		return er_id;
	}
	public void setEr_id(int er_id) {
		this.er_id = er_id;
	}
	public int getU_serinfoid() {
		return u_serinfoid;
	}
	public void setU_serinfoid(int u_serinfoid) {
		this.u_serinfoid = u_serinfoid;
	}
	public int getR_id() {
		return r_id;
	}
	public void setR_id(int r_id) {
		this.r_id = r_id;
	}
	public int getEr_yuliui() {
		return er_yuliui;
	}
	public void setEr_yuliui(int er_yuliui) {
		this.er_yuliui = er_yuliui;
	}
	public String getEr_yuliuis() {
		return er_yuliuis;
	}
	public void setEr_yuliuis(String er_yuliuis) {
		this.er_yuliuis = er_yuliuis;
	}
	
	
	
	public EmployeeRole() {
		super();
	}
	@Override
	public String toString() {
		return "EmployeeRole [er_id=" + er_id + ", u_serinfoid=" + u_serinfoid + ", r_id=" + r_id + ", er_yuliui="
				+ er_yuliui + ", er_yuliuis=" + er_yuliuis + "]";
	}
	
	


}
