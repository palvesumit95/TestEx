package starpattern;

public class PatternDouTran5 {

	public static void main(String[] args) {

		for (int i = 0; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}

			for (int k = 1; k == 1; k++) {
				System.out.print("*");
			}

			System.out.println();
		}

		for(int i=1 ; i<=4 ;i++)
		{
			for(int j=3 ; j>=i ;j--)
			{
				System.out.print(" ");
			}
			for(int k=1 ; k==1 ;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

		for (int i = 1; i <= 4; i++)

		{
			for (int j = 8; j >= i; j = j - 2) {
				System.out.print("*");

			}
			for (int k = 1; k == 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
