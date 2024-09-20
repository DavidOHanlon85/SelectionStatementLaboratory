/**
 * 
 */
package labExercises;

import java.util.Scanner;

/**
 * 
 */
public class Exercise2_IfElseStatements_MastersGrading {

	/**
	 * @param for the main method
	 */
	public static void main(String[] args) {
		
		// Instantiate Scanner
		Scanner myScan = new Scanner(System.in);
		
		//Prompt User
		
		System.out.println("What overall mark did you achieve?");
		
		// Declare and Initialise Variable
		
		int overallMark = myScan.nextInt();		
		
		// If Else Statements
		
		if (overallMark >= 70 && overallMark <= 100) {
			System.out.println("Classification : Distinction");
		}
		else if (overallMark >= 60 && overallMark <= 69) {
			System.out.println("Classification : Merit");
		}
		else if (overallMark >= 50 && overallMark <= 59) {
			System.out.println("Classification : Pass");
		}
		else if (overallMark >= 0 && overallMark <= 49) {
			System.out.println("Classification : Fail");
		}
		else {
			System.out.println("Invalid Response - please restart the program");
		}
		// Close scanner
			
		myScan.close();
	
	}

}
