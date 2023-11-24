package logical;

public class SeriesAltRev {

	public static void main(String[] args) {

		int no1 = 64;
		int no2 = 11;

		for (int i = 64; i >= 1; i--) {

			if (i % 2 != 1) {
				no1 = no1 / 2;
				System.err.println(no1);
			} else
				no2 = (no2 - 2);
			System.out.println(no2);
		}

	}
}
