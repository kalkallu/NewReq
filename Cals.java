package exceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Cals {
	
		
		public static void main(String args[])
		{
			Scanner sc=new Scanner(System.in);
			try {
			System.out.println("please enter a number");
			int num1=sc.nextInt();
			
			System.out.println("please enter another num");
			int num2=sc.nextInt();
			
			System.out.println("result of div"+(num1/num2));
			  
		}
			
			catch(ArithmeticException e) {
				System.out.println("please do not enter a zero in the denominator ");
			}
			
			catch(InputMismatchException e) {
			System.out.println("only integer values are allowed");
			
			}
			  catch(Exception e) {
					System.out.println("please  enter a valid input");
				}
		}
		

	}





