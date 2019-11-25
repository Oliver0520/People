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
@Table(name="position")
public class Position {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int	p_id;//职位ID
	@Column(nullable=false)
	private String p_name;//	职位名称
	@Column(nullable=false)
	private int p_parentid;//职位父ID
	@Column(nullable=true)
	private int p_yuliui;//预留字段1
	@Column(nullable=true)
	private String p_yuliuis;//预留字段2
	public int getP_id() {
		return p_id;
	}
	public void setP_id(int p_id) {
		this.p_id = p_id;
	}
	public String getP_name() {
		return p_name;
	}
	public void setP_name(String p_name) {
		this.p_name = p_name;
	}
	public int getP_parentid() {
		return p_parentid;
	}
	public void setP_parentid(int p_parentid) {
		this.p_parentid = p_parentid;
	}
	public int getP_yuliui() {
		return p_yuliui;
	}
	public void setP_yuliui(int p_yuliui) {
		this.p_yuliui = p_yuliui;
	}
	public String getP_yuliuis() {
		return p_yuliuis;
	}
	public void setP_yuliuis(String p_yuliuis) {
		this.p_yuliuis = p_yuliuis;
	}
	
	public Position() {
		super();
	}
	@Override
	public String toString() {
		return "Position [p_id=" + p_id + ", p_name=" + p_name + ", p_parentid=" + p_parentid + ", p_yuliui=" + p_yuliui
				+ ", p_yuliuis=" + p_yuliuis + "]";
	}

}
