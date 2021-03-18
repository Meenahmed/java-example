package ca.comit.java;

import java.util.Scanner;

public class PracticeQuestions {

	public static void main(String[] args) {
		
//		Write a java program to read a number from the Console. 
//		Add 10 to that number and check if the result is greater than 100 0r not
		int intValue = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your number");
		intValue =  scanner.nextInt();
		intValue += 10;
		
		if(intValue>100)
		System.out.println("The Value is greater than 100");
		
		else if(intValue == 100)
			System.out.println("The Value is equal to 100");
		
		else
			System.out.println("The Value is less than 100");
   }
}
