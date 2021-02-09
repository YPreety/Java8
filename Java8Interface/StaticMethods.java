package Java8Interface;

public class StaticMethods implements Sayable1 {

	public void sayMore(String msg) { // implementing abstract method
		System.out.println(msg);
	}

	public static void main(String[] args) {
		StaticMethods dm = new StaticMethods();
		dm.say(); // calling default method
		dm.sayMore("Work is worship"); // calling abstract method
		Sayable1.sayLouder("Helloooo..."); // calling static method
	}

}

interface Sayable1 {
	// default method
	default void say() {
		System.out.println("Hello, this is default method");
	}

	// Abstract method
	void sayMore(String msg);

	// static method
	static void sayLouder(String msg) {
		System.out.println(msg);
	}
}