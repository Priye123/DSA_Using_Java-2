package core_oops;

class Animal {

//	void show123() {
//		System.out.println("123");
//	}

	public Object show() {
		System.out.println("It is gud");
		return 0;
	}

//	void show234() {
//		System.out.println("234");
//	}
}

class Dog extends Animal {

//	public String show() {
//		return "Raman";
//	}
	
	public Integer show() {
		super.show();// invoke over-ride method from parent class
		return 1;
	}

//	void show345() {
//		System.out.println("345");
//	}
//
//	void show456() {
//		System.out.println("456");
//	}

}

public class Day10Part4 {

	public static void main(String[] args) {

		Dog d=new Dog();
		System.out.println(d.show());
		
		
		
		
		
//		Animal a=new Dog(); //upcasting
//		
//		a.show();//2 due to method-over-rding
//		a.show123(); //123
//		a.show234(); //456
//		
//		//Dog d=new Animal(); //downcasting
//		
//		Animal a1=new Animal();
//		a1.show(); //45
//		
//		Dog d=new Dog();
//		d.show();
//		d.show(20);
		
			
//		Test t = new Test();
//		t.show();

//		Xyz e=new Xyz();
//		e.show();
//		e.show1();

		// Parent p=new Child();
		// child class object( new Xyz() ) can be referred by parent class reference
		// variable :- dynamic dispatch
		// we can access only :- over-ridden methods + parent class methods

//		Test t = new Xyz(); // Dynamic dispatch/Upcasting in java
//		t.show(); //2 ( method over-ride)
//		t.show1(); //1
//		t.show2(); //67
//		
//		
//		Xyz m=new Xyz();
//		m.show(); //2 ( method ovr-ride)
//		m.show4(); //67
//		
//		Test t1=new Test();
//		t1.show(); //45 ( not a method over-riding)
		
		//Child c=new Parent();
		//Xyz t2=(Xyz) new Test(); //Downcasting :- It is not possible in java
		// throws ClassCast Exception
		
		//int d=6/0;

	}

}
