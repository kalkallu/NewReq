package exceptionHandling;

import java.util.Scanner;

public class ThrowDemo {
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter the day");
		String day=sc.nextLine();
		
		if(day.equals("Monday")) {
			throw new ArithmeticException();
			
		}
		else {
			System.out.println("we are heading towAARds");
		}
	}

}
