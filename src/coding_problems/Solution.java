package coding_problems;

import java.util.Scanner;

public class Solution {

	static boolean isAnagram(String a, String b) {
		a = a.toUpperCase();
		b = b.toUpperCase();

		char c1[] = a.toCharArray();
		char c2[] = b.toCharArray();

		for (int i = 0; i < c1.length - 1; i++) {
			for (int j = i + 1; j < c1.length; j++) {
				if (c1[i] - c1[j] > 0) {
					char temp = c1[i];
					c1[i] = c1[j];
					c1[j] = temp;
				}
			}
		}
		System.out.println(c1);

		for (int i = 0; i < c2.length - 1; i++) {
			for (int j = i + 1; j < c2.length; j++) {
				if (c2[i] - c2[j] > 0) {
					char temp = c2[i];
					c2[i] = c2[j];
					c2[j] = temp;
				}
			}
		}

		System.out.println(c2);

		for (int i = 0; i < c1.length; i++) {
			if (c1[i] != c2[i])
				return false;
		}
		return true;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		// String b = scan.next();
		scan.close();
		// boolean ret = isAnagram(a, b);
		// System.out.println((ret) ? "Anagrams" : "Not Anagrams");
//		if (a.charAt(0) != '\'') {
//			System.out.println(a.charAt(0));
//			if (ch != ' ' && ch != '!' && ch != ',' && ch != '?' && ch != '.' && ch != '_' && ch != '\'' && ch != '@') {
//
//			}
//
//			if (ch == ' ' || ch == '!' || ch == ',' || ch != '?' || ch == '.' || ch == '_' || ch == '\'' || ch == '@') {
//				count++;
//			}
//		}
	}
}
