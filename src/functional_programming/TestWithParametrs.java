package functional_programming;

@FunctionalInterface
interface Cab{
	//public void bookCab(String source,String destination);
	//public String bookCab(String source,String destination);
	//public int cube(int a);
	public boolean pythagoras(int a,int b,int c);
}

//class Ola implements Cab{
//
//	@Override
//	public String bookCab(String source, String destination) {
//		System.out.println("Ola cab is booked from "+source+" To "+destination);
//		return ("Price : 5000 rs");
//	}
//	
//}

public class TestWithParametrs {
	
	public static void main(String[] args) {
		
//		Cab cab=(source,destination) -> System.out.println("Ola cab is booked from "+source+" To "+destination);
//		cab.bookCab("Hyderabad", "Bihar");
		
//		Cab cab=new Ola();
//		System.out.println(cab.bookCab("Hyd", "Dbg"));
		
		
//		Cab cab=(source,destination)->{
//			System.out.println("Ola cab is booked from "+source+" To "+destination);
//			return ("Price : 5000 rs");
//		};
//		
//		System.out.println(cab.bookCab("Hyd", "Dbg"));
		
//		Cab cab=a -> a*a*a;
//		System.out.println(cab.cube(3));
		
		 Cab cab= (a,b,c) -> {
			 if(a*a + b*b == c*c) {
				 return true;
			 }
			 return false;
		 };
		 System.out.println(cab.pythagoras(3,4,5));
		
	}
}
