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
@Table(name="rolemodule")
public class Rolemodule {//角色权限表
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int rm_id;//	编号
	@Column(nullable=false)
	private int r_id;//角色ID
	@Column(nullable=false)
	private int m_id;//权限ID
	@Column(nullable=true)
	private int m_yuliui;//预留字段1
	@Column(nullable=true)
	private String m_yuliuis;//预留字段2
	public int getRm_id() {
		return rm_id;
	}
	public void setRm_id(int rm_id) {
		this.rm_id = rm_id;
	}
	public int getR_id() {
		return r_id;
	}
	public void setR_id(int r_id) {
		this.r_id = r_id;
	}
	public int getM_id() {
		return m_id;
	}
	public void setM_id(int m_id) {
		this.m_id = m_id;
	}
	public int getM_yuliui() {
		return m_yuliui;
	}
	public void setM_yuliui(int m_yuliui) {
		this.m_yuliui = m_yuliui;
	}
	public String getM_yuliuis() {
		return m_yuliuis;
	}
	public void setM_yuliuis(String m_yuliuis) {
		this.m_yuliuis = m_yuliuis;
	}
	
	public Rolemodule() {
		super();
	}
	@Override
	public String toString() {
		return "Rolemodule [rm_id=" + rm_id + ", r_id=" + r_id + ", m_id=" + m_id + ", m_yuliui=" + m_yuliui
				+ ", m_yuliuis=" + m_yuliuis + "]";
	}
	
	
	

}
