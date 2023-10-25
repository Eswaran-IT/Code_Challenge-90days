package day_18;

public class code4 {
	    public static void main(String[] args) {
	        int intValue = 42;
	        double doubleValue = 3.14159265;
	        String stringValue = "Java";

	        // Integer Formatting
	        System.out.printf("Integer: %d%n", intValue);

	        // Decimal Formatting
	        System.out.printf("Decimal (with 2 decimal places): %.2f%n", doubleValue);

	        // String Formatting
	        System.out.printf("String: %s%n", stringValue);

	        // Width and Padding
	        System.out.printf("Width and Padding (10 characters): %10s%n", stringValue);

	        // Left Justification
	        System.out.printf("Left-Justified (10 characters): %-10s%n", stringValue);

	        // Leading Zeros
	        System.out.printf("Leading Zeros (6 digits): %06d%n", intValue);

	        // Plus Sign and Precision
	        System.out.printf("Plus Sign and Precision (3 decimal places): %+3.3f%n", doubleValue);

	        // Grouping Separator (for large numbers)
	        long largeNumber = 1000000;
	        System.out.printf("Grouping Separator (large number): %,d%n", largeNumber);

	        // Scientific Notation
	        double scientificNumber = 0.000003;
	        System.out.printf("Scientific Notation: %e%n", scientificNumber);
	    }
	

}
