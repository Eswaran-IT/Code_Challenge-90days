package day_28;

public class Code2 {
	    public static int calculateFibonacci(int n) {
	        if (n <= 0) {
	            return 0;
	        } else if (n == 1) {
	            return 1;
	        }

	        int a = 0;
	        int b = 1;
	        int result = 0;

	        for (int i = 2; i <= n; i++) {
	            result = a + b;
	            a = b;
	            b = result;
	        }

	        return result;
	    }

	    public static void main(String[] args) {
	        int n = 10;
	        int result = calculateFibonacci(n);
	        System.out.println("The " + n + "th Fibonacci number is " + result);
	    
	}

}
