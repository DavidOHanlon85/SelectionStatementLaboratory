/**
 * 
 */
package labExercises;

import java.util.Scanner;

/**
 * 
 */
public class Exercise3_VotingSystem {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Declare and initialise variables
		
		int applicantsAge;
		String applicantsName, applicantsVote = "unknown";
		
		// Prompt User
		
		System.out.println("What age are you?");
		
		// Instantiate Scanner
		
		Scanner myScanner = new Scanner(System.in);
		
		// Collect Age
		
		applicantsAge = myScanner.nextInt();
		
		if (applicantsAge < 0) {
			myScanner.nextLine();
			System.out.println("sorry don't recognise your input");
		}
		else if (applicantsAge < 18) {
			myScanner.nextLine();
			System.out.println("Too young to continue");
		}
		else {
			myScanner.nextLine();
			System.out.println("What is your name?");
			applicantsName = myScanner.nextLine();
			System.out.println("Hello " + applicantsName + ": " + applicantsAge + " - You are currently being progressed to the voting platform.");
			System.out.println("Voting... Enter 'con' for conservative and 'lab' for Labour");
			applicantsVote = myScanner.nextLine();
			
			//Voting Preference
			
			if (applicantsVote.equalsIgnoreCase("con") || applicantsVote.equalsIgnoreCase("lab")) {
				
				applicantsVote = (applicantsVote.equalsIgnoreCase("con") ? "Conservative" : "Labour");
				System.out.println("Vote registered for " + applicantsVote);
			}
			else {
				System.out.println("Sorry voting party unrecognised");
			}
		}
		
	}
		
}
