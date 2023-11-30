package day_50;

	interface ainterface {
	    // Abstract method (to be implemented by implementing classes)
	    void regularMethod(String message);

	    // Default method (provides a default implementation)
	    default void defaultMethod(String message) {
	        System.out.println("Default Method: " + message);
	    }

	    // Static method (can be called on the interface itself, not on instances)
	    static void staticMethod(String message) {
	    	System.out.println("Static Method: " + message);
	    }
	}

	class MyClass implements ainterface {
	    // Implementing the regular method from MyInterface
	    @Override
	    public void regularMethod(String message) {
	        System.out.println("Implemented Regular Method: " + message);
	    }
	}

public class Code3 {
	    public static void main(String[] args) {
	        // Creating an instance of MyClass
	        MyClass myClass = new MyClass();

	        // Calling the regular method (implemented by MyClass)
	        myClass.regularMethod("Hello Regular Method!");

	        // Calling the default method (provided by the interface)
	        myClass.defaultMethod("Hello Default Method!");

	        // Calling the static method (called on the interface itself)
	        ainterface.staticMethod("Hello Static Method!");
	    }
	}
