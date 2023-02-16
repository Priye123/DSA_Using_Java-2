package coding_problems;

import java.util.Arrays;
import java.util.Scanner;

public class Codes2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();

		if (s1.length() != s2.length()) {
			System.out.println("Not Anagram");
			return;
		}

		char c1[] = s1.toCharArray();
		char c2[] = s2.toCharArray();

		Arrays.sort(c1);
		Arrays.sort(c2);

		for (int i = 0; i < c1.length; i++) {
			if (c1[i] != c2[i]) {
				System.out.println("Not Anagram");
				return;
			}
		}
		System.out.println("Anagram");
	}

//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		String s1=sc.next();
//		String s2=sc.next();
//		
//		
//		if(s1.length()!=s2.length()) {
//			System.out.println("Not Anagram");
//			return;
//		}
//		
//		StringBuilder sb1=new StringBuilder(s1);
//		StringBuilder sb2=new StringBuilder(s2);
//		
//		for(int i=0;i<sb1.length();i++) {
//			
//			char ch=sb1.charAt(i);
//			
//			for(int j=0;j<sb2.length();j++) {
//				
//				if(ch==sb2.charAt(j)) {
//					sb2.setCharAt(j, '0');
//					break;
//				}
//			}
//		}
//		
//		for(int i=0;i<sb2.length();i++) {
//			if(sb2.charAt(i)!='0') {
//				System.out.println("Not Anagarm");
//				return;
//			}
//		}
//		
//		System.out.println("Anagram");
//
//	}

}
