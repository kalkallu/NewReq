package exceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Printer {
	
	public static void main(String args[]) throws FileNotFoundException {
		File file=new File("C:\\Users\\kalkallu\\networking.txt");
		PrintWriter pw=new PrintWriter(file);
		pw.print("hello!it is tuesday today");
		pw.close();
		
		
		
		
	}

}
