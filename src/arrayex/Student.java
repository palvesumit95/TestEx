package arrayex;

import java.util.Arrays;

public class Student {
	
	int rno;
	String name;
	Phone[] phones;
	
	
	@Override
	public String toString() {
		return "Student [rno=" + rno + ", name=" + name + ", phones=" + Arrays.toString(phones) + "]";
	}
	
	
	
}


