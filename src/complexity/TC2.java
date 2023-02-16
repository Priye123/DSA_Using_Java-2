package complexity;

import java.util.ArrayList;
import java.util.Scanner;

public class TC2 {

	//i/p:-n=6
	//o/p :- 21
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		//1st way
		
		int sum=n*(n+1)/2;
		System.out.println(sum);
		
		//2nd way
		
		int p=1;
		
		for(int i=1;i<=n;i++) {
			p=p*i;
		}
		
		System.out.println(p);
		
		//3rd way
		
		//O(n2)
		
		ArrayList<Integer> a1=new ArrayList<>(); //SC:-O(n) TC:-O(1)
		ArrayList<Integer> a2=new ArrayList<>();
		
		
		int sum1=0;
		for(int i=1;i<=n;i++) { 
			for(int j=1;j<=i;j++) {
				sum=sum+1;
			}
		}
	}

}
