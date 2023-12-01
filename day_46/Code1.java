package day_46;

public class Code1 {
public static void main(String[] args) {
	System.out.println("Find max and second max data");
	System.out.println(Integer.MIN_VALUE);
	System.out.println(Integer.MIN_VALUE);
	int[] array = {5, 8, 2, 10, 7, 1};
	//If same value exists there is no second max value
	//int[] array = {5, 5, 5, 5, 5, 5};

    if (array.length < 2) 
    {
	            System.err.println("Not enough data to find");
	            
    } else
    {
	       
	      int max = Integer.MIN_VALUE;
	      int secondMax = Integer.MIN_VALUE;
	        for (int num : array) {
	            if (num > max) {
	                secondMax = max;
	                max = num;
	            } else if (num > secondMax && num != max) {
	                secondMax = num;
	            }
	        }

	        if (secondMax == Integer.MIN_VALUE) {
	            System.out.println("There is no second maximum element.");
	        } else {
	            System.out.println("Max data: " + max);
	            System.out.println("Second Max daata: " + secondMax);
}}}}
