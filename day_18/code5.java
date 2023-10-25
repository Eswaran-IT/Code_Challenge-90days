package day_18;

import java.util.Scanner;

public class code5 {
	    public static void main(String[] args) {
	        // Create a Scanner object for user input
	        Scanner scanner = new Scanner(System.in);

	        // Input the year
	        System.out.print("Enter a year: ");
	        int year = scanner.nextInt();

	        // Calculate the number of days, weeks, and months
	        int daysInYear = isLeapYear(year) ? 366 : 365;
	        int weeksInYear = daysInYear / 7;
	        int monthsInYear = 12;

	        // Display the results
	        System.out.println("Number of days in the year: " + daysInYear);
	        System.out.println("Number of weeks in the year: " + weeksInYear);
	        System.out.println("Number of months in the year: " + monthsInYear);

	        // Close the scanner
	        scanner.close();
	    }

	    // Function to check if a year is a leap year
	    public static boolean isLeapYear(int year) {
	        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
	            return true;
	        }
	        return false;
	    
	}
	    
	    

}
