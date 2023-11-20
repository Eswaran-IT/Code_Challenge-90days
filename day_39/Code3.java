package day_39;

public class Code3 {
	    public static int mySqrt(int x) {
	        if (x == 0) {
	            return 0;
	        }
	        long sqrt = x; 
/*
 * x=4
 * 4*4=16
 * 16>4
 * 16+4=(20/4)/2
 * 2
 * */
	        while (sqrt * sqrt > x) {
	            sqrt = (sqrt + x / sqrt) / 2;
	        }

	        return (int) sqrt;
	    }

	    public static void main(String[] args) {
	        int x = 64;
	        int result = mySqrt(x);
	        System.out.println(272/16);
	        System.out.println("The square root of " + x + " is: " + result);
	    
	}

}
