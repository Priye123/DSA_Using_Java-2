package coding_problems;

import java.util.Scanner;
import java.util.Stack;

public class Codes {

	public static void main(String[] args) {
		// countOfDigits();
		//palindrome();
		//palindrome1();
		//palindrome2();
		strongNumber();

	}

	private static void strongNumber() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum=0;
		int original=n;
		
		while(n!=0) {
			int r=n%10;
			sum=sum+fact(r);
			n=n/10;	
		}
		
		if(original==sum) {
			System.out.println("Strong Number");
		}else {
			System.out.println("Not");
		}
	}

	private static int fact(int r) {
		
		int prod=1;
		
		for(int i=1;i<=r;i++) {
			prod=prod*i;
		}
		
		return prod;
	}

	private static void palindrome2() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		Stack<Integer> st=new Stack<>();
		
		while(n!=0) {
			st.push(n%10);
			n=n/10;
		}
		
		String s="";
		
		while(!st.empty()) {
			s=st.pop()+s;
		}
		
		System.out.println(s);
	}

	private static void palindrome1() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 123
		String s = Integer.toString(n);// "123"
		String ori = s;
		String rev = "";

		for (int i = s.length() - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}

		if (ori.equals(rev)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}

	}

	private static void palindrome() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int no_of_digits = (int) (Math.floor(Math.log10(n))) + 1;

		System.out.println("The orginal number is:: " + n);
		int c = no_of_digits - 1;
		int original = n;
		int reverse = 0;

		while (n != 0) {

			reverse = reverse + (n % 10) * (int) Math.pow(10, c);
			c--;
			n = n / 10;

		}

		System.out.println("The reverse number is:: " + reverse);

		if (original == reverse) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}

	}

	private static void countOfDigits() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int no_of_digits = (int) (Math.floor(Math.log10(n))) + 1;
		System.out.println(no_of_digits);
	}

}
