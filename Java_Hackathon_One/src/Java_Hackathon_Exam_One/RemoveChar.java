//Write a method that will remove given character from the String

package Java_Hackathon_Exam_One;

import java.util.Scanner;

public class RemoveChar {

	static String removeChar(String str, String ch) {
		
		String result = "";
		
		if (str == null || str.length() <= 0  ) {
			System.out.println("Please enter a valid string");
		} else {
			str = str.toLowerCase();
			String[] str1 = str.split("");

			for (int i = 0; i < str1.length; i++) {

				if(ch.equals(str1[i]) )  {
					result = str.replace(ch,"");

				}
			}
		}
		
		return result;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("enter the the string");

		String str = scan.nextLine();

		System.out.println("enter char to remove");

		String ch = scan.next();

		System.out.println("String after removing given character is " +removeChar(str,ch));
	}
}
