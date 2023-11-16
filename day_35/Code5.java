package day_35;

	import java.util.ArrayList;
	import java.util.List;
	import java.util.function.Consumer;
	import java.util.function.Function;
	import java.util.function.Predicate;
	import java.util.function.Supplier;

public class Code5 {
public static void main(String[] args) {    // 1. Consumer example
	        List<String> fruits = new ArrayList<>();
	        fruits.add("Apple");
	        fruits.add("Banana");
	        fruits.add("Orange");

	        Consumer<String> printUpperCase = s -> System.out.println("Consumer: " + s.toUpperCase());
	        fruits.forEach(printUpperCase);

	        // 2. Predicate example
	        Predicate<String> startsWithA = s -> s.startsWith("A");

	        System.out.println("Predicate (Starts with A): " + startsWithA.test("Apple"));   // true
	        System.out.println("Predicate (Starts with A): " + startsWithA.test("Banana"));  // false

	        // 3. Function example
	        Function<String, Integer> stringLength = s -> s.length();

	        System.out.println("Function (String Length): " + stringLength.apply("Hello"));  // 5
	        System.out.println("Function (String Length): " + stringLength.apply("Java"));   // 4

	        // 4. Supplier example
	        Supplier<String> greetingSupplier = () -> "Hello, World!";
	        System.out.println("Supplier (Greeting): " + greetingSupplier.get());  // Hello, World!
	    }
	

}
