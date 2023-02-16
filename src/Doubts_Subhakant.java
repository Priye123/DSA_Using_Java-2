import java.util.Scanner;

public class Doubts_Subhakant {

	// Write a program to find the number of vowels, consonents, digits
	// and white space characters in a string.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String w = "";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
				for (int j = 0; j < s.charAt(i) - '0'; j++) {
					w += s.charAt(i - 1);
				}
			}
		}
		System.out.println(w);
	}

}
