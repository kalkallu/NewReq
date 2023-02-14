package exceptionHandling;

import java.util.Scanner;

public class calculator {
	
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
		  catch(Exception e) {
				System.out.println("please neter a valid input");
			}
	}
	

}


