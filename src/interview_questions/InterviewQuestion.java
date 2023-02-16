package interview_questions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class InterviewQuestion {

	public static void main(String[] args) {
		// anagram();
		// intersectionOf2arrays();
		//longest_substring_without_repetition();
		// longest_substring_without_repetition1();
		number_of_occurences_of_single_character();
	}

	private static void number_of_occurences_of_single_character() {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		char ch=sc.next().charAt(0);
		int count=0;
		
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==ch) {
				count++;
			}
		}
		System.out.println(ch+" occurs "+count+" times");
	}

	private static void longest_substring_without_repetition1() {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();

		HashSet<Character> set = new HashSet<>();
		String longestOverall = "", longestTillNow = "";

		for (int i = 0; i < s.length(); i++) {

			char ch = s.charAt(i);
			if (set.contains(ch)) {
				longestTillNow = "";
				set.clear();
			}

			set.add(ch);
			longestTillNow = longestTillNow + ch;

			if (longestOverall.length() < longestTillNow.length()) {
				longestOverall = longestTillNow;
			}

		}

		System.out.println(longestOverall);
	}

	private static void longest_substring_without_repetition() {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		HashSet<Character> set = new LinkedHashSet<>();
		String longestOverall = "", longestTillNow = "";

		for (int i = 0; i < s.length(); i++) {

			for (int j = i; j < s.length(); j++) {

				char ch = s.charAt(j);
				if (set.contains(ch)) {
					set.clear();
					break;
				}

				set.add(ch);
				longestTillNow = longestTillNow + ch;
			}
			
			//System.out.println(longestTillNow);
			if (longestOverall.length() < longestTillNow.length()) {
				longestOverall = longestTillNow;
			}
			longestTillNow = "";
		}

		System.out.println(longestOverall);
	}

	private static void intersectionOf2arrays() {
		Scanner sc = new Scanner(System.in);

		int n1 = sc.nextInt();
		int a1[] = new int[n1];
		for (int i = 0; i < n1; i++)
			a1[i] = sc.nextInt();

		int n2 = sc.nextInt();
		int a2[] = new int[n2];
		for (int i = 0; i < n2; i++)
			a2[i] = sc.nextInt();

		ArrayList<Integer> l = new ArrayList<>();

		for (int i = 0; i < n1; i++) {

			for (int j = 0; j < n2; j++) {

				if (a1[i] == a2[j]) {
					l.add(a1[i]);
				}
			}
		}

		System.out.println(l);
	}

	private static void anagram() {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int c[] = new int[26];
		int count = 0;

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (Character.isLetter(ch)) {
				if (Character.isUpperCase(ch)) {
					ch = (char) (ch + 32);
					System.out.println(ch);
				}
				count = ch - 'a';
				c[count] = c[count] + 1;
			}
		}

		for (int i = 0; i < 26; i++) {
			if (c[i] == 0) {
				System.out.println("Not Anagram");
				return;
			}
		}
		System.out.println("Anagram");
	}

}
