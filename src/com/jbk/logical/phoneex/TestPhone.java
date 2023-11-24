package com.jbk.logical.phoneex;

public class TestPhone {


	public static void main(String[] args) {
		
		
		Student student = new Student();
		System.out.println(student);
		
		student.setRno(1);
		
		student.setName("Ramesh");
		
		Phone phone=new Phone();
		phone.setPhoneNumber(989898989898L);
		phone.setPrice(30000);
		
		student.setPhone(phone);
		
		//student.setPhone(new Phone(12,3000));
		
		System.out.println(student);

		

	}
}
