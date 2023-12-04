package day_55;


public class Code4 {
	    public static void main(String[] args) {
	        int number = 12345;
	        int sum = findSumOfDigits(number);
	        System.out.println("Sum of digits in " + number + ": " + sum);
	    }

	    private static int findSumOfDigits(int number) {
	        int sum = 0;
	        while (number > 0) {
	            sum += number % 10;
	            number /= 10;
	        }
	        return sum;
	    }
	}
