package day_1;

import java.util.*;

public class Palindrome {

    public static void main(String[] args) {
        System.out.println("Palindrome");
        System.out.println("Enter the String");
        Scanner getScanner = new Scanner(System.in);
        String nameString = getScanner.nextLine();
        nameString = nameString.trim().toLowerCase();
        System.out.println(nameString);
        int j = 0;
        char[] arr = nameString.toCharArray();
        char[] arr1 = new char[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            arr1[j] = arr[i];
            j++;
        }
        System.out.println(arr1);
        String nameString1 = new String(arr1);
        
        // Use equals() method to compare strings, not ==
        if (nameString.equals(nameString1)) {
            System.out.println("Palindrome!!");
        } else {
            System.out.println("Not a Palindrome!!");
        }

        getScanner.close();
    }
}
