import java.io.*;
import java.util.*;

public class Day8Part1 {

//	public static String compression1(String str) {//aabbcdd
//		//String s=str.charAt(0)+"";
//		String s=str.substring(0, 1);//a
//		
//		for(int i=1;i<str.length();i++) {
//			// two-pointer approach
//			char curr=str.charAt(i);
//			char prev=str.charAt(i-1);
//			
//			if(curr!=prev) {
//				s=s+curr;
//			}
//		}
//		return s;
//	}
//
//	public static String compression2(String str) {
//		String s=str.charAt(0)+"";
//		int count=1;
//		
//		for(int i=1;i<str.length();i++) {
//			char curr=str.charAt(i);
//			char prev=str.charAt(i-1);
//			
//			if(curr==prev) {
//				count++;
//			}else {
//				if(count>1) {
//					s=s+count;
//					count=1;
//				}
//				s=s+curr;
//				
//			}			
//		}
//
//		return null;
//	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		// String str = scn.next();
//		System.out.println(compression1(str));
//		System.out.println(compression2(str));
//		String s = toggleCase(str);
//		System.out.println(s);
		System.out.println("Enter how many strings::");
		int n = scn.nextInt();
		String s[] = new String[n];

		for (int i = 0; i < n; i++) {
			s[i] = scn.next();
		}

		int startIndex = scn.nextInt();
		String target = scn.next();

		int c = toolChanger(s, startIndex, target);
		System.out.println(c);
	}

	private static int toolChanger(String[] s, int startIndex, String target) {
		if(s[startIndex].equals(target)) {
			return 0;
		}
		
		int lp=startIndex-1, rp=startIndex+1,steps=1;
		
		if(lp<0) {
			lp=s.length-1;
		}
		
		if(rp==s.length) {
			rp=0;
		}
		
		while(lp>=0 && rp<=s.length-1 && rp>=0 && lp<=s.length-1) {
			if(s[lp].equals(target) || s[rp].equals(target)) {
				break;
			}
			lp--;
			if(lp<0) {
				lp=s.length-1;
			}
			rp++;
			if(rp==s.length) {
				rp=0;
			}
			steps++;
		}		
		return steps;
	}

	private static String toggleCase(String str) {
		StringBuilder sb = new StringBuilder(str);

		for (int i = 0; i < sb.length(); i++) {
			char ch = sb.charAt(i);

			if (ch >= 'a' && ch <= 'z') { // lc--> uc
				char uc = (char) ('A' + ch - 'a');// explicit typecasting
				sb.setCharAt(i, uc);
			} else if (ch >= 'A' && ch <= 'Z') { // lc--> uc
				char lc = (char) ('a' + ch - 'A');// explicit typecasting
				sb.setCharAt(i, lc);
			}

		}
		return sb.toString();
	}

}
