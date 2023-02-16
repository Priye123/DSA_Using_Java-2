import java.util.Scanner;

public class Day7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// System.out.println("Priye\tSammer\tSubhkant");
		int n = sc.nextInt();
		// pattern0(n);
		// pattern1(n);
		// pattern2(n);
		// pattern3(n);
		// pattern4(n);
		// pattern5(n);
		// pattern6(n);
		//pattern7(n);
		//pattern8(n);
		//pattern9(n);
		//pattern10(n);

	}
	
//	System.out.println(os+" "+is);
//	if(i<=n/2) {
//		os--;
//		is=is+2;
//	}else {
//		os++;
//		is=is-2;
//	}
	private static void pattern10(int n) {
		int os=n/2,is=-1;
		
		for(int i=1;i<=n;i++) {
			
			//outer space
			for(int j=1;j<=os;j++) {
				System.out.print("\t");
			}
			//star
			System.out.print("*\t");
			
			//inner space
			for(int k=1;k<=is;k++) {
				System.out.print("\t");
			}
			//star
			if(i>1 && i<n) { // i !=1 or i!=n
				System.out.print("*\t");
			}
			if(i<=n/2) {
				os--;
				is=is+2;
			}else {
				os++;
				is=is-2;
			}
			System.out.println();
		}
		
	}

	private static void pattern9(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i==j || i+j == n+1) {
					System.out.print("*\t");
				}else {
					System.out.print("\t");
				}

			}
			System.out.println();
		}
		
	}

	private static void pattern8(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i+j == n+1) {
					System.out.print("*\t");
				}else {
					System.out.print("\t");
				}

			}
			System.out.println();
		}
		
	}

	private static void pattern7(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i == j) {
					System.out.print("*\t");
				}else {
					System.out.print("\t");
				}

			}
			System.out.println();
		}

	}

//	System.out.println(st+" "+sp+" "+st);
//	if(i<=n/2) {
//		st--;
//		sp=sp+2;
//	}else {
//		st++;
//		sp=sp-2;
//	}

	private static void pattern6(int n) {
		int st = n / 2 + 1, sp = 1;

		for (int i = 1; i <= n; i++) {

			// stars
			for (int j = 1; j <= st; j++) {
				System.out.print("*\t");
			}

			// spaces
			for (int k = 1; k <= sp; k++) {
				System.out.print("\t");
			}

			// stars
			for (int l = 1; l <= st; l++) {
				System.out.print("*\t");
			}

			if (i <= n / 2) {
				st--;
				sp = sp + 2;
			} else {
				st++;
				sp = sp - 2;
			}

			System.out.println();
		}
	}

//
//	System.out.println(sp+" "+st);
//	
//	if(i<=n/2) { // 3<=2
//		sp--;
//		st=st+2;
//	}else {
//		sp++;
//		st=st-2;
//	}

	// Diamond
	private static void pattern5(int n) {
		int sp = n / 2;
		int st = 1;

		for (int i = 1; i <= n; i++) { // i:- no. of rows

			for (int j = 1; j <= sp; j++) {
				System.out.print("\t");
			}

			for (int k = 1; k <= st; k++) {
				System.out.print("*\t");
			}

			if (i <= n / 2) { // 3<=2
				sp--;
				st = st + 2;
			} else {
				sp++;
				st = st - 2;
			}
			System.out.println();
		}

	}

	private static void pattern4(int n) {

		int spaces = 0; // 4
		int stars = n; // 1

		for (int i = 1; i <= n; i++) { // no. of rows

			for (int j = 1; j <= spaces; j++) {// run upto spaces for a row
				System.out.print("\t");
			}

			for (int k = 1; k <= stars; k++) { // print stars for a line
				System.out.print("*\t");
			}
			spaces++;
			stars--;
			System.out.println();
		}

	}

	private static void pattern3(int n) {
		int spaces = n - 1; // 4
		int stars = 1; // 1

		for (int i = 1; i <= n; i++) { // no. of rows
//			System.out.println(spaces+" "+stars);
//			spaces--;
//			stars++;
			for (int j = 1; j <= spaces; j++) {// run upto spaces for a row
				System.out.print("\t");
			}

			for (int k = 1; k <= stars; k++) { // print stars for a line
				System.out.print("*\t");
			}
			spaces--;
			stars++;
			System.out.println();
		}

	}

	private static void pattern2(int n) {
//		*	*	*	*	*	
//		*	*	*	*	
//		*	*	*	
//		*	*	
//		*

		for (int i = n; i >= 1; i--) { // abstraction

			for (int j = 1; j <= i; j++) {
				System.out.print("*\t");
			}
			System.out.println();
		}
	}

	private static void pattern1(int n) {

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) { // 1 to i
				System.out.print("*\t"); // j+'\t'= 1+100 = 101 j+"\t" string concatenation
			}
			System.out.println();
		}
	}

	private static void pattern0(int n) {
		for (int i = 1; i <= n; i++) { // owner
			for (int j = 1; j <= n; j++) { // layer like electrician,painter
				System.out.print("*\t");
			}
			System.out.println();
		}
	}

}
