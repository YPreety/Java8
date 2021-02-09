package FunctionalInterfaces;

import java.util.function.Predicate;

public class PredicateInterfaceExample2 {

	public static void main(String[] args) {
		// Using Predicate interface
		Predicate<Integer> predicate = PredicateInterfaceExample2::checkAge;
		// Calling Predicate method
		boolean result = predicate.test(25);
		System.out.println(result);

	}

	static Boolean checkAge(int age) {
		if (age > 17)
			return true;
		else
			return false;
	}

}
