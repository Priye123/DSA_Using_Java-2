
//POJO class
class Student extends Object{

	private String name;
	private int roll;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
//
//	public int getRoll() {
//		return roll;
//	}
//
//	public void setRoll(int roll) {
//		this.roll = roll;
//	}

//	Student(String name, int r) {
//		this.name = name;
//		roll=r;
//	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", roll=" + roll + "]";
	}
	
	public static void main(String[] args) {
		Student s = new Student();
		s.name="Rahul";
		
		

	}
		
}






//public class Master{
//
//	public static void main(String[] args) {
//		Student s = new Student();
//		
//		s.setName("Rahul");
//		
//		System.out.println(s.getName());
//		
//
//	}
//
//}

//Student@379619aa





















//System.out.println(s.name+" "+s.roll);

// System.out.println(s.toString());

//		Dest d=new Dest();
//		d.des();

//Dest d=new Dest();
//d.des();
//s.des();

//s.des();
//
//s.name1="Priye";
//System.out.println(s.name1);
//@Override
//void des() {
//	System.out.println("Master block");
//}
