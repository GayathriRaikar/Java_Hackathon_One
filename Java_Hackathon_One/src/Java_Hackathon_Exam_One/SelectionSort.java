//WJP to perform ascending order Selection sort

package Java_Hackathon_Exam_One;

import java.util.Scanner;

public class SelectionSort {
	
	static void sort(int[] arr) {
		
		for (int i = 0; i < arr.length-1; i++) {
			int min = i;
			for (int j = i+1; j < arr.length; j++) {
				if (arr[j] < arr[min] ) {
					min = j;
				}
			}
			int temp = arr[min];
			arr[min] = arr[i] ;
			arr[i] = temp;
			
		}
		printArray(arr);
	}
	
	static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
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
		sort(myList);
	}
}
