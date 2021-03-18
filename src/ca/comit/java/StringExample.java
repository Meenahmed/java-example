package ca.comit.java;

public class StringExample {

	public static void main(String[] args) {
		
		String sampleText = "This is a java course";
		String first = "First";
		String last = "last";
		String Last = "Last";
		String anotherLast = "Last";
		
		System.out.println("The length of the string is " + sampleText.length());
		System.out.println("The character at index 5 of the string is " + sampleText.charAt(5));
		
		System.out.println("String comparison:" + first.compareTo(last)); //-38
		System.out.println("String comparison:" + Last.compareTo(anotherLast)); //0
		System.out.println("String comparison:" + last.compareTo(anotherLast)); // 32
		System.out.println("String comparison:" + last.compareToIgnoreCase(anotherLast)); //0

	}

}
