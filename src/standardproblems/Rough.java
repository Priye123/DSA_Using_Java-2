package standardproblems;

import java.util.Scanner;

public class Rough {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String t="";
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j <= str.length(); j++) {
				System.out.print(str.substring(i, j) + " ");
				//System.out.println("------------------");
				if(isPalindrome(str.substring(i, j))) {
					if(t.length()<str.substring(i, j).length()) {
						t=str.substring(i, j);
					}
				}
			}
		}
		System.out.println("-----------------------");
		System.out.println(t);
	}

	private static boolean isPalindrome(String str) {
		
		for(int i=0,j=str.length()-1;i<=j;i++,j--) {
			if(str.charAt(i)!=str.charAt(j)) {
				return false;
			}
		}
		
		return true;
	}

}
