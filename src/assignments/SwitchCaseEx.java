package assignments;

import java.util.Scanner;

public class SwitchCaseEx {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		while (true) {

			System.out.println("1:- Square 2:- Cube 3:- Exit");
			System.out.println("Enter Your Choice:-");
			int choice = scanner.nextInt();

			double no = 0, ans = 0;

			switch (choice) {

			case 1:
				System.out.println("Enter Value :-");
				no = scanner.nextInt();
				ans = no * no;
				System.out.println("Square is = " + ans);
				break;

			case 2:
				System.out.println("Enter Value :-");
				no = scanner.nextInt();
				ans = Math.pow(no, 3);
				System.out.println("Cube is = " + ans);
				break;

			case 3:
				System.exit(0);

			}

		}

	}

}
