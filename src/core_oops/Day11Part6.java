package core_oops;


final class A1{
	
	//final method cannot be over-ridden
	final void m1() {
		System.out.println("I am in class A");
	}
	
	void m2() {
		System.out.println("I am m2 method");
	}
	
}

//class B1 extends A1{
//	
////	void m1() {
////		System.out.println("I am in class B");
////	}
//	
//	void m2() {
//		System.out.println("I am m2 method");
//	}
//}


public class Day11Part6 {

	public static void main(String[] args) {
		final int i=10;
		//i=i+20;
		System.out.println(i);

	}

}
