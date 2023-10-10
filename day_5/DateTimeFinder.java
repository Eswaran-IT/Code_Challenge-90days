package day_5;
import java.time.LocalDate;
import java.util.Scanner;

public class DateTimeFinder {
    public static void main(String[] args) {
        String userString;
        System.out.println("To find the day of the week ");
        Scanner getScanner = new Scanner(System.in);
        System.out.println("Enter the date (YYYY-MM-DD):");
        userString = getScanner.nextLine();

        // Check if the input matches the "YYYY-MM-DD" format
        if (isValidDateFormat(userString)) {
            LocalDate date = LocalDate.parse(userString);
            String dayOfWeek = date.getDayOfWeek().toString();
            System.out.println("Day of the week: " + dayOfWeek);
        } else {
            System.out.println("Invalid date format. Please use the format YYYY-MM-DD.");
        }

        getScanner.close();
    }

    // Function to check if the input matches the "YYYY-MM-DD" format
    private static boolean isValidDateFormat(String dateStr) {
        return dateStr.matches("\\d{4}-\\d{2}-\\d{2}");
    }
}
