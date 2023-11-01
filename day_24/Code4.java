package day_24;
import java.util.Stack;
public class Code4 {
public static void main(String[] args) {
	        Stack<Integer> stack = new Stack<>();

	        // Pushing elements onto the stack
	        stack.push(1);
	        stack.push(2);
	        stack.push(3);
	        stack.push(4);

	        System.out.println("Stack: " + stack);

	        // Popping elements from the stack
	        int poppedElement = stack.pop();
	        System.out.println("Popped Element: " + poppedElement);
	        System.out.println("Updated Stack: " + stack);

	        // Peeking at the top element without removing it
	        int topElement = stack.peek();
	        System.out.println("Top Element: " + topElement);
	        System.out.println("Current Stack: " + stack);

	        // Checking if the stack is empty
	        boolean isEmpty = stack.isEmpty();
	        System.out.println("Is the stack empty? " + isEmpty);

	        // Finding the size of the stack
	        int size = stack.size();
	        System.out.println("Size of the stack: " + size);
	    }
	


}
