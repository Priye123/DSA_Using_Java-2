//package streams;
//
//import java.util.ArrayList;
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
//
//
//
//public class FilterDemo2 {
//
//	public static void main(String[] args) {
//		
//		List<Product> productList=new ArrayList<>();
//		productList.add(new Product(1, "A", 10000.0));
//		productList.add(new Product(2, "B", 20000.0));
//		productList.add(new Product(3, "C", 30000.0));
//		productList.add(new Product(4, "D", 40000.0));
//		productList.add(new Product(5, "E", 50000.0));
//		
//		//without streams display or return productlist price>=30000
////		ArrayList<Product> a=new ArrayList<>();
////		for(Product p:productList) {
////			if(p.price>=30000) {
////				//System.out.println(p.id+" "+p.name+" "+p.price);
////				a.add(p);
////			}
////		}
////		
////		for(Product p:a) {
////			System.out.println(p.id+" "+p.name+" "+p.price);
////		}
//		
//		//with streams
//		List<Product> list=productList.stream().filter(p->p.price>=30000).collect(Collectors.toList());
////		for(Product p:list) {
////			System.out.println(p.id+" "+p.name+" "+p.price);
////		}
////		list.stream().forEach(pr->System.out.println(pr.id+" "+pr.name+" "+pr.price));
////		
//		productList.stream().filter(p->p.price>=30000).forEach(pr->System.out.println());
//	}
//
//}
