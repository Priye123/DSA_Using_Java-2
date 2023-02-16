package coding_problems;

public class Codes3 {

	public static void main(String[] args) {

		// System.out.println(1 + 2 + 3 + "Ram");

		// System.out.println("Ram" + 1 + 2 + 3);

		// + :- concatenation ( string to string, string to number)
		// + :- addition ( with number to number)

		// System.out.println(1 + 2 + "Jai" + 3 + 4); // 3Jai34

		// System.out.println(3 + "Jai" + 7);

//		String s = "priye";
//		String t = "";
//
//		for (int i = 0; i < s.length(); i++) {
//			char ch = s.charAt(i);
//
//			if (i == s.length() - 1) {
//				// System.out.println(ch+""+ch);//e+""+e=ee
//				System.out.println("" + ch + ch);
//			}
//		}

		for (int i = 0; i < 5; i++) { 

			for (int j = 0; j < i; j++) { 
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}
