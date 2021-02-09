package Stream;

import java.util.ArrayList;
import java.util.List;

public class CountMethodInCollection {

	public static void main(String[] args) {
		List<Product6> productsList = new ArrayList<Product6>();
		// Adding Products
		productsList.add(new Product6(1, "HP Laptop", 25000f));
		productsList.add(new Product6(2, "Dell Laptop", 30000f));
		productsList.add(new Product6(3, "Lenevo Laptop", 28000f));
		productsList.add(new Product6(4, "Sony Laptop", 28000f));
		productsList.add(new Product6(5, "Apple Laptop", 90000f));
		// count number of products based on the filter
		long count = productsList.stream().filter(product -> product.price < 30000).count();
		System.out.println(count);

	}

}

class Product6 {
	int id;
	String name;
	float price;

	public Product6(int id, String name, float price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
}