package ca.comit.java;

import java.io.Console;
import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		
		String readText = null;
		int intValue = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your text");
		readText =  scanner.next();
		System.out.println("Your entered text is: " + readText);
		
		System.out.println("Enter your number");
		intValue =  scanner.nextInt();
		System.out.println("Your entered text is: " + intValue);
		

	}

}
