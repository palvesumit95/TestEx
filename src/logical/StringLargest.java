package logical;

import java.util.Arrays;

public class StringLargest {

	public static void main(String[] args) {

		String s = ("India Is Great");
		String[] words = s.split(" ");
		System.out.println(Arrays.toString(words));
		String maxString = null;
		int max = 0;

		for (String word : words) {
			// word=great
			boolean isReapted = false;

			for (int i = 0; i < word.length(); i++) {
				char ch = word.charAt(i);

				int firstIndex = word.indexOf(ch);
				int lastIndex = word.lastIndexOf(ch);

				if (firstIndex != lastIndex) {
					isReapted = true;
					break;
				}

			}
			// india is great country
			if (!isReapted) {
				int length = word.length();// 7

				if (length > max) {
					max = length;// 7
					maxString = word;// country
				}
			}

		} // for loop

		System.out.println(maxString + " is largest string having length " + max);

	}// main

}
