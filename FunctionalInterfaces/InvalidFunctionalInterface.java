package FunctionalInterfaces;

interface sayable2 {
	void say(String msg); // abstract method
}

@FunctionalInterface
interface Doable extends sayable {
	// Invalid '@FunctionalInterface' annotation; Doable is not a functional
	// interface
	void doIt();
}

public class InvalidFunctionalInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
