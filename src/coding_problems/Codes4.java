package coding_problems;

import java.util.Scanner;

public class Codes4 {

	public static void main(String[] args) {
		nCr();
		Encrypt();

	}

	private static void Encrypt() {
		Scanner sc = new Scanner(System.in);
		String s=sc.next();
		
		String st=encrypt(s);
		System.out.println(st);
	}

	private static String encrypt(String s) {
		String t="";
		
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i); //A
			t=t+(ch-'A');
		}
		return t;
	}

	private static void nCr() {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt(); //5
		int r=sc.nextInt(); //2
		
		if(r>n)
			return ;
			
		int ncr=factorial(n)/( factorial(r)*factorial(n-r) );
		
		System.out.println(ncr);
	}
	
	
	private static int factorial(int n) {
		
		if(n==0)
			return 1;
		
		int fact=1;
		
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		}
		
		return fact;
	}

}
