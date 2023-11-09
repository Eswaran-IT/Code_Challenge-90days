package day_32;

	import java.util.Arrays;
	import java.util.List;

public class Code5 {
	    public static void main(String[] args) {
	        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
	        // Using a lambda function
	        int sum = numbers.stream().reduce(0, (x, y) -> x + y);
	        System.out.println("Sum of numbers: " + sum);
	    
	}

}
