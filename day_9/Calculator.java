package day_9;

public class Calculator {
	    public static void main(String[] args) {
	        double num1 = 10.0;
	        double num2 = 5.0;
	        char operator = '+';
	        double result;

	        switch (operator) {
	            case '+':
	                result = num1 + num2;
	                break;
	            case '-':
	                result = num1 - num2;
	                break;
	            case '*':
	                result = num1 * num2;
	                break;
	            case '/':
	                result = num1 / num2;
	                break;
	            default:
	                System.out.println("Invalid operator");
	                return;
	        }
	        System.out.println("Result: " + result);
	    }
	}
