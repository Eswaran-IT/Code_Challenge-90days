package day_55;

	import java.util.Arrays;
	import java.util.List;

public class Code3 {
	    public static void main(String[] args) {
	        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
	        System.out.println("Printing elements using lambda expression:");
	        numbers.forEach(number -> System.out.println(number));
            System.out.println("\n method reference:");
	        numbers.forEach(System.out::println);
	        System.out.println("\nlambda expression:");
	        numbers.forEach(number -> System.out.println(number * 2));
	        System.out.println("\nDoubling each element:");
	        numbers.forEach(number -> System.out.println(number * 2));
	    
	}

}
