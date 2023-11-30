package day_50;
	import java.util.Arrays;
	import java.util.List;
	import java.util.Optional;
	import java.util.stream.Collectors;

public class Code5 {
	    public static void main(String[] args) {
	        // Creating a list of strings
	        List<String> fruits = Arrays.asList("apple", "banana", "orange", "kiwi", "strawberry");

	        // Creating a stream from the list
	        fruits.stream()
	                // Filtering elements that start with 'a'
	                .filter(fruit -> fruit.startsWith("a"))
	                // Mapping each element to its length
	                .map(String::length)
	                // Sorting the lengths in ascending order
	                .sorted()
	                // Removing duplicates
	                .distinct()
	                // Limiting the stream to at most 2 elements
	                .limit(2)
	                // Skipping the first element
	                .skip(1)
	                // Performing a terminal operation: collecting to a list
	                .collect(Collectors.toList())
	                // Printing the collected list
	                .forEach(System.out::println);

	        // Another example: finding the first element starting with 's'
	        Optional<String> result = fruits.stream()
	                .filter(fruit -> fruit.startsWith("s"))
	                .findFirst();

	        // Printing the result if present
	        result.ifPresent(System.out::println);
	    
	}

}
