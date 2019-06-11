//Given a string print the unique words of the string

package Java_Hackathon_Exam_One;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Map.Entry;

public class UniqueWords {
	
	static void uniqueWords(String str) {
		
		String[] myString = str.split(" ");
		
		HashMap<String, Integer> myList = new HashMap<String, Integer>();
		
		for(String word : myString) {
			if (myList.containsKey(word)) {
				
				myList.put(word, myList.get(word)+1);
				
			} else myList.put(word, 1);
		}
		
		System.out.println("Unique words are" );
		for (Entry<String, Integer> entry : myList.entrySet()) {
			String word = entry.getKey();
			int wordCount = entry.getValue();
			
			if (wordCount == 1 ) {
				System.out.print(word+ " ");
			}
		}
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("enter the the string");

		String myString = scan.nextLine();
		
		uniqueWords(myString);
	}
}
