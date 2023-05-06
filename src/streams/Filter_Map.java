//package streams;
//
//import java.util.Arrays;
//import java.util.List;
//import java.util.stream.Collectors;
//
//class Product{
//	int id;
//	String name;
//	double price;
//	
//	public Product(int id, String name, double price) {
//		this.id = id;
//		this.name = name;
//		this.price = price;
//	}
//		
//}
//
//public class Filter_Map {
//
//	public static void main(String[] args) {
//		
//		List<Product> products=Arrays.asList(
//				new Product(1, "A", 10000.0),
//				new Product(2, "B", 20000.0),
//				new Product(3, "C", 30000.0),
//				new Product(4, "D", 40000.0),
//				new Product(5, "E", 50000.0)
//				);
//		
//		//combination of filter and map
//		//price>25000 usko price me 10% increment krna h
//		List<Double> IncrementedData=products.stream().filter(p->p.price>25000).map(p->p.price*0.1+p.price).collect(Collectors.toList());
//		System.out.println(IncrementedData);
//	}
//
//}
