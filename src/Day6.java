import java.util.Scanner;

public class Day6 {

	public static void main(String[] args) {
		// Scanner sc = new Scanner(System.in);

		// String s="hello I am a gud boy";

//		String s1=sc.next();// when next() encounters space,then it will stop and after space it will treat as a new string
//		String s2=sc.next();
//		String s3=sc.next();
//		
//		System.out.println(s1);
//		System.out.println(s2);
//		System.out.println(s3);

		// solution:- use nextLine()
		// use next() only when we have to play with word otherwise use nextLine()

		// String s1=sc.nextLine(); // Hello
		// String s2=sc.nextLine();

		// System.out.println(s1);
		// System.out.println(s2);

		// System.out.println(s1.length());

		// arr[0]:- giving value for 0th position
		// s1[0] not allowed , u have to use charAt(0)

		// char c=s1.charAt(4);
		// System.out.println(c);

		// s1.charAt(0)='d'; // I m trying to modify the character in a string
		// why? String is Im-mutable. solution:- we have to use StringBuiler/
		// StringBuffer class

		// substring() :- taking string into pieces
		// "Hello World"
		// substring(6,11) : 6 to 10

		// String s="Hello world";

		// System.out.println(s.substring(2));

//		String s1="Hello";
//		char c='e';
//		int d=2020;
//		int e=10;
//		
//		
//		//System.out.println("Yes "+i);
//		
//		String s2=s1+c+d+e;
//		
//		System.out.println(s2);

		// System.out.println(10+20+"India");
		// System.out.println("India"+(10+20));

//		String s="abc def ghi jkl mno"; // string s[] =["abc","def","ghi","jkl","mno"]
//		
//		//split(" ") :- convert string into string array using patter which are given as a argument
//		
//		String[] parts=s.split(" ");
//		//System.out.println(parts[1]);
//		
//		for(String part:parts) {
//			System.out.println(part);
//		}

//		String s1="Hello";
//		String s2="Hello";
//		String s3="Hello";
//		
//		s3=s3+"world";
//		String str="Hello";
//		String s=str;
//		//no:-O(n)  yes:-O(n^2)
//		for(int i=0;i<str.length();i++) {
//			s=s+i;//Hello+0=Hello0 , Hello4
//			System.out.println(s);
//		}

//		String s1="Hello";
//		String s2="Hello";
//		String s3=new String("Hello");

		// == checks address
//		System.out.println(s1==s2);
//		System.out.println(s2==s3);
//		System.out.println(s1==s3);

		// equals() :- first reference check, check the content of a String
//		System.out.println(s1.equals(s2));
//		System.out.println(s2.equals(s3));
//		System.out.println(s1.equals(s3));

//		StringBuilder sb=new StringBuilder("Hello");
//		System.out.println(sb);
//		
//		System.out.println(sb.charAt(4));
//		
//		sb.setCharAt(2,'d'); //update
//		System.out.println(sb);
//		
//		sb.append('w'); //add at the end
//		System.out.println(sb);
//		
//		sb.deleteCharAt(4); // remove
//		System.out.println(sb);
//		
//		sb.insert(2, 's'); // insert
//		System.out.println(sb);
//		
//		System.out.println(sb.length());

		int n = 1000000;
		long start = System.currentTimeMillis(); // 0
		//String s = "";
		StringBuilder s=new StringBuilder();
		for (int i = 0; i < n; i++) {
			//s = s + i;
			//System.out.println(s);
			s.append(i);
		}
		long end = System.currentTimeMillis();
		long duration = end - start;
		System.out.println(duration); // 248 ms O(n^2) // 2ms
	}

}
