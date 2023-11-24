package logical;

public class Series {

	public static void main(String[] args) {

		// Q:- 1 2 3 4 5 8 7 16 9 32 11 64
		
		int no1 = 1;
		int no2 = 2;

		System.out.print(no1 + " " + no2 + " ");

		for (int i = 1; i <= 10; i++) {
			if (i % 2 != 0) {
				no1 = no1 + 2;
				System.out.print(no1 + " ");
			} else {
				no2 = no2 * 2;
				System.out.print(no2 + " ");
			}
		}

	}

}
