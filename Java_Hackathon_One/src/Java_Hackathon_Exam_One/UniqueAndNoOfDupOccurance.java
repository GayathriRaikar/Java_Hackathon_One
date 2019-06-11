//Given an array prints the unique numbers and also print the number of occurrences of duplicate numbers.

package Java_Hackathon_Exam_One;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Map.Entry;

public class UniqueAndNoOfDupOccurance {

	static void uniqueAndNoOfDupOccurance(ArrayList<Integer> myList) {

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for(Integer num : myList) {
			if (map.containsKey(num)) {

				map.put(num, map.get(num)+1);

			} else map.put(num, 1);
		}

		for (Entry<Integer, Integer> entry : map.entrySet()) {
			int num = entry.getKey();
			int numCount = entry.getValue();

			if (numCount == 1 ) {
				System.out.println("Number " +num+ " is unique");
			} else System.out.println("Number " +num+ " occured " +numCount+ " times");
		}
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		try {
			System.out.println("Enter the array length");

			int length = scan.nextInt();

			ArrayList<Integer> myList = new ArrayList<Integer>();

			System.out.println("Enter the array elements");
			while(length >= 1) {
				myList.add(scan.nextInt());
				length--;
			}

			uniqueAndNoOfDupOccurance(myList);

		} catch (InputMismatchException e) {
			System.out.println("Please enter integer value: " +e.getMessage());
		}
	}
}
