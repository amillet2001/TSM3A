
import java.io.*;
import java.lang.*;
import java.lang.Math;
import java.util.Scanner;
 
public class MEKUSCALC {
    public static void main(String[] args)
    {
        double num1, num2;
 
        Scanner sc = new Scanner(System.in);
 
        System.out.println("Enter the numbers:");
 
        System.out.println("1st Number: ");
        num1 = sc.nextDouble();
        System.out.println("2nd Number: ");
        num2 = sc.nextDouble();
 
        System.out.println("Enter the operator (+,-,*,/):");
 
        char op = sc.next().charAt(0);
        double o = 0;
 
        switch (op) {
        case '+':
            o = num1 + num2;
            break;
 
        case '-':
            o = num1 - num2;
            break;
        case '*':
            o = num1 * num2;
            break;
 
        case '/':
            o = num1 / num2;
            break;
 
        default:
            System.out.println("You enter wrong input");
        }
 
        System.out.println("The final result:");
        System.out.println();

        System.out.println(num1 + " " + op + " " + num2
                           + " = " + o);
    }
}