/**
 * 
 */
package labExercises;

import java.util.Scanner;

/**
 * 
 */
public class Exercise1_MathematicalOperatorsExercise {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Declare variable
		
		double floatRequest;
		
		// Instantiate Scanner
		
		Scanner myScan = new Scanner(System.in);
		
		// Prompt
		
		System.out.println("Please provide a decimal number");
		
		// Scan
		
		floatRequest = myScan.nextDouble();
		myScan.nextLine();
		
		// Print Statements
		
		System.out.printf("Number rounded (two decimal places): %.2f%n", floatRequest);
		System.out.printf("Number squared (three decimal places): %.3f%n", Math.pow(floatRequest, 2));
		System.out.printf("Number cubed to (three decimal places): %.3f%n", Math.pow(floatRequest, 3));
		System.out.printf("Square root (four decimal places): %.4f%n", Math.sqrt(floatRequest));
		
		// Close Scanner
		
		myScan.close();

	}

}
