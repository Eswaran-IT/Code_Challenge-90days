package day_3;

import java.util.ArrayList;
import java.util.Scanner;

public class Anagrams {
    public static void main(String[] args) {
        System.out.println("Anagrams code");
        Scanner getScanner = new Scanner(System.in);
        String word1, word2;

        System.out.println("Enter first word");
        word1 = getScanner.nextLine().toLowerCase().trim();

        System.out.println("Enter Second word");
        word2 = getScanner.nextLine().toLowerCase().trim();

        ArrayList<Character> arr1 = new ArrayList<>();
        ArrayList<Character> arr2 = new ArrayList<>();

        // Convert strings to character arrays 
        for (char c : word1.toCharArray()) {
            arr1.add(c);
        }

        for (char c : word2.toCharArray()) {
            arr2.add(c);
        }

        // Sort the ArrayLists
        arr1.sort(null);
        arr2.sort(null);

        // Check if the sorted ArrayLists are equal (anagrams)
        if (arr1.equals(arr2)) {
            System.out.println("Anagram");
        } else {
            System.out.println("No Anagram");
        }

        getScanner.close();
    }
}
