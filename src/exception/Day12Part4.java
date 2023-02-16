package exception;

public class Day12Part4 {

	public static void main(String[] args) {
		int a=100,b=0;
		
		//Parsing from child to parent
		try {
			System.out.println(a/b);
		}catch(Exception e) {
			System.out.println("Ram");
		}catch(Throwable t) {
			System.out.println("Mohan");
		}
	}

}
