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
@Table(name="mechanism")
public class Mechanism {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer	m_id;//机构ID
	@Column(nullable=false)
	private String m_name;//机构名称
	@Column(nullable=false)
	private Integer m_parentid;//机构父ID
	@Column(nullable=true)
	private Integer m_yuliui;//预留字段1
	@Column(nullable=true)
	private String m_yulius;//预留字段2
	public Integer getM_id() {
		return m_id;
	}
	public void setM_id(Integer m_id) {
		this.m_id = m_id;
	}
	public String getM_name() {
		return m_name;
	}
	public void setM_name(String m_name) {
		this.m_name = m_name;
	}
	public Integer getM_parentid() {
		return m_parentid;
	}
	public void setM_parentid(Integer m_parentid) {
		this.m_parentid = m_parentid;
	}
	public Integer getM_yuliui() {
		return m_yuliui;
	}
	public void setM_yuliui(Integer m_yuliui) {
		this.m_yuliui = m_yuliui;
	}
	public String getM_yulius() {
		return m_yulius;
	}
	public void setM_yulius(String m_yulius) {
		this.m_yulius = m_yulius;
	}
	@Override
	public String toString() {
		return "Mechanism [m_id=" + m_id + ", m_name=" + m_name + ", m_parentid=" + m_parentid + ", m_yuliui="
				+ m_yuliui + ", m_yulius=" + m_yulius + "]";
	}
	

}
