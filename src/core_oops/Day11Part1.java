package core_oops;

abstract class Vehicle{
	int no_of_tires;
	abstract void start();
	abstract void stop();
	
	void price() {
		System.out.println("Range-->50k-50Lakh");
	}
}

class Car extends Vehicle{

	void start() {
		System.out.println("starts with key");	
	}

	void stop() {
		System.out.println("stops");
	}
	
	void price() {
		System.out.println("Price of a normal car is 8lakh");
	}
	
}

class Scooter extends Vehicle{

	@Override
	void start() {
		System.out.println("starts with kick");
	}

	@Override
	void stop() {
		System.out.println("stops");
	}
	
}


public class Day11Part1 {
	
	public static void main(String[] args) {
//		Car c=new Car();
//		c.start();
//		c.stop();
//		c.price();
		
		//Vehicle v=new Vehicle();
		
//		Vehicle v=new Scooter();//upcasting/dynamic polymorphism
//		v.start();
//		v.stop();
//		v.price();
		
//		Vehicle v=new Car();
//		v.start();
//		v.stop();
//		v.price();
		
		// Car c=new Vehicle(); :- downcasting
		
	}

}
