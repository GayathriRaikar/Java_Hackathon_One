//Given an array of integers check the Palindrome of the series

package Java_Hackathon_Exam_One;

import java.util.Scanner;

public class NumberPalindrome {
	
	static void checkPalindrome(int[] arr) {
		int invert = 0; 
		
		for (int i = 0; i < arr.length; i++) {
			int temp = arr[i];
			
			while(arr[i] != 0) {
				invert = (invert * 10) + (arr[i] % 10);
				arr[i] = arr[i]/10;
			}
			if( temp == invert) {
				System.out.println(invert+ " is a palindrome");
			}
			invert = 0;
		}
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
		
		checkPalindrome(myList);
	}

}
