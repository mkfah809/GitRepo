// Author: Mina K Fahmy
// Date: 07/24/2021
// Desc:
//create a game that allows players to try to guess a number that’s randomly chosen between 1 and 100
// When the player starts the game, a random number will be generated. 
//This random number will be the number that the player will try to guess (so don’t tell the player what this number is).
//The player will then be prompted to “Pick a number between 1 and 100”. 
//The range from 1 to 100 is inclusive, so the number can be 1, or 100 or any number in-between. 
//Also, you should only generate integer values (don’t use floats / doubles)
//If the number chosen is outside of this range, then an error message should be displayed 
//saying “Your guess is not between 1 and 100, please try again”. 
//Note: an invalid input should not affect the number of guesses the player has left 
//(so do not remove a guess from the player if they enter a number outside of the 1 - 100 range)
//(Don’t worry about trying to validate any input other than int values; ie. Don’t worry about decimals or words)
//When the player enters a valid guess (a number between 1 and 100), 
//the game should prompt the player with one of three messages:

package com.coderscampus.Assign2;

public class RunnableClass_Assign2 {

	public static void main(String[] args) {

		System.out.println(
				"Welcome to Guess Number Game \nYou Will Be Asked To Guess A Number To Win The Game \nYou have Maximum 5 Attemp Limit\n\n\n");
		System.out.print("Enter a guess number between 1 to 100\n");

		CollectAndValidate guess = new CollectAndValidate();
		guess.getGuess();
		guess.getRandom();

	}
}
