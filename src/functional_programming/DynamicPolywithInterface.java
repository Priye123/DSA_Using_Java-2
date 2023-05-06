package functional_programming;

interface A {
	void a();

	int b();

	char c();
	
}

public class DynamicPolywithInterface implements A {

	@Override
	public void a() {
		System.out.println("a");

	}

	@Override
	public int b() {
		return 6;
	}

	@Override
	public char c() {
		return 'a';
	}
	
	void h() {
		System.out.println("H method");
	}

	public static void main(String[] args) {
		A d=new DynamicPolywithInterface();//interface-class(Dynamic Poly)
		d.a();
		System.out.println(d.b());
		System.out.println(d.c());
	}

}
