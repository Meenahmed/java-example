package ca.comit.java;

public class BasicJavaExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int y = 5, z=2;
       
       String first_name = "FIRSTNAME";  // variable declaration
       String lastName = "LASTNAME";    // variable declaration
       
       final String NAME = "TEST";    // constant declaration
        
       System.out.println("The result of addition is " + (y + z));
       System.out.println("The result of multiplication is " + (y * z));
       
       int i = 10;
       System.out.println("value of i=" + i);
       i +=15;  // i = i + 15
       System.out.println("value of i=" + i);
       i -=5;   // i = i -5
       System.out.println("value of i=" + i);   // i = 20
       
       i++;  // i = i + 1
       System.out.println("value of i=" + i);  // i = 21
       i--;  // i = i -1
       System.out.println("value of i=" + i);  // i = 20
       
       
	}

}
