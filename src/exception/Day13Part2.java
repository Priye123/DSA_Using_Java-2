package exception;

import java.io.IOException;
import java.util.Scanner;

public class Day13Part2 {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);// Scanner class & its instances are a Resource.
		int c = 0;

		while (c != 3) {
			int n = sc.nextInt();// 2,3,0
			
			try {
				Exception s = a(n);
				System.out.println("Hello");
				//break;
				System.exit(1);
				
			} catch (Exception e) {
				e.printStackTrace();
				
			} finally {
				System.out.println("Ram");
				//sc.close();
			}
			
			c++;
		}
	}

	private static Exception a(int n) {
		try {
			System.out.println(2 / n);
			return null;
		} catch (Exception e) {
			return e;
		}
	}
}





//public static void main(String[] args) {
//try {
//
//	int a = 100, b = 2, c;
//	c = a / b;
//	System.out.println(c);
//
//	String name = null;
//	System.out.println(name.length());
//
//} catch (NullPointerException e) {
//	System.out.println(e);
//} catch (Throwable s) {
//	System.out.println(s);
//} finally {
//	System.out.println("I am in finally block");
//}
//
//System.out.println("Hello");// only when program terminates normally.
//
//}
