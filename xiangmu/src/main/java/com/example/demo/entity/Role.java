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
@Table(name="role")
public class Role {//角色表
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int	r_id;//角色ID
	@Column(nullable=false)
private String r_name;//角色名称
@Column(nullable=true)
private int	r_yuliui;//	预留字段1
@Column(nullable=true)
private String 	r_yuliuis;//预留字段2
public int getR_id() {
	return r_id;
}
public void setR_id(int r_id) {
	this.r_id = r_id;
}
public String getR_name() {
	return r_name;
}
public void setR_name(String r_name) {
	this.r_name = r_name;
}
public int getR_yuliui() {
	return r_yuliui;
}
public void setR_yuliui(int r_yuliui) {
	this.r_yuliui = r_yuliui;
}
public String getR_yuliuis() {
	return r_yuliuis;
}
public void setR_yuliuis(String r_yuliuis) {
	this.r_yuliuis = r_yuliuis;
}


public Role(int r_id, String r_name, int r_yuliui, String r_yuliuis) {
	super();
	this.r_id = r_id;
	this.r_name = r_name;
	this.r_yuliui = r_yuliui;
	this.r_yuliuis = r_yuliuis;
}

public Role() {
	super();
}
@Override
public String toString() {
	return "Role [r_id=" + r_id + ", r_name=" + r_name + ", r_yuliui=" + r_yuliui + ", r_yuliuis=" + r_yuliuis + "]";
}




}
