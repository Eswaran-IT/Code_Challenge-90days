package day_7;

import java.util.Scanner;

public class CountVowels {
    public static void main(String[] args) {
        System.out.println("Count the vowels");
        String wordString;
        char vowel[] = {'a', 'e', 'i', 'o', 'u'};
        Scanner getScanner = new Scanner(System.in);
        System.out.println("Enter the string");
        wordString = getScanner.next().toLowerCase();
        int size = wordString.length();
        int count = 0;

        for (int i = 0; i < size; i++) {
            char data = wordString.charAt(i);
            if (containsVowel(data, vowel)) {
                count++;
            }
        }

        System.out.println("Vowels count: " + count);
        getScanner.close();
    }

    // Function to check if a character is a vowel
    public static boolean containsVowel(char c, char[] vowels) {
        for (char vowel : vowels) {
            if (c == vowel) {
                return true;
            }
        }
        return false;
    }
}
