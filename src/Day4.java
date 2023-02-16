public class Day4 {

	// Method - Overloading :- method with different inputs 
	// same method name but with different parameters
	// same method name same paramters but with different datatypes
	// sum() :- 0 
	// sum(int a,int b) :- 2

	public static void sum() {
		System.out.println("sum");	
	}
	
	public static void sum(int a) {
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		sum();
		sum(7);
	}
	
	
	
	
	
	

	// instance methods
	// from where java compiler parse their execution? - from main() method
	// method :- we create method for doing a specific task

	
	// set-1: no return with no paramters
//	public static void diff() {
//		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt(); // 5
//		int b = sc.nextInt(); // 6
//		System.out.println(a - b); // -1
//	}
//
//	public void sum() { // method-declaration
//		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		// int c=a+b;
//		// System.out.println(c);
//		System.out.println(a + b);
//	}
//
//	// set-2 :- no return but with formal parameters
//	// x=a and y=b
//	// x & y are local variables of sum1 method
//	public static void sum1(int x, int y) {
//		int a, b;
//		// x=a; wrong
//		a = x;
//		b = y;
//		System.out.println(a + b);
//
//		// System.out.println(x+y);
//	}
//
//	// set-3 :- return with no parameters
//	public static int sum2() {
//		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt(); // 5
//		int b = sc.nextInt(); // 6
//		return a + b; // 11
//	}
//
//	// set-4 :- return with parameters
//	public static int sum3(int x, int y) {
//		return x+y; // 11
//	}
//
//	public static void main(String[] args) {
//			Scanner sc = new Scanner(System.in);
//			int a = sc.nextInt(); // 5
//			int b = sc.nextInt(); //6
//			int c=sum3(a,b);
//			System.out.println(c);
//			diff();
//			//Math.PI;
//		}

	 // Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.
	 // 2 methods :- circum() :- 2 * 3.14 * r and area() :- 3.14 * r * r
	// input by user :- radius :- double
	
//	public static void main(String[] args) {
//		 int c=sum2(); // c=11
//		 System.out.println(c); // 11
//	}

//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		
//		// a & b are local variables of main
//		System.out.println("Enter 1st number::");
//		int a = sc.nextInt(); //5
//		System.out.println("Enter 2nd number::");
//		int b = sc.nextInt();
//		sum1(a,b); // method-call with actual(real) parameters		
//	}

//	public static void main(String[] args) {
//
//		System.out.println("Sameer");
//		// sum(); why? bcoz sum method is instance/non-static method which cannot be
//		// called without object.
//
//		Day3 d = new Day3();
//		d.sum(); //re-use
//		diff();
//		d.sum(); //re-use
//		
//		System.out.println("Subhakant");
//	}

//	public static void main(String[] args) {
//		
//		//without method
//		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		System.out.println(a + b);
//		
//		//Scanner sc = new Scanner(System.in);
//		int a1 = sc.nextInt();
//		int b1 = sc.nextInt();
//		System.out.println(a1 + b1);
//		
//		//Scanner sc = new Scanner(System.in);
//		int a2 = sc.nextInt();
//		int b2 = sc.nextInt();
//		System.out.println(a2 + b3);
//		
//		//Scanner sc = new Scanner(System.in);
//		int a3 = sc.nextInt();
//		int b3 = sc.nextInt();
//		System.out.println(a3 + b3);
//		
//		//Scanner sc = new Scanner(System.in);
//		int a4 = sc.nextInt();
//		int b4 = sc.nextInt();
//		System.out.println(a + b);	
//
//	}
}

//Day-1 sum of two numbers
//Day-2 multiplication of two numbers
//Day-3 divison of two numbers
//Day-4 sum of two numbers
//Day-5 multiplication of two numbers
//Day-6 divison of two numbers
// sum of two numbers
//Scanner sc=new Scanner(System.in);
//int a=sc.nextInt();
//int b=sc.nextInt();

//DRY principals:- Do not Repeat yourself
//System.out.println(a+b); // sum
//System.out.println(a*b);
//System.out.println(a/b);
//System.out.println(a+b);
//System.out.println(a*b);
//System.out.println(a/b);

//name() :- method
// 2 types of methods :-
// 1)in-bulit method( method already craeted in java):- main(), println(),
// getTitle()
// 2)user-defined method :- sum1(), sum()