//WJP to display number of occurrence of all character

package Java_Hackathon_Exam_One;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class OccuranceOfAllCharacters {

	public static void occuranceOfAllChars(String myString) {

		char[] charList = myString.toCharArray();

		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		for(Character ch : charList) {
			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch)+1);
			} else map.put(ch, 1);
		}

		for (Entry<Character, Integer> entry : map.entrySet()) {
			char chars = entry.getKey();
			int charCount = entry.getValue();
			if (chars != ' ') {
				System.out.println("Char " +chars+ " occured " +charCount+ " times"  );
			}
		}
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("enter the the string");

		String myString = scan.nextLine();

		occuranceOfAllChars(myString);

	}
}
