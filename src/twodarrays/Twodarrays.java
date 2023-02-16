package twodarrays;

import java.util.Scanner;

public class Twodarrays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r1=sc.nextInt();
		int c1=sc.nextInt();
		int m[][]=new int[r1][c1];
		
		for(int i=0;i<m.length;i++) {
			for(int j=0;j<m[0].length;j++) {
				m[i][j]=sc.nextInt();
			}
		}
		
		int r2=sc.nextInt();
		int c2=sc.nextInt();
		int n[][]=new int[r2][c2];
		
		for(int i=0;i<n.length;i++) {
			for(int j=0;j<n[0].length;j++) {
				n[i][j]=sc.nextInt();
			}
		}
		
		if(c1!=r2) {
			System.out.println("Cannot be multiplied!!");
			System.exit(1);
		}
		
		int prd[][]=new int[r1][c2];
		for(int i=0;i<prd.length;i++) {
			for(int j=0;j<prd[0].length;j++) {
				for(int k=0;k<c1;k++) {
					prd[i][j]=prd[i][j]+m[i][k]*n[k][j];
				}
			}
		}
		
		for(int i=0;i<prd.length;i++) {
			for(int j=0;j<prd[0].length;j++) {
				System.out.print(prd[i][j]+" ");
			}
			System.out.println();
		}

	}

}
