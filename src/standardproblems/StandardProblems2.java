package standardproblems;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;

public class StandardProblems2 {

	public static void main(String[] args) {
		// palindromeNumber();
		// largestOf3Numbers();
		// fibonacciNumber();
		// equalityOf2Arrays();
		// removeSpecialcharacters();
		// reverseVowelsinaString();
		// primeNumber();
		// primeNumberwithinRange();
		// nthLargestNumber();
		nextGreaterElementTotheRight();
	}

	private static void nextGreaterElementTotheRight() {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();

		int a[] = new int[size];

		for (int i = 0; i < size; i++)
			a[i] = s.nextInt();

		int nge[] = new int[a.length];

		Stack<Integer> st = new Stack<>();
		st.push(a[a.length - 1]);

		nge[a.length - 1] = -1;

		for (int i = a.length - 2; i >= 0; i--) {

			// rpa
			while (st.size() > 0 && a[i] > st.peek())
				st.pop();

			if (st.size() == 0) {
				nge[i] = -1;
			} else {
				nge[i] = st.peek();
			}
			
			st.push(a[i]);
		}

		for (int r : nge) {
			System.out.print(r + " ");
		}

	}

	private static void nthLargestNumber() {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();

		int a[] = new int[size];

		for (int i = 0; i < size; i++)
			a[i] = s.nextInt();

		int nthLargest = s.nextInt();

		Set<Integer> set = new TreeSet<>();

		for (int i = 0; i < a.length; i++) {
			set.add(a[i]);
		}

		List<Integer> l = new ArrayList<>(set);// convert treeset to arraylist

		System.out.println(l.get(size - nthLargest));
	}

	private static void primeNumberwithinRange() {
		Scanner sc = new Scanner(System.in);
		int low = sc.nextInt();
		int high = sc.nextInt();

		while (low <= high) {
			if (isPrime(low)) {
				System.out.println(low);
			}
			low++;
		}
	}

	private static boolean isPrime(int n) {

		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	private static void primeNumber() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = 2; i <= Math.sqrt(n); i++) { // O(sqrt(n))
			if (n % i == 0) {
				System.out.println("not prime");
				return;
			}
		}

		System.out.println("Prime");
	}

	private static void reverseVowelsinaString() {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();// A m E o t R i //
		char c[] = s.toCharArray();// [ 'h' ,'m', 'E' , 'o' , 't' R 'w' ]
		int left = 0, right = s.length() - 1;

		while (left <= right) {

			if (!isVowel(c[left])) {
				left++;
			}
			if (!isVowel(c[right])) {
				right--;
			}

			if (isVowel(c[left]) && isVowel(c[right])) {
				char temp = c[left];
				c[left] = c[right];
				c[right] = temp;
				left++;
				right--;
			}
		}

//		for(char ch:c) {
//			System.out.print(ch);
//		}

		// how to convert characater array to string

		System.out.println(String.valueOf(c));

	}

	private static boolean isVowel(char ch1) {
		if (ch1 == 'a' || ch1 == 'e' || ch1 == 'i' || ch1 == 'o' || ch1 == 'u' || ch1 == 'A' || ch1 == 'E' || ch1 == 'I'
				|| ch1 == 'O' || ch1 == 'U') {
			return true;
		} else {
			return false;
		}
	}

	private static void removeSpecialcharacters() {
		Scanner sc = new Scanner(System.in);
		String s = sc.next(), t = "";

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (Character.isLetterOrDigit(ch)) {
				t = t + ch;
			}
		}
		System.out.println(t);
	}

	private static void equalityOf2Arrays() {
		Scanner s = new Scanner(System.in);
		int size1 = s.nextInt();

		int a[] = new int[size1];

		for (int i = 0; i < size1; i++)
			a[i] = s.nextInt();

		int size2 = s.nextInt();

		int b[] = new int[size1];

		for (int i = 0; i < size2; i++)
			b[i] = s.nextInt();

		Map<Integer, Integer> map = new LinkedHashMap<>();

		for (int i = 0; i < a.length; i++) {
			if (map.containsKey(a[i])) {
				map.put(a[i], map.get(a[i]) + 1);
			} else {
				map.put(a[i], 1);
			}
		}

		for (int i = 0; i < b.length; i++) {
			if (!map.containsKey(b[i])) {
				System.out.println("Arrays are not equal");
				return;
			} else {
				map.put(b[i], map.get(b[i]) - 1);
			}
		}

		for (int key : map.keySet()) {
			if (map.get(key) != 0) {
				System.out.println("Arrays are not equal");
				return;
			}
		}
		System.out.println("Arrays are Equal");
	}

	private static void fibonacciNumber() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = 0, b = 1;
//		System.out.println(a);
//		System.out.println(b);

		for (int i = 1; i <= n; i++) {
			System.out.println(a);
			int c = a + b;
			// System.out.println(c);
			a = b;
			b = c;
		}

	}

	private static void largestOf3Numbers() {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int maxOf3numbers = Math.max(a, Math.max(b, c));
		System.out.println(maxOf3numbers);
	}

	private static void palindromeNumber() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int countOfDigits = (int) Math.floor(Math.log10(n) + 1);
		int originalNumber = n, reverseNumber = 0;

		while (n != 0) {
			int remainder = n % 10;
			reverseNumber = reverseNumber + (remainder * (int) (Math.pow(10, countOfDigits - 1)));
			n = n / 10;
			countOfDigits--;
		}

		if (originalNumber == reverseNumber) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}
		System.out.println(reverseNumber);

	}

}
