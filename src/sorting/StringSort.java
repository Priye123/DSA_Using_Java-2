package sorting;

import java.util.Scanner;

public class StringSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();//5

		String allSubstrings[] = new String[size];

		for (int i = 0; i < allSubstrings.length; i++) {
			allSubstrings[i] = sc.next();
		}

		sortStringArray(allSubstrings);
//		for (String e : allSubstrings) {
//			System.out.println(e);
//		}
		System.out.println(allSubstrings[0]+" "+allSubstrings[allSubstrings.length-1]);
	}

	private static void sortStringArray(String[] allSubstrings) {

		int n = allSubstrings.length;
		int count=1;

		for (int i = 0; i < n; i++) {
			for (int j = 1; j < (n - i); j++) {
				
				if (allSubstrings[j - 1].charAt(0) == allSubstrings[j].charAt(0)) {
					count=1;
				}
				
				if (allSubstrings[j - 1].charAt(count) > allSubstrings[j].charAt(count)) {
					// swap elements
					String temp = allSubstrings[j - 1];
					allSubstrings[j - 1] = allSubstrings[j];
					allSubstrings[j] = temp;
				}
			}
			count=0;
		}


	}

}
