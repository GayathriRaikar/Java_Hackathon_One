//Given a string print the reverse of the string.(Input: Java Code Output: edoC avaJ)

package Java_Hackathon_Exam_One;

import java.util.Scanner;

public class ReverseString {

	static String reverse(String myString) {

		String[] stringArray = myString.split(" ");
		String reveseWords = "";

		for (int i = stringArray.length-1; i >=0 ; i--) {
			String word = stringArray[i];
			String reverseWord = "";

			for (int j = word.length()-1; j >= 0; j--) {
				reverseWord = reverseWord + word.charAt(j);
			}

			reveseWords = reveseWords + reverseWord + " ";
		}
		return reveseWords;
	}
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("enter the the string");

		String myString = scan.nextLine();

		System.out.println(reverse(myString));
	}
}
