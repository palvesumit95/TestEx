package logical;

import java.util.Scanner;

public class AdditionScannerEx {

	int c;
	
	int add(int a, int b) {
		return c = a + b;
	}

	int sub(int a, int b) {
		return c = b - a;
	}

	int mul(int a, int b) {
		return c = a * b;
	}

	int div(int a, int b) {
		return c = a * b;
	}

	public static void main(String[] args) {

		AdditionScannerEx addition = new AdditionScannerEx();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Value Of a:- ");
		int avalue = scanner.nextInt();
		System.out.println("Enter Value Of b:- ");
		int bvalue = scanner.nextInt();

		int total = addition.add(avalue, bvalue);
		System.out.println("Total Add =" + " " + total);

		int sub = addition.sub(avalue, bvalue);
		System.out.println("Total Sub =" + " " + sub);

		int mul = addition.mul(avalue, bvalue);
		System.out.println("Total mul =" + " " + mul);

		int div = addition.div(avalue, bvalue);
		System.out.println("Total div =" + " " + div);

	}

}
