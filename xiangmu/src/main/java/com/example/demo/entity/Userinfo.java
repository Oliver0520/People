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
@Table(name="userinfo")
public class Userinfo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int u_serinfoid;//用户表id
	@Column(nullable=false)
	private int e_id;//	用户id
	@Column(nullable=false)
	private String u_sername;//登陆名
	@Column(nullable=false)
	private String u_password;//密码
	@Column(nullable=false)
	private int u_state;//用户状态
	@Column(nullable=true)
	private int u_errornum;//密码错误次数
	@Column(nullable=true)
	private int u_yuliui;//	int	T	预留字段x
	@Column(nullable=true)
	private String u_yuliuis;//	varchar	T	预留字段y
	public int getU_serinfoid() {
		return u_serinfoid;
	}
	public void setU_serinfoid(int u_serinfoid) {
		this.u_serinfoid = u_serinfoid;
	}
	public int getE_id() {
		return e_id;
	}
	public void setE_id(int e_id) {
		this.e_id = e_id;
	}
	public String getU_sername() {
		return u_sername;
	}
	public void setU_sername(String u_sername) {
		this.u_sername = u_sername;
	}
	public String getU_password() {
		return u_password;
	}
	public void setU_password(String u_password) {
		this.u_password = u_password;
	}
	public int getU_state() {
		return u_state;
	}
	public void setU_state(int u_state) {
		this.u_state = u_state;
	}
	public int getU_errornum() {
		return u_errornum;
	}
	public void setU_errornum(int u_errornum) {
		this.u_errornum = u_errornum;
	}
	
	public int getU_yuliui() {
		return u_yuliui;
	}
	public void setU_yuliui(int u_yuliui) {
		this.u_yuliui = u_yuliui;
	}
	public String getU_yuliuis() {
		return u_yuliuis;
	}
	public void setU_yuliuis(String u_yuliuis) {
		this.u_yuliuis = u_yuliuis;
	}
	public Userinfo() {
		super();
	}
	@Override
	public String toString() {
		return "Userinfo [u_serinfoid=" + u_serinfoid + ", e_id=" + e_id + ", u_sername=" + u_sername + ", u_password="
				+ u_password + ", u_state=" + u_state + ", u_errornum=" + u_errornum + ", u_yuliui=" + u_yuliui
				+ ", u_yuliuis=" + u_yuliuis + "]";
	}

	
	
	
	

}
