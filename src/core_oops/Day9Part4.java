//package core_oops;
//
////single
//class Vehicle {
//	
//	int tyres;
//	int gear;
//	
//	public Vehicle() {
//		System.out.println("Parent class");
//	}
//	
//	void start() {
//		System.out.println("Parent class");
//	}
//}
//
//class Car extends Vehicle{
//	
////	int tyres;
////	int gear;
//	boolean pushback;
//	
////	void start() {
////		System.out.println("child class");
////	}
//	
//	public Car() {
//		//super();
//		System.out.println("child class");
//	}
//	
//	void stop() {
//		System.out.println("child class");
//	}
//	
//}
//
//public class Day9Part4 {
//
//	public static void main(String[] args) {
//		
//		Vehicle v = new Vehicle();//Parent class
//		//v.pushback=true;//parent is trying to inherit properties(object variables/methods) from child
//		v.gear=10;
//		v.tyres=20;
//		
//		System.out.println(v.gear+" "+v.tyres); //10 20
//		
//		Car c=new Car();//child class
//		c.tyres=15;
//		c.gear=25;
//		c.pushback=false;
//		
//		System.out.println(c.gear+" "+c.tyres+" "+c.pushback);//15 25 false
//	}
//
//}
