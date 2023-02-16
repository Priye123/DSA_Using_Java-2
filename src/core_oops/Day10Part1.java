package core_oops;

class Parent{
	int a=10;
	
	void a1() {
		System.out.println("I am hero");
	}
	
	public Parent() {
		
	}
}

class Child extends Parent{
	
}



public class Day10Part1 {

	public static void main(String[] args) {
		Child c=new Child(); //it is only possible due to aggregation
		System.out.println(c.a);
		c.a1();
	}

}
