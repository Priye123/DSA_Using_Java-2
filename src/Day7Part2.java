import java.util.Scanner;

public class Day7Part2 {

	public static void main(String[] args) {
		// Print All Substrings for a String
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j <= s.length(); j++) {
				String ss = s.substring(i, j);
				if(Palindrome(ss)==true) {
					System.out.println(ss);
				}
				//count++;
			}
		}
		//System.out.println(count);
		// WAP to print to check whether string is palindrome
		// two-pointer approach

	}

	public static boolean Palindrome(String s) {
		int i = 0, j = s.length() - 1;

		while (i <= j) {
			char ch1 = s.charAt(i);
			char ch2 = s.charAt(j);

			if (ch1 != ch2) {
				return false;
			} else {
				i++;
				j--;
			}
		}
		return true;

	}
}
