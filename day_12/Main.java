package day_12;

public class Main {
public static void main(String[] args) {
	     int[] number1 = {2, 4, 6, 7, 9, 10, 12, 14, 15};

	        int evenCount = 0;

	        for (int number : number1) {
	            if (number % 2 == 0) {
	                evenCount++;
	            }
	        }

	        System.out.println("Number of even numbers: " + evenCount);
	    
	

int[] number2 = {2, 4, 6, 7, 9, 10, 11, 14, 15};

int oddCount = 0;

for (int number : number2) {
    if (number % 2 != 0) {
        oddCount++;
    }
}

System.out.println("Number of odd numbers: " + oddCount);

}}
