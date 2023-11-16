package day_35;

import java.util.ArrayDeque;


public class Code3 {
public static void main(String[] args) {  
	ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();

    // Insert 10 data points
    for (int i = 1; i <= 10; i++) {
        arrayDeque.addLast(i);
    }

    // Display the deque
    System.out.println("Initial ArrayDeque: " + arrayDeque);

    // Adding elements
    arrayDeque.addFirst(0); // Add at the front
    arrayDeque.addLast(11); // Add at the end

    // Display the deque after adding elements
    System.out.println("ArrayDeque after adding elements: " + arrayDeque);

    // Removing elements
    int removedFirst = arrayDeque.removeFirst(); // Remove from the front
    int removedLast = arrayDeque.removeLast();   // Remove from the end

    // Display the deque after removing elements
    System.out.println("ArrayDeque after removing elements: " + arrayDeque);
    System.out.println("Removed First: " + removedFirst);
    System.out.println("Removed Last: " + removedLast);

    // Check if the deque contains an element
    boolean containsElement = arrayDeque.contains(5);
    System.out.println("Contains '5': " + containsElement);
}
}