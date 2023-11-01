package day_24;

import java.time.LocalDate;
import java.time.YearMonth;
import java.util.Date;

public class Code2 {
	    public static void main(String[] args) {
	    	Date currentDate = new Date();
	        System.out.println(currentDate);
	        //java 8
	        LocalDate date = LocalDate.now(); 
	        System.out.println(date);
	        int year = 2023; // Change the year as needed
	        int month = 5; // Change the month (1-12) as needed

	        YearMonth yearMonth = YearMonth.of(year, month);

	        // Get the number of days in the month
	        int daysInMonth = yearMonth.lengthOfMonth();

	        // Get the number of weeks in the month
	        int weeksInMonth = yearMonth.atEndOfMonth().getDayOfWeek().getValue();
	        System.out.println("Number of Days in the Month: " + daysInMonth);
	        System.out.println("Number of Weeks in the Month: " + weeksInMonth);
	        System.out.println("Number of the Month in the Year: " + month);
	  
	    	}

	        
	

	

}
