import java.io.*;
import java.lang.*;
import java.lang.Math;
import java.util.Scanner;

public class MyCalculator 
{
	public static void main(String[] args)
	{
		// Stores two numbers
		double num1, num2;

		// Take input from the user
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the numbers: ");

		// Take the inputs of numbers
		num1 = scan.nextDouble();
		num2 = scan.nextDouble();

		System.out.println("Enter the operator (+ or - or * or /): ");

		char operator = sc.next().charAt(0);
		double NUMBER = 0;

		switch (operator) 
		{
			case '+':
				NUMBER = num1 + num2;
				break;

			case '-':
				NUMBER = num1 - num2;
				break;

			case '*':
				NUMBER = num1 * num2;
				break;

			case '/':
				NUMBER = num1 / num2;
				break;

			default:
			
			System.out.println("WRONG INPUT");
		}

		System.out.println("Result: ");
		System.out.println();

		// print the final result
		System.out.println(num1 + " " + operator + " " + num2 + " = " + NUMBER);
	}
}
