package day_37;

	import java.util.function.Consumer;
	import java.util.function.Predicate;
	import java.util.function.Function;
	import java.util.function.Supplier;

public class Code {
	    public static void main(String[] args) {
	        // Consumer: Accepts an argument, performs an action, and returns nothing
	        Consumer<String> stringConsumer = s -> System.out.println("Consumed: " + s);
	        stringConsumer.accept("Hello, Consumer!");

	        // Predicate: Tests a condition and returns a boolean
	        Predicate<Integer> isEven = n -> n % 2 == 0;
	        System.out.println("Is 10 even? " + isEven.test(10));

	        // Function: Takes an argument, performs a transformation, and returns a result
	        Function<String, Integer> stringLengthFunction = String::length;
	        System.out.println("Length of 'Java': " + stringLengthFunction.apply("Java"));

	        // Supplier: Provides a result without taking any input
	        Supplier<Double> randomDoubleSupplier = Math::random;
	        System.out.println("Random double: " + randomDoubleSupplier.get());
	    }
	

}
