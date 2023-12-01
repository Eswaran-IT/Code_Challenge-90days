package day_51;

import java.util.*;

enum Months {
    JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER;
}

public class Code4 {
    public static void main(String[] args) {
        Scanner aScanner = new Scanner(System.in);
        String user_InputString = "";
        int position=0;
        System.out.println("Enter the month:\t");
        user_InputString = aScanner.next(); 
        boolean isValidMonth = false;
        
        for (Months s : Months.values()) {
            if (s.name().equalsIgnoreCase(user_InputString)) {
            	position = (s.ordinal())+1;
                isValidMonth = true;
                break;
            }
        }

        if (isValidMonth) {
            System.out.println("Valid month @"+position);
        } else {
            System.out.println("Invalid month");
        }

        aScanner.close();
    }
}
