package Stream;

import java.util.ArrayList;
import java.util.List;

//In the following example, we are fetching and iterating filtered data.

public class StreamFilter1 {

	public static void main(String[] args) {
		List<Product10> productsList = new ArrayList<Product10>();
		// Adding Products
		productsList.add(new Product10(1, "HP Laptop", 25000f));
		productsList.add(new Product10(2, "Dell Laptop", 30000f));
		productsList.add(new Product10(3, "Lenevo Laptop", 28000f));
		productsList.add(new Product10(4, "Sony Laptop", 28000f));
		productsList.add(new Product10(5, "Apple Laptop", 90000f));
		productsList.stream()
		        .filter(p -> p.price > 30000) // filtering price
				.map(pm -> pm.price) // fetching price
				.forEach(System.out::println); // iterating price
	}

}

class Product10 {
	int id;
	String name;
	float price;

	public Product10(int id, String name, float price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
}