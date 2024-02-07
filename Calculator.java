import java.util.Scanner;

         public class Calculator {

		 public static void main(String [] args){
		 Scanner n=new Scanner(System.in);

		 int no1,no2;
		 char op;


		 System.out.print("Enter your First Number: ");
		 no1 = n.nextInt();
		 System.out.print("Enter your Operation: ");
		 op = n.next().charAt(0);
		 System.out.print("Enter your Second Number: ");
		 no2 = n.nextInt();

		 if(op == '+'){
		 System.out.print("Sum= " +(no1+no2));
		 }else if(op == '-'){
		 System.out.print("Difference= " +(no1-no2));
		 }else if(op == '*'){
		 System.out.print("Product= " +(no1*no2));
		 }else if(op == '/'){
		 System.out.print("Quotient= " +(no1/no2));
		 }else if(op == '%'){
		 System.out.print("Remainder= " +(no1%no2));
		 }else{
			 System.out.println("Error");
		 }






		 //System.out.print(no1+op+no2);







		 }



}