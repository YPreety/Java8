package FunctionalInterfaces;

import java.util.function.Function;

public class FunctionInterfaceExample4 {

	public static void main(String[] args) {
		// Function interface referring to a method
		Function<String, String> fun = FunctionInterfaceExample4::show;
		// Calling Function interface method
		System.out.println(fun.apply("Peter"));

	}

	static String show(String message) {
		return "Hello " + message;
	}

}
