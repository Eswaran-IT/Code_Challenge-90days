package day_13;

import java.util.Scanner;

public class VC {

	    public static void main(String[] args) {
	        System.out.println("Count vowels and consonants");
	        int vowels = 0, consonants = 0;
	        Scanner get = new Scanner(System.in);
	        
	        System.out.println("Enter words");
	        String inputString = get.next().toLowerCase();
	        
	        char[] characters = inputString.toCharArray();
	        
	        for (int i = 0; i < characters.length; i++) {
	            char ch = characters[i];
	            
	            if (ch >= 'a' && ch <= 'z') {
	                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
	                    vowels++;
	                } else {
	                    consonants++;
	                }
	            }
	        }
	        
	        System.out.println("Vowels: " + vowels);
	        System.out.println("Consonants: " + consonants);
	        
	        get.close();
	    }
}

