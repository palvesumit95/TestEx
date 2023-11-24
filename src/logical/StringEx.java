package logical;

// Program to print string in reverse order , print only odd positioned char


public class StringEx {

	public static void main(String[] args) {
		
		String s = "JAVA";

		char[] a = s.toCharArray();
		
		// ch [j] [a] [v] [a]
        //     0   1   2   3
		
		for (int index = a.length - 1; index >= 0; index--) {

			//if (index % 2 != 0)

				System.out.println(a[index]);
		}

	}

}
