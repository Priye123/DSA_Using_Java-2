package core_oops;

public class Day9Part1 {
	
	int age;
	String name;

	void saysHi() {
		System.out.println(name + "[" + age + "]says hi");
	}

	public static void main(String[] args) {
		Day9Part1 d=new Day9Part1();
//		System.out.println(d.age);//0
//		System.out.println(d.name);//null
		d.saysHi();
		
		d.age=10;
		d.name="Seema";
		
		Day9Part1 d1=new Day9Part1();
		d1.age=23;
		d1.name="mukul";
		
//		d.saysHi();
//		d1.saysHi();
//		swap1(d,d1);
//		d.saysHi();
//		d1.saysHi();
		
		d.saysHi();
		d1.saysHi();
		swap2(d,d1);
		d.saysHi();
		d1.saysHi();
			
	}

	private static void swap2(Day9Part1 a, Day9Part1 b) {
		int s=a.age;
		a.age=b.age;
		b.age=s;
		
		String n=a.name;
		a.name=b.name;
		b.name=n;	
	}

	private static void swap1(Day9Part1 a, Day9Part1 b) {
		Day9Part1 temp=a;
		a=b;
		b=temp;
	}

}
