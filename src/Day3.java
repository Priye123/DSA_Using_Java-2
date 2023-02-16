import java.util.Scanner;

public class Day3 {

	public static void main(String[] args) {

		// BufferedReader br=new BufferedReader(InputStream)
		Scanner sc = new Scanner(System.in);
//		char gender=sc.next().charAt(0);
//		double height=sc.nextDouble();
//		int age=sc.nextInt();
//		
//		if(gender=='M') {//nested if-else
//			if(height==4.5) {
//				if(age<=10 && age>=20) {
//					System.out.println("This is allowed");
//				}else
//					System.out.println("This is not allowed");
//			}
//		}else {
//			if(gender=='F'&& height>=5.7 && age>=18) { 
//				System.out.println("she is female");
//			}else if() {
//				
//			}else if() {
//				
//			}else {
//				
//			}
//				
//		}

		// nested if-else
		// ladder if-else
//		int a,b,c;
//		a=sc.nextInt();
		// b=sc.nextInt();
		// c=sc.nextInt();
//		
//		System.out.println(Math.max(a, Math.max(b, c)));//nested

		// WAP leap-year, grading system

//		if(a%2==0)
//			System.out.println("even");
//		else
//			System.out.println("odd");

//		String c1=a%2==0?"even":"odd";
//		System.out.println(c1);
//		//System.out.println(a%2==0?1:0);
//		System.out.println(a%2==0?"even":"odd");

		// calculator

//		int a = sc.nextInt();
//		int b = sc.nextInt();
//
//		System.out.println("Enter user's choice::");
//		char c = sc.next().charAt(0); // '+'
//
//		switch (c) {
//		case '+':
//			System.out.println(a + b);
//			//break;
//
//		case '-':
//			System.out.println(a - b);
//			//break;
//
//		case '*':
//			System.out.println(a * b);
//			//break;
//
//		default:
//			System.out.println("invalid input");
//			//break;
//		}
		
		// time complexity > space complexity
		
		//to reduce the manual efforts
//		for(int i=0;i<=50;i++) { // O(10) O(n) :- n is input space:- O(1)
//			System.out.println(i);
//		}
//		
//		int a=sc.nextInt();// Time & Space :-O(1)
		//int b=sc.nextInt();
		
		//sum of digits of a number 345 3+4+5=12 o/p:-12
		//int sum=0;
		
		// b=345
//		while(b!=0) { // b=3
//			int rem= b%10; //3
//			sum=sum+rem;//5+4=9+3=12
//			b=b/10; //3 	
//		}
//		System.out.println(sum);
		
//		 do{ // b=3
//			int rem= b%10; 
//			sum=sum+rem; //0+0=0
//			b=b/10; 	
//		}while(b!=0);
//		System.out.println(sum);
		
//		for(int a=500;a>0;a/=10) { 
//			System.out.println(a); //500, 50 , 5 
//		}
		
		// nested for loops
		
//		for(int i=0;i<5;i++) { //i=2
//			for(int j=0;j<2;j++){
			//System.out.print("* ");
	//		}
		//break;
//				
//	System.out.println();
//		}
		
		//multiply 2 numbers without * operator

//		int prod=0;
//		for(int i=1;i<=b;i++) {
//			prod=prod+a;
//		}
//		System.out.println(prod);
		
		//break can only be used with loops & switch
		//continue is use for skip the condition
		for(int i=0;i<=5;i++) {
			if(i==2)
				continue;
			System.out.println(i+"->Sameer"); // 0,1,3,4,5
		}
	}

}
