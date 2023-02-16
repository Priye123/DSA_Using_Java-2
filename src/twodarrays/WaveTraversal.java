package twodarrays;

import java.util.Scanner;

public class WaveTraversal {

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
		
		for(int j=0;j<m[0].length;j++) { //column
			
			if(j%2==0) {
				for(int i=0;i<m.length;i++) {
					System.out.print(m[i][j]+" ");
				}
				
			}else {
				for(int i=m.length-1;i>=0;i--) {
					System.out.print(m[i][j]+" ");
				}
			}
			System.out.println();
		}
	}

}
