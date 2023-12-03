package day_53;
import java.util.Stack;

public class Code2 {

    public static int evaluateExpression(String expression) {
        Stack<Integer> operands = new Stack<>();
        Stack<Character> operators = new Stack<>();

        for (char ch : expression.toCharArray()) {
            if (Character.isDigit(ch)) {
                operands.push(Character.getNumericValue(ch));
            } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                while (!operators.isEmpty() && hasPrecedence(ch, operators.peek())) {
                    applyOperator(operands, operators.pop());
                }
                operators.push(ch);
            }
        }

        while (!operators.isEmpty()) {
            applyOperator(operands, operators.pop());
        }

        return operands.pop();
    }

    private static boolean hasPrecedence(char op1, char op2) {
        return (op2 != '(' && op2 != ')') && (getPrecedence(op1) <= getPrecedence(op2));
    }

    private static int getPrecedence(char operator) {
        if (operator == '+' || operator == '-') {
            return 1;
        } else if (operator == '*' || operator == '/') {
            return 2;
        }
        return 0;
    }

    private static void applyOperator(Stack<Integer> operands, char operator) {
        int operand2 = operands.pop();
        int operand1 = operands.pop();

        switch (operator) {
            case '+':
                operands.push(operand1 + operand2);
                break;
            case '-':
                operands.push(operand1 - operand2);
                break;
            case '*':
                operands.push(operand1 * operand2);
                break;
            case '/':
                operands.push(operand1 / operand2);
                break;
        }
    }

    public static void main(String[] args) {
        String expression = "3 + 5 * ( 2 - 8 ) / 4";
        int result = evaluateExpression(expression);
        System.out.println("Result: " + result);
    }
}
