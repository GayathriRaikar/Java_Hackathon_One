//Q28. WJP to find factorial of a number using recursion
//
package Java_Hackathon_Exam_One;

import java.util.Scanner;

public class FactorialRecursion {
	
	public static int factRecursion(int num) {

		int output;
		
		if (num == 1) return 1;
		
		output = (factRecursion(num-1)) * num;
		
		return output;
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the number");

		int num = scan.nextInt();
		
		System.out.println("Factorial of " +num+ " is " +factRecursion(num));
	}
}
