import java.util.Scanner;

public class CalculateValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Choose an operator: +, -, *, or /");
        char operator = input.next().charAt(0);

        // ask users to enter numbers
        System.out.println("Enter first number");
         Double num1 = input.nextDouble();

        System.out.println("Enter second number");
        Double num2 = input.nextDouble();
        Double  result = num1 + num2;
                if (operator == '+') {
                    System.out.println(num1 + " + " + num2 + " = " + result);

                }
                else if (operator == '-') {
                    System.out.println(num1 + " - " + num2 + " = " + result);
                }
                else if (operator == '/') {
                    System.out.println(num1 + " / " + num2 + " = " + result);
                }
                else if (operator == '*') {
                    System.out.println(num1 + " * " + num2 + " = " + result);
                }
    }

}

