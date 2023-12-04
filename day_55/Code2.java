package day_55;

public class Code2 {

	    public static void main(String[] args) {
	        int number = 123456;
	        separateUnitPlace(number);
	    }

	    private static void separateUnitPlace(int number) {
	        int temp = number;
	        while (temp > 0) {
	            int digit = temp % 10; 
	            System.out.println("Unit place of " + temp + ": " + digit);
	            System.out.println(temp);
	            temp = temp / 10;
	            System.out.println(temp);
	        
	        }}
	}
