package FunctionalInterfaces;

@FunctionalInterface
interface sayable {
	void say(String msg);
}

public class FunctionalInterfaceExample1 {

	public static void main(String[] args) {
		FunctionalInterfaceExample1 fie = new FunctionalInterfaceExample1();
		fie.say("Hello there");

	}

	public void say(String msg) {
		System.out.println(msg);
	}

}
