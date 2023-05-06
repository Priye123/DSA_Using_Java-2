package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Product{
	int id;
	String name;
	double price;
	
	public Product(int id, String name, double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
		
}

public class FlatMapDemo2 {

	public static void main(String[] args) {
		
		List<Product> productList1=new ArrayList<>();
		productList1.add(new Product(1, "A", 10000.0));
		productList1.add(new Product(2, "B", 20000.0));
		productList1.add(new Product(3, "C", 30000.0));
		productList1.add(new Product(4, "D", 40000.0));
		productList1.add(new Product(5, "E", 50000.0));
		
		List<Product> productList2=new ArrayList<>();
		productList2.add(new Product(6, "F", 60000.0));
		productList2.add(new Product(7, "G", 70000.0));
		productList2.add(new Product(8, "H", 80000.0));
		productList2.add(new Product(9, "I", 90000.0));
		productList2.add(new Product(10, "J", 100000.0));
		
		
		//without streams
//		List<Product> finalProductList=new ArrayList<>();
//		
//		for(Product p:productList1) {
//			finalProductList.add(p);
//		}
//		for(Product p:productList2) {
//			finalProductList.add(p);
//		}
//		
//		for(Product p:finalProductList) {
//			//System.out.println(p.id+" "+p.name+" "+p.price);
//		}
		
		//with streams/flatmap()
		List<List<Product>> finalProductList=Arrays.asList(productList1,productList2);
		List<String> names=finalProductList.stream().flatMap(p->p.stream().filter(pr->pr.price>25000).map(s->s.name)).collect(Collectors.toList());
		System.out.println(names);
	}

}
