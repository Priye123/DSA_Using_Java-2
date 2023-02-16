package core_oops;

interface I1{
	public static final int a=10;
	abstract void show();
}

class Test implements I1{

	@Override
	public void show() {
		System.out.println("1");
		
	}
	
}

public class Day11Part2 {

	public static void main(String[] args) {
//		Test t=new Test();
//		t.show();
		
		I1 i=new Test();
		i.show();

	}

}
