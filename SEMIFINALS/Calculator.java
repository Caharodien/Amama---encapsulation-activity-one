import java.util.Scanner;

public class Calculator{
public static void main(String[] args) {
   Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        System.out.println("Select an operation:");
        System.out.println("1.) Addition");
        System.out.println("2.) Subtraction");
        System.out.println("3.) Multiplication");

        int choice = scanner.nextInt();

        double result = 0.0;

        switch (choice) {
            case 1:
                result = num1 + num2;
                System.out.println("Result: " + num1 + " + " + num2 + " = " + result);
                break;
            case 2:
                result = num1 - num2;
                System.out.println("Result: " + num1 + " - " + num2 + " = " + result);
                break;
            case 3:
                result = num1 * num2;
                System.out.println("Result: " + num1 + " * " + num2 + " = " + result);
                break;
            default:
                System.out.println("Invalid choice");
        }

        scanner.close();
    }
}
