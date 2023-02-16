package core_oops;

//hiearchial
//Object is the parent class for all the classes in Java.
//Here Point is parent class & Line,Triangle are siblings.
class Point extends Object {
	int onedot;

	void printPoint() {
		System.out.println("This is a point with " + onedot + " dot");
	}
}

class Line extends Point {
	int twodot;

	void printLine() {
		System.out.println("This is a line with " + twodot + " dots");
	}
}

class Triangle extends Point{
	// self property
	int threedot;

	void printTriangle() {
		System.out.println("This is a triangle with " + threedot + " dots");
	}
}



public class Day9Part6 {

	public static void main(String[] args) {
		Triangle t = new Triangle(); //only one object
		
		t.onedot = 1; // Point class
		//t.twodot = 2; // Line class :- cannot inherit property of Line class
		t.threedot = 3; // Triangle class

		t.printPoint();
		//t.printLine();
		t.printTriangle();


	}

}
