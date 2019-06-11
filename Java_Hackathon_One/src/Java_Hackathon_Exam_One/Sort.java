//Given an array of integers, sort the integer values

package Java_Hackathon_Exam_One;

import java.util.Scanner;

public class Sort {
	
	public static void sortInteger(int[] myList) {
		 for (int i = 0; i < myList.length-1; i++) {
			for (int j = 0; j < myList.length-i-1; j++) {
				if( myList[j] > myList[j+1] ) {
					int temp = myList[j];
					myList[j] = myList[j+1];
					myList[j+1] = temp;
				}
			}
		}
		 printArray(myList);
	}
	
	static void printArray(int[] myList) {
		for (int i = 0; i < myList.length; i++) {
			System.out.print(myList[i] + " ");
		} System.out.println();
	}
	

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter the length of the array");
		
		int len = scan.nextInt();
		
		System.out.println("enter the the array elements");
		
		int[] myList = new int[len];
		 
		for (int i = 0; i < myList.length; i++) {
			myList[i] = scan.nextInt();
		}
		
		sortInteger(myList);
	}
}
