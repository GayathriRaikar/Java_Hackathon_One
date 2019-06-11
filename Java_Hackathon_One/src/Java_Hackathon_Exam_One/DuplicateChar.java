// WJP to display duplicate character in string

package Java_Hackathon_Exam_One;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class DuplicateChar {

	static void duplicateChar(String myString) {
		
		char[] charArray = myString.toCharArray();
		
		HashMap<Character, Integer> myList = new HashMap<Character, Integer>();
		
		for(Character ch : charArray) {
			if (myList.containsKey(ch)) {
				
				myList.put(ch, myList.get(ch)+1);
				
			} else myList.put(ch, 1);
		}
		
		for (Entry<Character, Integer> entry : myList.entrySet()) {
			char duplicateChar = entry.getKey();
			int duplicateCharCount = entry.getValue();
			
			if (duplicateCharCount > 1 && duplicateChar != ' ') {
				System.out.println("char " +duplicateChar+ " count is " +duplicateCharCount);
			}
		}
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("enter the the string");

		String myString = scan.nextLine();
		
		duplicateChar(myString);
	}
}
