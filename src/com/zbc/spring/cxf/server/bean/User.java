package com.zbc.spring.cxf.server.bean;

public class User {

	private String name;
	
	private String sex;
	
	private String age;
	
	private String remark;
	
	public User() {}
	
	public User(String name) {
		super();
		this.name = name;
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

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", sex=" + sex + ", age=" + age + ", remark=" + remark + "]";
	}
	
}
