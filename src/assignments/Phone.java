package assignments;

public class Phone {

	long phoneNumber;
	int price;
	
	Phone()
	{
		
	}
	
	public Phone(long phoneNumber, int price) {
		super();
		this.phoneNumber = phoneNumber;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Phone [phoneNumber=" + phoneNumber + ", price=" + price + "]";
	}
	
	
	
}



