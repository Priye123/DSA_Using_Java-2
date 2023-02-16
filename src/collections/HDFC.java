package collections;

class HDFC implements Bank {

	@Override
	public void a() {
		System.out.println("a method");
	}

	@Override
	public void b() {
		System.out.println("b method");
	}

	// method of HDFC class
	public void c() {
		System.out.println("c method");
	}

	public static void main(String[] args) {
		Bank b = new HDFC();// dynamic polymorphism/upcasting
		b.a();
		b.b();
		// b.c();

	}

}

//public class Rough {
//
//	public static void main(String[] args) {
//		
//
//	}
//
//}
