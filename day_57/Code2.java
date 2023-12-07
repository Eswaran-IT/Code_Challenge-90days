package day_57;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class Code2 {
	   public static void main(String[] args) {
	        int[] numbers = {5, 8, 2, 1, 7};
	        int max = Arrays.stream(numbers).max().orElseThrow(NoSuchElementException::new);
	        System.out.println("Maximum number: " + max);
	    }
}
