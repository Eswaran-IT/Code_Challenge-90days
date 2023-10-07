package day_2;

import java.util.Scanner;

public class Adddigits {
	public static void main(String[] args) {
        int number, result;
        Scanner getScanner = new Scanner(System.in);
        System.out.println("Sum of digits of a number");
        System.out.println("Enter a number:");
        number = getScanner.nextInt();
        result = finder(number);
        System.out.println("Sum of digits: " + result);
        getScanner.close();
    }

    public static int finder(int num) {
        int add = 0;
        String dataString = Integer.toString(num);
        char[] digits = dataString.toCharArray();
        for (char c : digits) {
            int digit = Character.getNumericValue(c);
            add += digit;
        }
        return add;
    }
    
}
