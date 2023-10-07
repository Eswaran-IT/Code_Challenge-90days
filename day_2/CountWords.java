package day_2;

import java.util.Scanner;

public class CountWords {
  public static void main(String[] args) {
	  String wordString;
	  int i=0;
	System.out.println("Count the words");
	Scanner getScanner=new Scanner(System.in);
    wordString=getScanner.nextLine();
    String str[]=wordString.split(" ");
    for (int j = 0; j < str.length ; j++) {
		i+=1;
	}
    System.out.println("Count:"+i);
    getScanner.close();
}
}
