package core_oops;

//public Day9Part2(String n,int a) { // n="Sameer", a=20
//name=n;
//age=a;
//}

//public Day9Part2() {
//age=0;
//name=null;
//}

public class Day9Part2 {

	int age;
	String name;

	void saysHi() {
		System.out.println(name + "[" + age + "]says hi");
	}

	public Day9Part2(String nam, int a) { // name="Sameer", age=20
		this.name = nam;
		this.age = a;
		this.saysHi();
	}

	public static void main(String[] args) {
		//Day9Part2 d=new Day9Part2();
		Day9Part2 d1 = new Day9Part2("Sameer", 20);
		// System.out.println(d1.name+" "+d1.age);
	}

}
