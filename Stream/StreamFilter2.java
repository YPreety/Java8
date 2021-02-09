package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//In the following example, we are fetching filtered data as a list.

public class StreamFilter2 {

	public static void main(String[] args) {
		List<Product11> productsList = new ArrayList<Product11>();
		// Adding Products
		productsList.add(new Product11(1, "HP Laptop", 25000f));
		productsList.add(new Product11(2, "Dell Laptop", 30000f));
		productsList.add(new Product11(3, "Lenevo Laptop", 28000f));
		productsList.add(new Product11(4, "Sony Laptop", 28000f));
		productsList.add(new Product11(5, "Apple Laptop", 90000f));
		List<Float> pricesList = productsList.stream()
				.filter(p -> p.price > 30000) // filtering price
				.map(pm -> pm.price) // fetching price
				.collect(Collectors.toList());
		System.out.println(pricesList);

	}

}

class Product11 {
	int id;
	String name;
	float price;

	public Product11(int id, String name, float price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
}