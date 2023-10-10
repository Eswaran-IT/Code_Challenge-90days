package day_5;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Agefinder {
  public static void main(String[] args) {
	  int currentYear=0,age=0,userYear=0;
	System.out.println("Age Finder");
	Scanner getScanner=new Scanner(System.in);
	System.out.println("Enter your birthday");
	userYear=getScanner.nextInt();
	LocalDateTime actorDateTime=LocalDateTime.now();
	currentYear=actorDateTime.getYear();
	age=currentYear-userYear;
	System.out.println("Age is:"+age);
	
	System.out.println("Enter the age to find year:");
	age=getScanner.nextInt();
	age=currentYear-age;
	System.out.println("Year of your Birth:"+age);
	getScanner.close();
  }
}
