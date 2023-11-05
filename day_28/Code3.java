package day_28;

public class Code3 {
	    public static void main(String[] args) {
	        int n = 10; // The number of Fibonacci numbers to generate
	        long[] fibonacciSeries = new long[n];

	        // Base cases
	        fibonacciSeries[0] = 0;
	        fibonacciSeries[1] = 1;

	        // Generate the Fibonacci series
	        for (int i = 2; i < n; i++) {
	            fibonacciSeries[i] = fibonacciSeries[i - 1] + fibonacciSeries[i - 2];
	        }

	        // Print the Fibonacci series
	        System.out.print("Fibonacci Series: ");
	        for (long number : fibonacciSeries) {
	            System.out.print(number + " ");
	        
	    }
	}

}
