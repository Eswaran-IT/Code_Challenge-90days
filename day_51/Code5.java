package day_51;

public class Code5 {
public static void main(String[] args) {
	System.out.println("GET KNOWN THE MAX AND MIN OF DATA VALUES");
    // Integer Types
    System.out.println("Min and Max values for integer types:");
    System.out.println("byte: " + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE);
    System.out.println("short: " + Short.MIN_VALUE + " to " + Short.MAX_VALUE);
    System.out.println("int: " + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE);
    System.out.println("long: " + Long.MIN_VALUE + " to " + Long.MAX_VALUE);

    // Floating-Point Types
    System.out.println("\nMin and Max values for floating-point types:");
    System.out.println("float: " + Float.MIN_VALUE + " to " + Float.MAX_VALUE);
    System.out.println("double: " + Double.MIN_VALUE + " to " + Double.MAX_VALUE);

    // Character Type
    System.out.println("\nMin and Max values for char:");
    System.out.println("char: " + (int) Character.MIN_VALUE + " to " + (int) Character.MAX_VALUE);

    // Boolean Type
    System.out.println("\nValues for boolean:");
    System.out.println("boolean: Only two possible values - true or false");

}
}
