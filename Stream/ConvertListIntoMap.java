package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ConvertListIntoMap {

	public static void main(String[] args) {
		List<Product8> productsList = new ArrayList<Product8>();

		// Adding Products
		productsList.add(new Product8(1, "HP Laptop", 25000f));
		productsList.add(new Product8(2, "Dell Laptop", 30000f));
		productsList.add(new Product8(3, "Lenevo Laptop", 28000f));
		productsList.add(new Product8(4, "Sony Laptop", 28000f));
		productsList.add(new Product8(5, "Apple Laptop", 90000f));

		// Converting Product List into a Map
		Map<Integer, String> productPriceMap = productsList.stream().collect(Collectors.toMap(p -> p.id, p -> p.name));

		System.out.println(productPriceMap);

	}

}

class Product8 {
	int id;
	String name;
	float price;

	public Product8(int id, String name, float price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
}