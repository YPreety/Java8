package MethodReferences;

//In the following example, we are referring non-static methods. You can refer methods by class object and anonymous object.

public class ReferenceInstanceMethod1 {

	public static void main(String[] args) {
		ReferenceInstanceMethod1 methodReference = new ReferenceInstanceMethod1(); 
		// Referring non-static method using reference
		Sayable sayable = methodReference::saySomething;
		// Calling interface method
		sayable.say();
		// Referring non-static method using anonymous object
		Sayable sayable2 = new ReferenceInstanceMethod1()::saySomething; 
		// Calling interface method
		sayable2.say();

	}

	public void saySomething() {
		System.out.println("Hello, this is non-static method.");
	}

}
