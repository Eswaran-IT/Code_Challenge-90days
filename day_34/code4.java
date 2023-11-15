package day_34;
import java.util.Vector;
import java.util.Enumeration;

public class code4 {
    public static void main(String[] args) {
        // Creating a Vector
        Vector<String> vector = new Vector<>();

        // Adding elements to the Vector
        vector.add("Apple");
        vector.add("Banana");
        vector.add("Orange");

         System.out.println("Vector: " + vector);

        // Add element by  index
        vector.add(1, "Grapes");
        vector.add(3, "Kiwi");

        // Updated vector
        System.out.println("Modified Vector after adding elements: " + vector);

        // Removing elements by value
        vector.remove("Banana");

        // Display after deletion
        System.out.println("Vector after removing 'Banana': " + vector);

        // Remove element by index
        vector.removeElementAt(2);

        // Displaying by index
        System.out.println("Vector after removing element at index 2: " + vector);

        //  Vector contains
        boolean containsElement = vector.contains("Grapes");
        System.out.println("Does Vector contain 'Grapes'? " + containsElement);

        // size of Vector
        int size = vector.size();
        System.out.println("Size of Vector: " + size);

        // Enumeration ->(legacy)
        System.out.println("Iterating using Enumeration:");
        Enumeration<String> enumeration = vector.elements();
        while (enumeration.hasMoreElements()) {
            System.out.print(enumeration.nextElement() + " ");
        }
        System.out.println();
    }
}
