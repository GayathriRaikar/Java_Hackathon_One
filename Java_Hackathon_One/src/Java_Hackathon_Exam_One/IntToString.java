// WJP to convert string to int

package Java_Hackathon_Exam_One;

import java.util.Scanner;

public class IntToString {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the integer value: ");
		int intValue = scan.nextInt();
		
		String stringValue = String.valueOf(intValue);
		
		System.out.println("String value of the integer is " +stringValue);
	}
}
