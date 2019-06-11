//Q20. WJP to find total number of repeated integers, uppercase and lowercase character in the give string

package Java_Hackathon_Exam_One;

import java.util.Scanner;

public class Q20_CountRepeatedIntChar {
	
	static int duplicateCount(String myString) {
		char[] ch = myString.toCharArray();
		int count = 0;
		
		for (int i = 0; i < ch.length; i++) {
			for (int j = 0; j < i; j++) {
				if(ch[i] == ch[j]) {
					count++;
				}
			}	
		}
		return count;
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("enter the the string");

		String myString = scan.nextLine();
		
		System.out.println("Number of duplicate characters are: " +duplicateCount(myString));
	}
}
