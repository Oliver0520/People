package com.example.demo.entity;

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
@Table(name="employee")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int e_id;//员工编号
	@Column(nullable=false)
	private String	e_name;	 //varchar(255)姓名
	@Column(nullable=false)
	private int	e_sex;	     //Int	性别
	@Column(nullable=false)
	private int e_age;	//Int	年龄
	@Column(nullable=false)
	private String e_email;	//varchar(255)	Email
	@Column(nullable=false)
	private String e_phone;	//varchar(255)	电话号
	@Column(nullable=false)
	private String e_qq;	//varchar(255)	QQ号
	@Column(nullable=false)
	private String	e_number;	//varchar(255)	手机号
	@Column(nullable=false)
	private String	e_adderss;	//varchar(255)	地址
	@Column(nullable=false)
	private String	e_youbian;	//varchar(255)	邮编

	@Column(nullable=false)
	private int py_id;	//	薪酬标准
	@Column(nullable=false)
	private int e_adminer;	//Int	登记人(当前登陆人id)
	@Column(nullable=false)
	private String	e_nationality;	//varchar(255)	国籍
	@Column(nullable=false)
	private String	e_birthaddress;	//varchar(255)	出生地
	@Column(nullable=false)
	@DateTimeFormat(pattern ="yyyy-MM-dd" )
	private String e_birthday;	//Datetime	生日
	@Column(nullable=false)
	private String e_nation;	//varchar(255)	民族
	@Column(nullable=false)
	private String e_religion;	//varchar(255)	宗教信仰
	@Column(nullable=false)
	private String e_mianmao;	//varchar(255)	政治面貌
	@Column(nullable=false)
	private String e_shenfenid;	//varchar(255)	身份证号

	@Column(nullable=false)
	private String e_shebaophone;	//varchar(255)	社会保障号码

	@Column(nullable=false)
	private String e_education;	//varchar(255)	学历
	@Column(nullable=false)
	private int e_educationyear;	//int	教育年限
	@Column(nullable=false)
	private String e_educationmajor;	//varchar(255)	学历专业

	@Column(nullable=false)
	private String e_bank;	//varchar(255)	开户行
	@Column(nullable=false)
	private String e_banknumber;	//varchar(255)	银行卡号
	@Column(nullable=false)
	@DateTimeFormat(pattern ="yyyy-MM-dd" )
	private String e_admintime;	//Datetime	登记时间
	@Column(nullable=false)
	private String e_speciality;	//varchar(255)	特长
	@Column(nullable=false)
	private String e_hobby;	//varchar(255)	爱好
	@Column(nullable=false)
	private String e_photo;	//Images照片
	@Column(nullable=false)
	private int m_id;	//Int	机构
	@Column(nullable=false)
	private int p_id;	//Int	职称
	@Column(nullable=false)
	private String e_gerenluli;	//text个人履历
	@Column(nullable=false)
	private String e_family;	//text家庭关系
	@Column(nullable=false)
	private String e_beizhu;	//text备注
	@Column(nullable=false)
	private int e_state;	//int员工状态
    @Column(nullable=true)
	private int e_yuliui;	//Int预留字段1
    @Column(nullable=true)
	private String e_yuliuis;	//varchar(255)预留字段2
	public int getE_id() {
		return e_id;
	}
	public void setE_id(int e_id) {
		this.e_id = e_id;
	}
	public String getE_name() {
		return e_name;
	}
	public void setE_name(String e_name) {
		this.e_name = e_name;
	}
	public int getE_sex() {
		return e_sex;
	}
	public void setE_sex(int e_sex) {
		this.e_sex = e_sex;
	}

	public String getE_email() {
		return e_email;
	}
	public void setE_email(String e_email) {
		this.e_email = e_email;
	}
	public String getE_phone() {
		return e_phone;
	}
	public void setE_phone(String e_phone) {
		this.e_phone = e_phone;
	}
	public String getE_qq() {
		return e_qq;
	}
	public void setE_qq(String e_qq) {
		this.e_qq = e_qq;
	}
	public String getE_number() {
		return e_number;
	}
	public void setE_number(String e_number) {
		this.e_number = e_number;
	}
	public String getE_adderss() {
		return e_adderss;
	}
	public void setE_adderss(String e_adderss) {
		this.e_adderss = e_adderss;
	}
	public String getE_youbian() {
		return e_youbian;
	}
	public void setE_youbian(String e_youbian) {
		this.e_youbian = e_youbian;
	}
	public String getE_nationality() {
		return e_nationality;
	}
	public void setE_nationality(String e_nationality) {
		this.e_nationality = e_nationality;
	}
	public String getE_birthaddress() {
		return e_birthaddress;
	}
	public void setE_birthaddress(String e_birthaddress) {
		this.e_birthaddress = e_birthaddress;
	}
	public String getE_birthday() {
		return e_birthday;
	}
	public void setE_birthday(String e_birthday) {
		this.e_birthday = e_birthday;
	}
	public String getE_nation() {
		return e_nation;
	}
	public void setE_nation(String e_nation) {
		this.e_nation = e_nation;
	}
	public String getE_religion() {
		return e_religion;
	}
	public void setE_religion(String e_religion) {
		this.e_religion = e_religion;
	}
	public String getE_mianmao() {
		return e_mianmao;
	}
	public void setE_mianmao(String e_mianmao) {
		this.e_mianmao = e_mianmao;
	}
	public String getE_shenfenid() {
		return e_shenfenid;
	}
	public void setE_shenfenid(String e_shenfenid) {
		this.e_shenfenid = e_shenfenid;
	}
	public String getE_shebaophone() {
		return e_shebaophone;
	}
	public void setE_shebaophone(String e_shebaophone) {
		this.e_shebaophone = e_shebaophone;
	}
	public int getE_age() {
		return e_age;
	}
	public void setE_age(int e_age) {
		this.e_age = e_age;
	}
	public String getE_education() {
		return e_education;
	}
	public void setE_education(String e_education) {
		this.e_education = e_education;
	}
	public int getE_educationyear() {
		return e_educationyear;
	}
	public void setE_educationyear(int e_educationyear) {
		this.e_educationyear = e_educationyear;
	}
	public String getE_educationmajor() {
		return e_educationmajor;
	}
	public void setE_educationmajor(String e_educationmajor) {
		this.e_educationmajor = e_educationmajor;
	}
	public int getPy_id() {
		return py_id;
	}
	public void setPy_id(int py_id) {
		this.py_id = py_id;
	}
	public String getE_bank() {
		return e_bank;
	}
	public void setE_bank(String e_bank) {
		this.e_bank = e_bank;
	}
	public String getE_banknumber() {
		return e_banknumber;
	}
	public void setE_banknumber(String e_banknumber) {
		this.e_banknumber = e_banknumber;
	}
	public int getE_adminer() {
		return e_adminer;
	}
	public void setE_adminer(int e_adminer) {
		this.e_adminer = e_adminer;
	}
	public String getE_admintime() {
		return e_admintime;
	}
	public void setE_admintime(String e_admintime) {
		this.e_admintime = e_admintime;
	}
	public String getE_speciality() {
		return e_speciality;
	}
	public void setE_speciality(String e_speciality) {
		this.e_speciality = e_speciality;
	}
	public String getE_hobby() {
		return e_hobby;
	}
	public void setE_hobby(String e_hobby) {
		this.e_hobby = e_hobby;
	}
	public String getE_photo() {
		return e_photo;
	}
	public void setE_photo(String e_photo) {
		this.e_photo = e_photo;
	}
	public int getM_id() {
		return m_id;
	}
	public void setM_id(int m_id) {
		this.m_id = m_id;
	}
	public int getP_id() {
		return p_id;
	}
	public void setP_id(int p_id) {
		this.p_id = p_id;
	}
	public String getE_gerenluli() {
		return e_gerenluli;
	}
	public void setE_gerenluli(String e_gerenluli) {
		this.e_gerenluli = e_gerenluli;
	}
	public String getE_family() {
		return e_family;
	}
	public void setE_family(String e_family) {
		this.e_family = e_family;
	}
	public String getE_beizhu() {
		return e_beizhu;
	}
	public void setE_beizhu(String e_beizhu) {
		this.e_beizhu = e_beizhu;
	}
	public int getE_state() {
		return e_state;
	}
	public void setE_state(int e_state) {
		this.e_state = e_state;
	}
	public int getE_yuliui() {
		return e_yuliui;
	}
	public void setE_yuliui(int e_yuliui) {
		this.e_yuliui = e_yuliui;
	}
	public String getE_yuliuis() {
		return e_yuliuis;
	}
	public void setE_yuliuis(String e_yuliuis) {
		this.e_yuliuis = e_yuliuis;
	}
	@Override
	public String toString() {
		return "employee [e_id=" + e_id + ", e_name=" + e_name + ", e_sex=" + e_sex + ", e_Email=" + e_email
				+ ", e_phone=" + e_phone + ", e_qq=" + e_qq + ", e_number=" + e_number + ", e_adderss=" + e_adderss
				+ ", e_youbian=" + e_youbian + ", e_nationality=" + e_nationality + ", e_birthaddress=" + e_birthaddress
				+ ", e_birthday=" + e_birthday + ", e_nation=" + e_nation + ", e_religion=" + e_religion
				+ ", e_mianmao=" + e_mianmao + ", e_shenfenid=" + e_shenfenid + ", e_shebaophone=" + e_shebaophone
				+ ", e_age=" + e_age + ", e_education=" + e_education + ", e_educationyear=" + e_educationyear
				+ ", e_educationmajor=" + e_educationmajor + ", py_id=" + py_id + ", e_bank=" + e_bank
				+ ", e_banknumber=" + e_banknumber + ", e_adminer=" + e_adminer + ", e_admintime=" + e_admintime
				+ ", e_speciality=" + e_speciality + ", e_hobby=" + e_hobby + ", e_photo=" + e_photo + ", m_id=" + m_id
				+ ", p_id=" + p_id + ", e_gerenluli=" + e_gerenluli + ", e_family=" + e_family + ", e_beizhu="
				+ e_beizhu + ", e_state=" + e_state + ", e_yuliui=" + e_yuliui + ", e_yuliuis=" + e_yuliuis + "]";
	}

	
	

}
