//write a program to find factorial (Non Recursive) 

package Java_Hackathon_Exam_One;

import java.util.Scanner;

public class FactorialNonRecursive {

	public static int findFactorial(int num) {

		int fact = 1;

		if(num == 1 || num == 2) return num;

		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		return fact;

	}
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a number to find it's factorial");

		int num = scan.nextInt();

		System.out.println("factorial of " +num+ " is = " + findFactorial(num));
	}
}
