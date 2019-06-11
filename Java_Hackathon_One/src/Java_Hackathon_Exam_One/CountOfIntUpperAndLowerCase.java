//WJP to find total number of integers, uppercase and lowercase character in the give string

package Java_Hackathon_Exam_One;

import java.util.Scanner;

public class CountOfIntUpperAndLowerCase {
	
	static void count(String myString) {
		
		int number = 0, upper = 0, lower = 0;
		
		char[] list = myString.toCharArray();
		
		for (int i = 0; i < list.length; i++) {
			char ch = list[i];
			
			if (Character.isDigit(ch)) {
				number++;
			} else if (Character.isUpperCase(ch)) {
				upper++;
			} else if (Character.isLowerCase(ch)) {
				lower++;
			}
		}
		
		System.out.println("Number of integers in the string = " +number );
		System.out.println("Number of upper case letters in the string = " +upper );
		System.out.println("Number of lower case letters in the string = " +lower );
		
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("enter the the string");

		String myString = scan.nextLine();
		
		count(myString);
	}
}
