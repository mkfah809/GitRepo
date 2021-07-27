package com.coderscampus.Assign2;
import java.util.*;


public class CollectAndValidate {
	
	
	
	 int numberOfTries = 1;
     int userGuessNumber;
     Scanner userInput = new Scanner(System.in);
     int randomNumber = (int) (Math.random() * 99 + 1);   
    
 
     
     //  collect the guess 
	 int getGuess()
	{
	
		 do {
	         userGuessNumber = userInput.nextInt();

			 if(IsValid() == false);
			 {
                     
               
               if (userGuessNumber == randomNumber)
               {    
                   System.out.println("OOhhOO!, You Win the Game!");
                   break;
               }
//               else if(userGuessNumber < 1 || userGuessNumber>100)
//               {
//       	       	 System.out.println("Your guess is not between 1 and 100, please try again\r\n" + "\r\n"+ "");
//       	       	numberOfTries = numberOfTries - 1;
//               }
               else if (userGuessNumber < randomNumber)
               {
                   System.out.println("Please pick a higher number.");
               }
               else if (userGuessNumber > randomNumber)
               {
                   System.out.println("Please pick a lower number.");
               }
               if(numberOfTries == 5) 
               {
                   System.out.println("You lose!\r\n" + "\r\n" + "");
                   break;
                   
               }
           }
               numberOfTries++;
//           

         
       } while (userGuessNumber != randomNumber);
		return userGuessNumber;
	}
	
	 // Validation
	    boolean IsValid()
	 	{
	    	 boolean valid = true;
	 		  if(userGuessNumber < 1 || userGuessNumber>100)
	          {
	  	       	System.out.println("Your guess is not between 1 and 100, please try again\r\n" + "\r\n"+ "");
	  	       //	numberOfTries = numberOfTries - 1;
	  	       	valid = false;
	  	      getGuess();
	          
	          }
	 		  // IsInt?
//	 		  if (!userInput.hasNextInt())
//	 		  {
//	 			  valid=false;
//	 		 //    numberOfTries = numberOfTries - 1;
//	 			  System.out.println("Enter a valid number");
//	 		  }
	 		
	 		return valid;
	 	}
	 
	// get the random number to play with. 
	 int getRandom()
	{
		 
	        System.out.println("The number to guess was: " + randomNumber);
		  return randomNumber;
	}
	
	
	 
}
