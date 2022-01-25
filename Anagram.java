package week1.day2;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		String text1 = "stops";
		String text2 = "potss";
		text1 = text1.toLowerCase();
		text2 = text2.toLowerCase();

		if (text1.length() == text2.length()) {
			char[] arry1 = text1.toCharArray();
			char[] arry2 = text2.toCharArray();

			Arrays.sort(arry1);
			Arrays.sort(arry2);

			if (Arrays.equals(arry1, arry2)) {
				System.out.println(text1 + " and " + text2 + " are Anagram");
			} else {
				System.out.println(text1 + " and " + text2 + "are not Anagram");
			}
		} else
			System.out.println(text1 + " and " + text2 + " are not Anagram");

	}

}
