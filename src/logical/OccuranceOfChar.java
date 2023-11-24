package logical;

import java.util.Arrays;

public class OccuranceOfChar {

	public static void main(String[] args) {

		String st = "india is good";
		char[] ch = st.toCharArray();
		System.out.println(Arrays.toString(ch));

		for (int i = 0; i < ch.length; i++) {
			int count = 1;

			for (int j = i + 1; j < ch.length; j++) {

				if (ch[i] == ch[j])
					count = count + 1;

			}
			if (ch[i] != ' ') {
				System.out.println(ch[i] + " " + "Occours" + " " + count + " " + "times");
			}
		}
	}
}