package core_oops;

public class Day11Part4 {
//	int i;
//	
//	void setValue(int i) {
//		this.i=i;
//	}

//	void display() {
//		System.out.println("hello");
//	}
//	
//	void show() {
//		System.out.println("before");
//		this.display();//if u forget to use this here, then compiler automatically add this on that method.
//		System.out.println("after");
//	}

	public Day11Part4() {
		//this(10); // this ke sath bracket lagna matlab wo ek cosntructor h
		System.out.println("non-paramterized constructor");
		//this(20); it must be the first statement
	}

	public Day11Part4(int a) {
		this();
		System.out.println("paramterized constructor");
		System.out.println("Priye");
	}

	public static void main(String[] args) {
		// 1.this keyword can be used to refer current class instance variable.

//		Day11Part4 d=new Day11Part4();
//		d.setValue(100);

		// 2. this keyword can be use to invoke current class method(implicitly)

//		Day11Part4 d=new Day11Part4();
//		d.show();

		// 3. this() keyword can be used to invoke current class constructor.
		Day11Part4 d = new Day11Part4();
		
	}

}
