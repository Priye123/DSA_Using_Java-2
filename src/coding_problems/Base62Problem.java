package coding_problems;

public class Base62Problem {

	public static void main(String[] args) {
		int n = 23572;
		String res = "";
		String s = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

		while (n != 0) {
			int x = n % 62;
			char ch = s.charAt(x);
			res = ch + res;
			n=n/62;
		}

		System.out.println(res);
	}

}
