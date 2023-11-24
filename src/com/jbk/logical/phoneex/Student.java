package com.jbk.logical.phoneex;

public class Student {

	int rno;
	String name;
	Phone phone;
	
	@Override
	public String toString() {
		return "Student [rno=" + rno + ", name=" + name + ", phone=" + phone + "]";
	}

	public int getRno() {
		return rno;
	}

	public void setRno(int rno) {
		this.rno = rno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Phone getPhone() {
		return phone;
	}

	public void setPhone(Phone phone) {
		this.phone = phone;
	}
	
	
	
}


