//Given a string print the reverse of the words string.(Input: Java Code Output: Code Java)

package Java_Hackathon_Exam_One;

import java.util.Scanner;

public class ReverseWordsInSentence {
	
	static String reverse(String myString) {
		
		String[] stringArray = myString.split(" ");
		
		String reveseWords = "";
		
		for (int i = stringArray.length-1; i >= 0 ; i--) {
			reveseWords = reveseWords + stringArray[i] + " ";
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
