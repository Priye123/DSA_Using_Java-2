package exception;

public class Day13Part1 {

	public static void main(String[] args) {
		int a = 100, b = 0;
		int c;

		try {
			c = a / b;
			System.out.println(c);
		} catch (Exception e) {
			//e.printStackTrace();//exception name + description+line number
			//System.out.println(e.toString());//exception name + description
			System.out.println(e.getMessage());//description
		}

	}

}

//System.out.println("cannot divide by zero");
