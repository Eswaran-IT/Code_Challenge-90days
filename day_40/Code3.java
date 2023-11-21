package day_40;

public class Code3 {
    public static void main(String[] args) {
        System.out.println("Primitive to String");
        int a = 6;
        float f = 4.5f;
        double d = 34.4443;

        String intString1 = String.valueOf(a);
        String floatString1 = String.valueOf(f);
        String doubleString1 = String.valueOf(d);

        System.out.println("String representation of int: " + intString1);
        System.out.println("String representation of float: " + floatString1);
        System.out.println("String representation of double: " + doubleString1);
    
        System.out.println("String to Primitive");

        // Convert String to int
        String intString = "123";
        int convertedInt = Integer.parseInt(intString);
        System.out.println("Converted int: " + convertedInt);

        // Convert String to float
        String floatString = "45.67";
        float convertedFloat = Float.parseFloat(floatString);
        System.out.println("Converted float: " + convertedFloat);

        // Convert String to double
        String doubleString = "89.123";
        double convertedDouble = Double.parseDouble(doubleString);
        System.out.println("Converted double: " + convertedDouble);

        // Convert String to boolean
        String booleanString = "true";
        boolean convertedBoolean = Boolean.parseBoolean(booleanString);
        System.out.println("Converted boolean: " + convertedBoolean);
   }
}
