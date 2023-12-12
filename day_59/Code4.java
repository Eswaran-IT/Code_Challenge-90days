package day_59;

public class Code4 {
	    public static void main(String[] args) {
	        int number = 153;
	        int originalNumber = number;
	        int n = 0;
	        //counting digits
	        while (originalNumber != 0) {
	            originalNumber /= 10;
	            ++n;
	        }
	        
	        originalNumber = number;
	        int result = 0;
	        while (originalNumber != 0) {
	            int remainder = originalNumber % 10;
	            System.out.println(result);
	            result += Math.pow(remainder, n);
	            System.out.println(result);
	            originalNumber /= 10;
	        }
	        if (result == number) {
	            System.out.println(number + " is an Armstrong number.");
	        } else {
	            System.out.println(number + " is not an Armstrong number.");
	        }
	    }
	}
