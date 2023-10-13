package day_8;

public class Unicode {
public static void main(String[] args) {
	System.out.println("Ascii Code");
	for (char ch = 'a'; ch <= 'z'; ch++) {
        System.out.print(ch + " ");
    }

    System.out.println(); // Add a newline for clarity

    for (char ch = 'A'; ch <= 'Z'; ch++) {
        System.out.print(ch + " ");
    
    }
    char myChar = 'b';

    if (myChar >= 'a' && myChar <= 'z') {
        System.out.println("The character is in the range 'a' to 'z'.");
    } else {
        System.out.println("The character is not in the range 'a' to 'z'.");
    }
}
}
