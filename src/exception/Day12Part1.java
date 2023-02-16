package exception;

public class Day12Part1 {

	public static void main(String[] args) {
		//normal flow
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		try {
			System.out.println(10/0);
		}catch(Exception e) {
			System.out.println(e);
		}
		//System.out.println(10/0);//disturbing element Program terminately abnormally
		System.out.println(6);
		System.out.println(7);
		System.out.println(8);
		System.out.println(9);
		
		//int a="Sammer";
		
//		for(int i=50;i>=0;i++) {
//			System.out.println("Sameer"); // It will give overflow error
//		}
		
	}
}
