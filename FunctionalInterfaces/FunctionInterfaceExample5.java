package FunctionalInterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionInterfaceExample5 {

	public static void main(String[] args) {
		// Creating a list and adding values
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		// Referring addList() method
		Function<List<Integer>, Integer> fun = FunctionInterfaceExample5::addList;
		// Calling Function interface method
		int result = fun.apply(list);
		System.out.println("Sum of list values: " + result);

	}

	static Integer addList(List<Integer> list) {
		return list.stream().mapToInt(Integer::intValue).sum();
	}

}
