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
@Table(name="module")
public class Module {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int m_id;//权限ID
	@Column(nullable=false)
	private String m_name;//权限名称
	@Column(nullable=false)
	private int m_parenid;//权限父ID
	@Column(nullable=false)
	private String m_path;//路径
	@Column(nullable=true)
	private int m_yuliui;//预留字段1
	@Column(nullable=true)
	private String m_yuliuis;//预留字段2
	public int getM_id() {
		return m_id;
	}
	public void setM_id(int m_id) {
		this.m_id = m_id;
	}
	public String getM_name() {
		return m_name;
	}
	public void setM_name(String m_name) {
		this.m_name = m_name;
	}
	public int getM_parenid() {
		return m_parenid;
	}
	public void setM_parenid(int m_parenid) {
		this.m_parenid = m_parenid;
	}
	public String getM_path() {
		return m_path;
	}
	public void setM_path(String m_path) {
		this.m_path = m_path;
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
	
	public Module() {
		super();
	}
	@Override
	public String toString() {
		return "Module [m_id=" + m_id + ", m_name=" + m_name + ", m_parenid=" + m_parenid + ", m_path=" + m_path
				+ ", m_yuliui=" + m_yuliui + ", m_yuliuis=" + m_yuliuis + "]";
	}

}
