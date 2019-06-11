//Write a program to check palindrome (MalayalaM) for both numbers and string

package Java_Hackathon_Exam_One;

import java.util.Scanner;

public class NumberStringPalindrome {

	static void numberStringPalindrome(int num, String str) {
		int invertNum = 0; 
		int initialNum = num;

		while(num != 0) {
			invertNum = (invertNum * 10) + (num % 10);
			num = num/10;
		}

		if(invertNum == initialNum) {
			System.out.println("Given number " +initialNum+ " is a palindrome");
		} else System.out.println("Given number " +initialNum+ " is not a palindrome");

		
		String invertString ="";
		str =  str.toLowerCase();
		for (int i = str.length()-1; i >= 0; i--) {
			invertString = invertString + str.charAt(i);

		}
		
		if(str.equals(invertString)) {
			System.out.println("Given string " +str+ " is a palindrome");
		} else System.out.println("Given string " +str+ " is not a  palindrome");
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("enter the number");

		int num = scan.nextInt();

		System.out.println("enter the the string");

		String str = scan.next();

		numberStringPalindrome(num,str);
	}
}