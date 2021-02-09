package MethodReferences;

///In the following example, we have defined a functional interface and referring a static method to it's functional method say().
interface Sayable {
	void say();
}

public class ReferenceStaticMethod1 {

	public static void main(String[] args) {
		// Referring static method
		Sayable sayable = ReferenceStaticMethod1::saySomething;
		// Calling interface method
		sayable.say();

	}

	public static void saySomething() {
		System.out.println("Hello, this is static method.");
	}

}
