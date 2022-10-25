
/**
 * Description: This is a harder guessing game. This game will take in the user's response for whether or not they would like to play the game. If they answer 'yes', the game will begin. 
 * Firstly, the game will generate a random number from 1-100. Then, the game will take in the user's input for the number of guesses that they would like to have. The user needs to then 
 * try to guess the correct number in their chosen number of guesses. The game will then provide hints to the user if they have guessed an incorrect number. If the user guesses the correct 
 * number in the chosen number of guesses, they win the game and if they don't, they lose.

 *
 * @author (Fatema Lokhandwala)
 * @version (2021-02-27)
 */

//importing Scanner to be able to use it for user input
import java.util.Scanner;

//importing Random class from java library 
import java.util.Random;

public class FatemaHGG
{
    public static void main(String[] args)
    {
        //line of code to clear the terminal window
        System.out.print('\u000C');
        
        //declaring a variable to store the user's response on whether or not they would like to play my guessing game, data type = string
        String strUserResponse;
        
        //declaring a variable to store the number that the user has guessed, data type = byte
        //initializing the variable for try and catch block 
        byte bytNumberGuessed = -1;
        
        //declaring a variable to store the number of guesses that the user wants to have, data type = byte
        //initializing the variable for try and catch block
        byte bytNumberOfGuesses = -1;
        
        //declaring a variable to store the random number that is being generated, data type = integer
        //initializing the variable 
        int intRandomNumber = -1;
        
        //declaring a variable to error catch if the user has entered an invalid response on whether or not they would like to play my guessing game, data type = boolean
        //initializing the variable for looping
        boolean bolErrorCatchingForUserResponse = false;
        
        //declaring a variable to error catch if the user has guessed an invalid number, data type = boolean
        //initializing the variable for looping
        boolean bolErrorCatchingForUserNumberGuessed = false;
        
        //declaring a variable for looping around the try and catch block, data type = boolean
        //initializing the variable for looping
        boolean bolTryAndCatch = false;
        
        //declaring a variable to error catch if the user has entered an invalid number for the number of guesses, data type = boolean
        //initializing the variable for looping
        boolean bolErrorCatchingForUserNumberOfGuesses = false;
        
        //outputting hello and welcome message to the user
        System.out.println("Hello! Welcome to my number guessing game!");
        
        //outputting a blank line to make the program easier to read and follow for the user
        System.out.println();
        
        //outputting the description of the program to the user
        System.out.println("This game will take in the user's response for whether or not they would like to play the game. If they answer 'yes', the game will begin."); 
        System.out.println("Firstly, the game will generate a random number from 1-100. Then, the game will take in the user's input for the number of guesses that they would like to have.");
        System.out.println("The user needs to then try to guess the correct number in their chosen number of guesses. The game will then provide hints to the user if they have guessed an incorrect number."); 
        System.out.println("If the user guesses the correct number in the chosen number of guesses, they win the game and if they don't, they lose.");
        
        //outputting a blank line to make the program easier to read and follow for the user
        System.out.println();
        
        //outputting thank you and enjoy message to the user
        System.out.println("Thank you and enjoy playing my game!");
        
        //outputting a blank line to make the program easier to read and follow for the user
        System.out.println();

        //do while loop for error catching 
        do
        {
            //outputting the message to the user to let them know that they need to enter their response for whether or not they would like to play my number guessing game
            System.out.println("Would you like to play my number guessing game? Please enter either 'Yes' or 'No':");
            
            //taking in the user's input for their response
            strUserResponse = new Scanner(System.in).nextLine().toLowerCase();
    
            //condition used to determine if the user has entered "yes" as their response
            if(strUserResponse.equals("yes"))
            {
                //outputting a blank line to make the program easier to read and follow for the user
                System.out.println();
        
                //outputting the message to the user to let them know that the game is starting
                System.out.println("Yayy! Let's get started!");
                
                //setting the variable equal to false
                bolErrorCatchingForUserResponse = false;
                
                //breaking out of the do while loop
                break;
            }
            //condition used to determine if the user has entered "no" as their response
            else if(strUserResponse.equals("no"))
            {
                //outputting a blank line to make the program easier to read and follow for the user
                System.out.println();
        
                //outputting goodbye and enjoy message to the user
                System.out.println("Goodbye and enjoy the rest of your day!");
                
                //setting the variable equal to false
                bolErrorCatchingForUserResponse = false;
                
                //breaking out of the do while loop
                break;
            }
            //condition used to determine if the user has entered something other than "yes" or "no" as their response
            else
            {
                //outputting an error message if an invalid response has been entered to the user
                System.out.println("Error! Please enter either 'Yes' or 'No'.");
                
                //outputting a blank line to make the program easier to read and follow for the user
                System.out.println();
                
                //setting the variable equal to true
                bolErrorCatchingForUserResponse = true;
            }
        }
        while(bolErrorCatchingForUserResponse = true);

        //condition used to determine if the user has entered "yes" as their response
        if(strUserResponse.equals("yes"))
        {
            //building the random 
            Random rand = new Random();
            
            //generating a random number within the range of 1-100
            intRandomNumber = 1 + rand.nextInt(100);
            
            //do while loop for invalid values 
            do
            {
                //do while loop for try and catch
                do
                {
                    //outputting a blank line to make the program easier to read and follow for the user
                    System.out.println();
        
                    //outputting the message to the user to let them know that they need to enter the maximum number of guesses they would like to have without any decimals
                    System.out.println("Please enter the maximum number of guesses you would like to have (minimum limit = 1 and maximum limit = 100 and no decimals allowed):");
                    
                    //try and catch block to ensure that the user has entered the maximum number of guesses they would like to have as a whole number without any decimals
                    try
                    {
                        //taking in the user's input for the maximum number of guesses they would like to have
                        bytNumberOfGuesses = new Scanner(System.in).nextByte();
                        
                        //setting the variable equal to false
                        bolTryAndCatch = false;
                        
                        //breaking out of the do while loop
                        break;
                    }
                    catch(Exception e)
                    {
                        //outputting an error message if runtime error is caught to the user
                        System.out.println("Error! Please enter the maximum number of guesses you would like to have as a number without any decimals.");
                        
                        //setting the variable equal to true
                        bolTryAndCatch = true;
                    }
                }
                while(bolTryAndCatch = true);
            
                //condition used to determine if the user has entered the maximum number of guesses they would like to have in the range of 1-100
                if(bytNumberOfGuesses>=1 && bytNumberOfGuesses<=100)
                {
                    //setting the variable equal to false
                    bolErrorCatchingForUserNumberOfGuesses = false;
                    
                    //breaking out of the do while loop
                    break;
                }
                //condition used to determine if the user has entered an invalid number 
                else
                {
                    //outputting an error message if an invalid number has been entered to the user
                    System.out.println("Error! Please enter the maximum number of guesses you would like to have as a number between 1-100.");
                    
                    //setting the variable equal to true
                    bolErrorCatchingForUserNumberOfGuesses = true;
                }
            }
            while(bolErrorCatchingForUserNumberOfGuesses = true);
            
            //condition used to determine if the user has entered the maximum number of guesses they would like to have in the range of 1-100
            if(bytNumberOfGuesses>=1 && bytNumberOfGuesses<=100)
            {
                //for loop for guessing the number 
                for(int intCounter = 1; intCounter<=bytNumberOfGuesses; intCounter++)
                {
                    //do while loop for invalid values 
                    do
                    {
                        //do while loop for try and catch
                        do
                        {
                            //outputting a blank line to make the program easier to read and follow for the user
                            System.out.println();
                            
                            //outputting the message to the user to let them know that they need to guess and enter a whole number which is between 1-100
                            System.out.println("Guess #" + intCounter + ": What number do you guess? Please enter a whole number between 1-100 (no decimals allowed):");
                            
                            //try and catch block to ensure that the user has entered their guess as a whole number without any decimals
                            try
                            {
                                //taking in the user's input for the number they have guessed 
                                bytNumberGuessed = new Scanner(System.in).nextByte();
                                
                                //setting the variable equal to false
                                bolTryAndCatch = false;
                                
                                //breaking out of the do while loop
                                break;
                            }
                            catch(Exception e)
                            {
                                //outputting an error message if runtime error is caught to the user
                                System.out.println("Error! Please enter your guess as a whole number between 1-100 without any decimals.");
                                
                                //setting the variable equal to true
                                bolTryAndCatch = true;
                            }
                        }
                        while(bolTryAndCatch = true);
                        
                        //condition used to determine if the user has guessed a number which is in the range of 1-100
                        if(bytNumberGuessed>=1 && bytNumberGuessed<=100)
                        {
                            //condition used to determine if the number guesssed is bigger than the random number that was generated 
                            if(bytNumberGuessed>intRandomNumber)
                            {
                                System.out.println(intRandomNumber);
                                
                                //outputting a blank line to make the program easier to read and follow for the user
                                System.out.println();
        
                                //outputting the message to the user to let them know that they have guessed an incorrect number
                                System.out.println("Sorry! Your guessed number is incorrect :(");
                                
                                //condition used to determine if the user is on their last guess
                                if(intCounter==bytNumberOfGuesses)
                                {
                                    //outputting a blank line to make the program easier to read and follow for the user
                                    System.out.println();
        
                                    //outputting the message to the user to let them know that their guessed number is bigger than the actual number
                                    System.out.println("Feedback: Your guessed number was bigger than the actual number.");
                                    
                                    //outputting a blank line to make the program easier to read and follow for the user
                                    System.out.println();
        
                                    //outputting the message to the user to let them know that they have no more guesses left
                                    System.out.println("This was your last guess. Now you have no more guesses left.");
                                    
                                    //outputting a blank line to make the program easier to read and follow for the user
                                    System.out.println();
                                    
                                    //outputting the message to the user to let them know that they have lost the game
                                    System.out.println("Sorry! You lost the game because you were unable to guess the correct number :(");
                                    
                                    //outputting a blank line to make the program easier to read and follow for the user
                                    System.out.println();
                                    
                                    //outputting good luck message to the user
                                    System.out.println("Better luck next time!");
                                    
                                    //breaking out of the do while loop
                                    break;
                                }
                                //condition used to determine if the user is not on their last guess
                                else
                                {
                                    //outputting a blank line to make the program easier to read and follow for the user
                                    System.out.println();
        
                                    //outputting the message to the user to let them know that their guessed number is bigger than the actual number
                                    System.out.println("Hint: Your guessed number is bigger than the actual number.");
                                    
                                    //outputting a blank line to make the program easier to read and follow for the user
                                    System.out.println();
                                    
                                    //outputting the message to the user to let them know that they need to guess a number again which is smaller than their previously guessed number
                                    System.out.println("Please guess a number again which is smaller than your previously guessed number.");
                                    
                                    //breaking out of the do while loop
                                    break;
                                }
                            }
                            //condition used to determine if the number guesssed is smaller than the random number that was generated 
                            else if(bytNumberGuessed<intRandomNumber)
                            {
                                System.out.println(intRandomNumber);
                                //outputting a blank line to make the program easier to read and follow for the user
                                System.out.println();
        
                                //outputting the message to the user to let them know that they have guessed an incorrect number
                                System.out.println("Sorry! Your guessed number is incorrect :(");
                                
                                //condition used to determine if the user is on their last guess
                                if(intCounter==bytNumberOfGuesses)
                                {
                                    //outputting a blank line to make the program easier to read and follow for the user
                                    System.out.println();
        
                                    //outputting the message to the user to let them know that their guessed number is smaller than the actual number
                                    System.out.println("Feedback: Your guessed number was smaller than the actual number.");
                                    
                                    //outputting a blank line to make the program easier to read and follow for the user
                                    System.out.println();
                                    
                                    //outputting the message to the user to let them know that they have no more guesses left
                                    System.out.println("This was your last guess. Now you have no more guesses left.");
                                    
                                    //outputting a blank line to make the program easier to read and follow for the user
                                    System.out.println();
                                    
                                    //outputting the message to the user to let them know that they have lost the game
                                    System.out.println("Sorry! You lost the game because you were unable to guess the correct number :(");
                                    
                                    //outputting a blank line to make the program easier to read and follow for the user
                                    System.out.println();
                                    
                                    //outputting good luck message to the user
                                    System.out.println("Better luck next time!");
                                    
                                    //breaking out of the do while loop
                                    break;
                                }
                                //condition used to determine if the user is not on their last guess
                                else
                                {
                                    //outputting a blank line to make the program easier to read and follow for the user
                                    System.out.println();
        
                                    //outputting the message to the user to let them know that their guessed number is smaller than the actual number
                                    System.out.println("Hint: Your guessed number is smaller than the actual number.");
                                    
                                    //outputting a blank line to make the program easier to read and follow for the user
                                    System.out.println();
                                    
                                    //outputting the message to the user to let them know that they need to guess a number again which is bigger than their previously guessed number
                                    System.out.println("Please guess a number again which is bigger than your previously guessed number.");
                                    
                                    //breaking out of the do while loop
                                    break;
                                }
                            }
                            //condition used to determine if the number guesssed is equal to the random number that was generated 
                            else if(bytNumberGuessed==intRandomNumber)
                            {
                                //outputting a blank line to make the program easier to read and follow for the user
                                System.out.println();
        
                                //outputting the message to the user to let them know that they have guessed a correct number
                                System.out.println("Yayy! Your guessed number is correct :)");
                                
                                //condition used to determine if the user has guessed the correct number in one try
                                if(intCounter==1)
                                {
                                    //outputting a blank line to make the program easier to read and follow for the user
                                    System.out.println();
        
                                    System.out.println("You guessed the correct number in " + intCounter + " try.");
                                    
                                    //outputting a blank line to make the program easier to read and follow for the user
                                    System.out.println();
                                    
                                    //outputting the message to the user to let them know that they have won the game
                                    System.out.println("Congratulations! You won the game because you were able to guess the correct number :)");
                                    
                                    //updating the counter in order to exit out of the for loop
                                    intCounter=bytNumberOfGuesses+1;
                                    
                                    //breaking out of the do while loop
                                    break;
                                }
                                //condition used to determine if the user has guessed the correct number in more than one try
                                else
                                {
                                    //outputting a blank line to make the program easier to read and follow for the user
                                    System.out.println();
        
                                    System.out.println("You guessed the correct number in " + intCounter + " tries.");
                                    
                                    //outputting a blank line to make the program easier to read and follow for the user
                                    System.out.println();
                                    
                                    //outputting the message to the user to let them know that they have won the game
                                    System.out.println("Congratulations! You won the game because you were able to guess the correct number :)");
                            
                                    //updating the counter in order to exit out of the for loop
                                    intCounter=bytNumberOfGuesses+1;
                                    
                                    //breaking out of the do while loop
                                    break;
                                }
                            }
                        }
                        //condition used to determine if the user has guessed an invalid number 
                        else
                        {
                            //outputting an error message if an invalid number has been entered to the user
                            System.out.println("Error! Please enter a number between 1-100.");
                            
                            //setting the variable equal to true
                            bolErrorCatchingForUserNumberGuessed = true;
                        }
                    }
                    while(bolErrorCatchingForUserNumberGuessed = true);
                }
            }
        }
    }
}
