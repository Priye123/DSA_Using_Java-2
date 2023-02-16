package twodarrays;

import java.util.Scanner;

public class SpiralDisplay {

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
		
		int minr=0;
		int minc=0;
		int maxr=m.length-1;
		int maxc=m[0].length-1;
		int count=0;
		int total=r1*c1;
		
		while(count<total) {
			
			//left wall
			for(int i=minr,j=minc;i<=maxr && count<total;i++) {
				System.out.println(m[i][j]);
				count++;
			}
			minc++;
			
			//bottom wall
			for(int i=maxr,j=minc;j<=maxc && count<total;j++) {
				System.out.println(m[i][j]);
				count++;
			}
			maxr--;
			
			//right wall
			for(int i=maxr,j=maxc;i>=minr && count<total;i--) {
				System.out.println(m[i][j]);
				count++;
			}
			maxc--;
			
			//top wall
			for(int i=minr,j=maxc;j>=minc && count<total;j--) {
				System.out.println(m[i][j]);
				count++;
			}
			minr++;
			
		}
		

	}

}
