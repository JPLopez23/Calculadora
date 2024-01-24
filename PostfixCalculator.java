package PostfixCalculator;

import PostfixCalculator.ADT.Calculator;

public class PostfixCalculator implements Calculator {

    @Override
    public int evaluatePostfixExpression(String expression) {
        Stack<Integer> stack = new VectorStack<>();

        for (String token : expression.split("\\s+")) {
            if (token.matches("\\d")) { // Es un número
                stack.push(Integer.parseInt(token));
            } else { // Es un operador
                int operand2 = stack.pop();
                int operand1 = stack.pop();
                int result = applyOperation(token, operand1, operand2);
                stack.push(result);
            }
        }
        return stack.pop();
    }

    private int applyOperation(String operator, int operand1, int operand2) {
        switch (operator) {
            case "+": return operand1 + operand2;
            case "-": return operand1 - operand2;
            case "*": return operand1 * operand2;
            case "/": 
                if (operand2 == 0) throw new ArithmeticException("Division by zero");
                return operand1 / operand2;
            default: throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }
}
