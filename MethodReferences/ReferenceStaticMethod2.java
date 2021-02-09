package MethodReferences;

//In the following example, we are using predefined functional interface Runnable to refer static method.

public class ReferenceStaticMethod2 {

	public static void main(String[] args) {
		Thread t2 = new Thread(ReferenceStaticMethod2::ThreadStatus);
		t2.start();

	}

	public static void ThreadStatus() {
		System.out.println("Thread is running...");
	}

}
