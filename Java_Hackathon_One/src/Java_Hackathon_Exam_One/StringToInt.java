package Java_Hackathon_Exam_One;

import java.util.Scanner;

public class StringToInt {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the string: ");
		String str = scan.next();
		
		int intValue = Integer.parseInt(str);
		
		System.out.println("Integer value of the string is " +intValue);

	}
}
