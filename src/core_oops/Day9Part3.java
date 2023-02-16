//package core_oops;
//
//class Vehicle {
//	
//	int tyres;
//	int gear;
//	
//	void start() {
//		System.out.println("Parent class");
//	}
//
//	public Vehicle(int i, int j) {
//		this.tyres = i;
//		this.gear = j;
//	}
//
//}
//
//class Car {
//	
//	int tyres;
//	int gear;
//	boolean pushback;
//	
//	void start() {
//		System.out.println("child class");
//	}
//	
//	void stop() {
//		System.out.println("child class");
//	}
//	
//	public Car(int i, int j,boolean pushback) {
//		this.tyres = i;
//		this.gear = j;
//		this.pushback=pushback;
//	}
//}
//
//public class Day9Part3 {
//
//	public static void main(String[] args) {
//		
//		Vehicle v = new Vehicle(10, 5);
//		System.out.println(v.tyres + " " + v.gear);//10 5
//		
//		Car c=new Car(15,20,true);
//		System.out.println(c.tyres + " " + c.gear); // 15 20
//		
//	}
//
//}
