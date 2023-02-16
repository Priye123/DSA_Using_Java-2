//package core_oops;
//
////multi-level
////Object is the parent class for all the classes in Java.
//class Point {
//	int onedot;
//
//	void printPoint() {
//		System.out.println("This is a point with " + onedot + " dot");
//	}
//}
//
//class Line extends Point {
//	int twodot;
//
//	void printLine() {
//		System.out.println("This is a line with " + twodot + " dots");
//	}
//}
//
//class Triangle extends Line{
//	// Grand-Parent
////	int onedot;
////
////	void printPoint() {
////		System.out.println("This is a point with " + onedot + " dot");
////	}
//
//	// Parent
////	int twodot;
////
////	void printLine() {
////		System.out.println("This is a line with " + twodot + " dots");
////	}
//	
////	class Square extends Triangle {
////		
////		//self-property
////		int fourdot;
////
////		void printSquare() {
////			System.out.println("This is a square with " + fourdot + " dots");
////		}
////	}
//
//	// self property
//	int threedot;
//
//	void printTriangle() {
//		System.out.println("This is a triangle with " + threedot + " dots");
//	}
//}
//
//
//
//public class Day9Part5 {
//
//	public static void main(String[] args) {
//		Triangle t = new Triangle(); //only one object
//
//		t.onedot = 1; // Point class
//		t.twodot = 2; // Line class
//		t.threedot = 3; // Triangle class
//
//		t.printPoint();
//		t.printLine();
//		t.printTriangle();
//
////		Point p = new Point();
////		p.onedot = 1;
////		p.printPoint();
////
////		Line l = new Line();
////		l.twodot = 2;
////		l.printLine();
////		
////		Triangle t=new Triangle();
////		t.threedot=3;
////		t.printTriangle();
//
//	}
//
//}
