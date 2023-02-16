package wrapper_class;

public class Person {
	
	String name;
	int roll;
	char gender;
	
	
	public static void main(String[] args) {
		Person p=new Person();
		p.name="Raju";
		p.roll=10;
		p.gender='M';
		//System.out.println(p);
		//System.out.println(p.name+" "+p.roll+" "+p.gender);
		System.out.println(p.toString());
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", roll=" + roll + ", gender=" + gender + "]";
	}
}
