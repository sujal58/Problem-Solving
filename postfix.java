import java.util.Scanner;
import java.util.*;

public class postfix {
    public static int top = -1;

    public static Map<String, Double> lookup = new HashMap<>();
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a mathematical expression:(Note: add space after every number and operator)");
        String expression = input.nextLine();
        double[] stack = new double[50];

        String operator[] = { "+", "-", "/", "*", "%", "^", "$" };
        expression = expression.strip();
        String splittedExpression[] = expression.split(" +");

        for (int i = 0; i < splittedExpression.length; i++) {
            if (checkOperator(splittedExpression[i], operator)) {
                calculation(splittedExpression[i], stack);
            } else {
                pushNumbers(splittedExpression[i], stack);
            }
        }
        System.out.println(stack[top]);
    }

    public static void pushNumbers(String num, double stack[]) {
        Scanner input = new Scanner(System.in);
        Double value = 0.0;
        try {
            Double number = Double.parseDouble(num);
            stack[++top] = number;
        } catch (NumberFormatException e) {
            if (lookup.get(num) == null) {
                System.out.printf("Enter a value for %s: ", num);
                value = input.nextDouble();
                lookup.put(num, value);
                stack[++top] = value;
                return;
            } else {
                stack[++top] = lookup.get(num);
                return;
            }

        }
    }

    public static void calculation(String operator, double stack[]) {
        if (top > 0) {
            double num1 = stack[top--];
            double num2 = stack[top--];

            switch (operator) {
                case "+":
                    stack[++top] = num1 + num2;
                    break;

                case "-":
                    stack[++top] = num2 - num1;
                    break;

                case "/":
                    stack[++top] = num2 / num1;
                    break;

                case "*":
                    stack[++top] = num1 * num2;
                    break;

                case "%":
                    stack[++top] = num1 % num2;
                    break;

                case "^":
                    stack[++top] = Math.pow(num2, num1);
                    break;

                case "$":
                    stack[++top] = Math.pow(num2, (1 / num1));
                    break;

                default:
                    System.out.println("Unknown operator !!! ");
                    break;
            }
        } else {
            System.out.println(stack[top]);
        }

    }

    public static boolean checkOperator(String expression, String operator[]) {
        boolean isOperator = false;
        for (int j = 0; j < operator.length; j++) {
            if (expression.equals(operator[j])) {
                isOperator = true;
                break;
            }
        }

        return isOperator;
    }

}
