package com.mypack.entity;

public class Student {
	int id;
	String name;
	String sex;
	String tel;
	String szgs;
	String bm;
	String zw;
	String bmsj;
	String sr;
	String qq;
	String vx;
	String email;
	String wb;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int id, String name, String sex, String tel, String szgs, String bm, String zw, String bmsj,
			String sr, String qq, String vx, String email, String wb) {
		super();
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.tel = tel;
		this.szgs = szgs;
		this.bm = bm;
		this.zw = zw;
		this.bmsj = bmsj;
		this.sr = sr;
		this.qq = qq;
		this.vx = vx;
		this.email = email;
		this.wb = wb;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getSzgs() {
		return szgs;
	}
	public void setSzgs(String szgs) {
		this.szgs = szgs;
	}
	public String getBm() {
		return bm;
	}
	public void setBm(String bm) {
		this.bm = bm;
	}
	public String getZw() {
		return zw;
	}
	public void setZw(String zw) {
		this.zw = zw;
	}
	public String getBmsj() {
		return bmsj;
	}
	public void setBmsj(String bmsj) {
		this.bmsj = bmsj;
	}
	public String getSr() {
		return sr;
	}
	public void setSr(String sr) {
		this.sr = sr;
	}
	public String getQq() {
		return qq;
	}
	public void setQq(String qq) {
		this.qq = qq;
	}
	public String getVx() {
		return vx;
	}
	public void setVx(String vx) {
		this.vx = vx;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getWb() {
		return wb;
	}
	public void setWb(String wb) {
		this.wb = wb;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", sex=" + sex + ", tel=" + tel + ", szgs=" + szgs + ", bm="
				+ bm + ", zw=" + zw + ", bmsj=" + bmsj + ", sr=" + sr + ", qq=" + qq + ", vx=" + vx + ", email=" + email
				+ ", wb=" + wb + "]";
	}
	
}
