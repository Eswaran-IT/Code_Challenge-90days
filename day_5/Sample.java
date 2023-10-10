package day_5;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class Sample {
	public static void main(String[] args) {
        // LocalDate methods
        LocalDate date1 = LocalDate.of(2023, 10, 9); // of
        LocalDate currentDate = LocalDate.now(); // now
        LocalDate parsedDate = LocalDate.parse("2023-10-09"); // parse

        int year = date1.getYear(); // getYear
        int month = date1.getMonthValue(); // getMonthValue
        int day = date1.getDayOfMonth(); // getDayOfMonth
      
        LocalDate futureDate = date1.plusDays(7); // plusDays
        LocalDate pastDate = date1.minusMonths(2); // minusMonths

        boolean isEqual = date1.isEqual(currentDate); // isEqual
        boolean isBefore = date1.isBefore(parsedDate); // isBefore
        boolean isAfter = date1.isAfter(parsedDate); // isAfter

        boolean isLeap = date1.isLeapYear(); // isLeapYear
        int monthLength = date1.lengthOfMonth(); // lengthOfMonth
        int yearLength = date1.lengthOfYear(); // lengthOfYear

        // LocalTime methods
        LocalTime time1 = LocalTime.of(15, 30); // of
        LocalTime currentTime = LocalTime.now(); // now
        LocalTime parsedTime = LocalTime.parse("10:15:30"); // parse

        int hour = time1.getHour(); // getHour
        int minute = time1.getMinute(); // getMinute
        int second = time1.getSecond(); // getSecond
        int nano = time1.getNano(); // getNano

        LocalTime futureTime = time1.plusHours(2); // plusHours
        LocalTime pastTime = time1.minusMinutes(15); // minusMinutes

        boolean isTimeEqual = time1.equals(currentTime); // isEqual
        boolean isTimeBefore = time1.isBefore(parsedTime); // isBefore
        boolean isTimeAfter = time1.isAfter(parsedTime); // isAfter

        // LocalDateTime methods
        LocalDateTime dateTime = LocalDateTime.of(2023, 10, 9, 15, 30); // of
        LocalDateTime currentDateTime = LocalDateTime.now(); // now
        LocalDateTime parsedDateTime = LocalDateTime.parse("2023-10-09T10:15:30"); // parse

        // You can use similar methods as LocalDate and LocalTime for LocalDateTime as well.

        System.out.println("Current Date: " + currentDate);
        System.out.println("Current Time: " + currentTime);
        System.out.println("Current Date and Time: " + currentDateTime);
    }
}
