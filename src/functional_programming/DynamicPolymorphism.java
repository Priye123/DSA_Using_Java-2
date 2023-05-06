package functional_programming;

interface Car{
	public void Issunroof();
}

class Car1{
	public void seats() {
		System.out.println("General seats");
	}
	
	public void Issunroof() {
		System.out.println("Genral sunroof");
	}
	public void horns() {
		System.out.println("General Horns");
	}
	void gear() {
		System.out.println("General Gear");
	}
}

class Baleno extends Car1{
	
	@Override
	public void Issunroof() {
		System.out.println("Baleno sunroof");
	}
	
	@Override
	public void seats() {
		System.out.println("4 seats");
	}
	
}

class Fortuner extends Car1{
		
	@Override
	public void Issunroof() {
		System.out.println("Fortuner sunroof");
		
	}
	
	@Override
	public void seats() {
		System.out.println("6 seats");
	}
	
	public void carryMusic() {
		System.out.println("Music");
	}
}


public class DynamicPolymorphism {

	public static void main(String[] args) {
		//WebDriver driver=new ChromeDriver();//dynamic polymorphism
//		Baleno b=new Baleno();
//		b.Issunroof();
//		b.seats1();
		
//		Car1 f=new Fortuner();
//		f.Issunroof();
//		f.seats();
		
		Car1 f=new Fortuner();
		f.Issunroof();
		f.seats();
		//f.carryMusic();
		f.horns();
		f.gear();
	}

}
