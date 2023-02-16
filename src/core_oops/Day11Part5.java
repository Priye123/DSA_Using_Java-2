package core_oops;

class A{
	int i=10;
	
	void m1() {
		System.out.println("I am in class A");
	}
	
	public A() {
		System.out.println("I am of class A constructor");
	}
}

class B extends A{
	int i=20;
	
	void show(int i) {
		System.out.println(this.i);
		super.m1();
		System.out.println(super.i);
	}
	
	public B() {
		super(); //implicit call
		System.out.println("I am of class B constructor");
	}
}

public class Day11Part5 {

	public static void main(String[] args) {
		B ob=new B();
		ob.show(30);
		
		//1.super keyword can be used to refer immediate parent class instance/object variable.
		
		//2.super keyword can be used to invoke immediate parent class method.
		
		//3. super() can be used to invoke parent class constructor.
	}

}
