package Demo;

import java.util.ArrayList;
import java.util.List;

//we have passed System.out::println method as a static method reference.
public class MethodReferenceExample {

	public static void main(String[] args) {
		List names = new ArrayList();

		names.add("Mahesh");
		names.add("Suresh");
		names.add("Ramesh");
		names.add("Naresh");
		names.add("Kalpesh");

		names.forEach(System.out::println);

	}

}
