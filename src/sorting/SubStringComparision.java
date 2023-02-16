package sorting;

import java.util.Scanner;

public class SubStringComparision {

	public static String getSmallestAndLargest(String s, int k) {

		String allSubstrings[] = new String[s.length() - k + 1];

		for (int i = 0; i <= s.length() - k; i++) {
			allSubstrings[i] = s.substring(i, k + i);
		}

		System.out.println("Before Sorting---------------------");
		for (String d : allSubstrings) {
			System.out.println(d);
		}
		sortStringArray(allSubstrings);

		System.out.println("After Sorting---------------------");
		for (String d : allSubstrings) {
			System.out.println(d);
		}
		String smallest = allSubstrings[0];
		String largest = allSubstrings[allSubstrings.length - 1];
		return smallest + "\n" + largest;

	}

	private static void sortStringArray(String[] allSubstrings) {

		int n = allSubstrings.length;
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < (n - i); j++) {

//				while(allSubstrings[j-1].charAt(count)==allSubstrings[j].charAt(count)) {
//					count++;
//				}
				// compareTo() when we want to sort two Strings
				if (allSubstrings[j - 1].compareTo(allSubstrings[j]) > 0) {
					// swap elements
					String temp = allSubstrings[j - 1];
					allSubstrings[j - 1] = allSubstrings[j];
					allSubstrings[j] = temp;
				}
			}
		}

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		int k = scan.nextInt();

		System.out.println("Max and Min Strings are::" + getSmallestAndLargest(s, k));
		scan.close();
	}
}
