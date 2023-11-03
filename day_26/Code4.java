package day_26;
import java.util.Arrays;

public class Code4 {

	    public static void main(String[] args) {
	        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

	        // Example 1: Map operation to double each number
	        Arrays.stream(numbers)
	            .map(n -> n * 2)
	            .forEach(System.out::println);

	        // Example 2: Filter operation to get even numbers
	        Arrays.stream(numbers)
	            .filter(n -> n % 2 == 0)
	            .forEach(System.out::println);

	        // Example 3: Reduce operation to find the sum
	        int sum = Arrays.stream(numbers)
	            .reduce(0, (a, b) -> a + b);
	        System.out.println("Sum: " + sum);
	    
	}

}
