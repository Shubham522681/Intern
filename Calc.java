package Shubha;
import java.util.Scanner;
public class Calc {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        System.out.println("Basic Calculator");
	        System.out.println("Enter two numbers:");

	        System.out.print("Number 1: ");
	        double num1 = scanner.nextDouble();

	        System.out.print("Number 2: ");
	        double num2 = scanner.nextDouble();

	        System.out.println("Choose an operation:");
	        System.out.println("1. Addition");
	        System.out.println("2. Subtraction");
	        System.out.println("3. Multiplication");
	        System.out.println("4. Division");

	        int choice = scanner.nextInt();
	        double result = 0;

	        switch (choice) {
	            case 1:
	                result = num1 + num2;
	                break;
	            case 2:
	                result = num1 - num2;
	                break;
	            case 3:
	                result = num1 * num2;
	                break;
	            case 4:
	                if (num2 != 0) {
	                    result = num1 / num2;
	                } else {
	                    System.out.println("Cannot divide by zero!");
	                    return;
	                }
	                break;
	            default:
	                System.out.println("Invalid choice!");
	                return;
	        }

	        System.out.println("Result: " + result);
	    }

	}

