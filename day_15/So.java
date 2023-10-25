package day_15;

import java.util.Stack;

public class So {

	    public static boolean isValid(String s) {
	        Stack<Character> stack = new Stack<>();

	        for (char c : s.toCharArray()) {
	            if (c == '(' || c == '{' || c == '[') {
	                stack.push(c);
	            } else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
	                stack.pop();
	            } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
	                stack.pop();
	            } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
	                stack.pop();
	            } else {
	                return false; // Unmatched closing parenthesis or invalid character.
	            }
	        }

	        return stack.isEmpty(); // If the stack is empty, all parentheses are matched.
	    }

	    public static void main(String[] args) {
	        String s = "([{}])";
	        boolean valid = isValid(s);
	        System.out.println("Is the string valid: " + valid);
	    }

}