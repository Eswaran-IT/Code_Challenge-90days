package day_38;

public class Code1 {
	    public boolean isValid(String s) {
	        char[] stack = new char[s.length()];
	        int top = -1; // Stack pointer

	        for (char c : s.toCharArray()) {
	            if (c == '(' || c == '{' || c == '[') {
	                // Opening bracket, push onto the stack
	                stack[++top] = c;
	            } else if (top == -1 ||
	                       (c == ')' && stack[top] != '(') ||
	                       (c == '}' && stack[top] != '{') ||
	                       (c == ']' && stack[top] != '[')) {
	                // Closing bracket, but no matching opening bracket or mismatch
	                return false;
	            } else {
	                // Matching pair, pop from the stack
	                top--;
	            }
	        }

	        // Check if the stack is empty after processing all characters
	        return top == -1;
	    }
	

}

