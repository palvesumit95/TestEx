package logical;

import java.util.Arrays;

public class StringRepeat {

	public static void main(String[] args) {

		String s = ("Java Is Very Very Easy ");
		String[] strings = s.split(" ");
		System.out.println(Arrays.toString(strings));

		int count = 0;

		for (int i = 0; i< strings.length; i++) {

			if (strings[i].equals("Very")) {
				count = count + 1;
			}
		}
		System.out.println("Very Is Occured" + " = "+ count + " " + "Times");
	}

}
