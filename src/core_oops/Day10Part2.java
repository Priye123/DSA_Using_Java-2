package core_oops;

import java.util.Scanner;

// area of rectangle= length*breadth, square= side * side, circle = 3.14 * r *r, triangle
public class Day10Part2 {
	
	static void area(int length,int breadth) {
		System.out.println("The area of rectangle is::"+(length*breadth));
	}
	
	static void area(int side) {
		System.out.println("The area of square is::"+(side*side));
	}
	
	static void area(double radius) {
		System.out.println("The area of circle is::"+(Math.PI)*radius*radius);
	}
	
	static void area1(int base,int height) {
		System.out.println("The area of triangle is::"+(base*height)/2);
	}
	
	static void area(int l,int b,int s,double r) {
		System.out.println("The area of rectangle is::"+(l*b));
		System.out.println("The area of square is::"+(s*s));
		System.out.println("The area of circle is::"+(Math.PI)*r*r);
	}
	
	public static void main(String[] args) {
		//Day10Part2 d=new Day10Part2();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the length & breadth of Rectangle::");
		int length=sc.nextInt();
		int breadth=sc.nextInt();
		area(length,breadth);
		
		System.out.println("Enter the side of Sqaure::");
		int side=sc.nextInt();
		area(side);
		
		System.out.println("Enter the raduis of a circle::");
		double radius=sc.nextDouble();
		area(radius);
		
		System.out.println("Enter the base & height of a triangle::");
		int base=sc.nextInt();
		int height=sc.nextInt();
		area1(base,height);
		
		area(length,breadth,side,radius);
		
	}

}

























//int show(int a,double b) { //not a method over-loading
//System.out.println("1");
//}

//void show(String name,int a) {
//System.out.println();
//}
//
//void show(int a,String name) {
//System.out.println(a);
//}
