//Q1.	Consider there is a 3 Boolean variable called a, b, c. Check if at least two out of three Booleans are true

package Java_Hackathon_Exam_One;

import java.util.Scanner;

public class CheckBoolean {
	
	public static int checkBooleanValue(boolean b1, boolean b2, boolean b3 ) {
		int booleanTrueCount = 0;
		
		if(b1 == true && b2 == true && b3 == true) {
			booleanTrueCount = 3;
		} else if(b1 == true && b2 == true || b2 == true && b3 == true || b1 == true && b3 == true ) {
			booleanTrueCount = 2;
		} else if(b1 == true || b2 == true || b3 == true ) {
			booleanTrueCount = 1;
		} else if(b1 == false && b2 == false && b3 == false ) {
			return booleanTrueCount;
			
		} else System.out.println("Invalid input");
			
		return booleanTrueCount;
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); 
		
		System.out.println("Enter first boolean value");
		
		boolean b1 = scan.nextBoolean();		
		//boolean b1 = scan.hasNextBoolean();
		
		System.out.println("Enter second boolean value");
		
		boolean b2 = scan.nextBoolean();
		
		System.out.println("Enter third boolean value");
		
		boolean b3 = scan.nextBoolean();
		
		System.out.println("Number of true boolean count is " +checkBooleanValue(b1,b2,b3));
	}
}
