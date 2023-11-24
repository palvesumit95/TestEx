package com.jbk.logical.phoneex;

public class Phone {

	long phoneNumber;
	int price;

	Phone() {

	}

	public Phone(long phoneNumber, int price) {
		super();
		this.phoneNumber = phoneNumber;
		this.price = price;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Phone [phoneNumber=" + phoneNumber + ", price=" + price + "]";
	}

}
