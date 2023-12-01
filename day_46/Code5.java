package day_46;
import java.util.*;
public class Code5 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Enter a string with parentheses:");
	        String userInput = scanner.nextLine();

	        if (isValidParentheses(userInput)) {
	            System.out.println("Valid parentheses!");
	        } else {
	            System.out.println("Invalid parentheses!");
	        }

	        scanner.close();
	    }

	    private static boolean isValidParentheses(String input) {
	        Stack<Character> stack = new Stack<>();

	        for (char c : input.toCharArray()) {
	            if (c == '(' || c == '{' || c == '[') {
	                stack.push(c);
	            } else if (c == ')' || c == '}' || c == ']') {
	                if (stack.isEmpty() || !isMatchingPair(stack.pop(), c)) {
	                    return false;
	                }
	            }
	        }

	        return stack.isEmpty();
	    }

	    private static boolean isMatchingPair(char opening, char closing) {
	        return (opening == '(' && closing == ')') ||
	               (opening == '{' && closing == '}') ||
	               (opening == '[' && closing == ']');
	    }
	}
