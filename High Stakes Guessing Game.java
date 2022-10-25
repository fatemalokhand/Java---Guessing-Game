
/**
 * Description: This is a high stakes guessing game. This game will take in the user's response for whether or not they would like to play the game. If they answer 'yes', the game will begin. 
 * Firstly, the game will generate a random number from 1-100. Then, the game will take in the user's input for the number of points that they would like to bet. The user will then be given 
 * 10 tries to guess the correct number. The game will also provide hints to the user if they have guessed an incorrect number. If the user guesses the correct number in one try, they get 
 * 100 times their originally betted points and they win the game. If the user guesses the correct number in two tries, they get 50 times their originally betted points and they win the 
 * game. If the user guesses the correct number in five or less tries, they get 10 times their originally betted points and they win the game. If the user guesses the correct number in 
 * ten or less tries, they just get their originally betted points back and they win the game. If the user is unable to guess in ten tries, they lose the game as well as all their 
 * originally betted points.

 *
 * @author (Fatema Lokhandwala)
 * @version (2021-03-01)
 */

//importing Scanner to be able to use it for user input
import java.util.Scanner;

//importing Random class from java library 
import java.util.Random;

public class FatemaHSG
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
        
        //declaring a variable to store the number of points that the user wants to bet, data type = short
        //initializing the variable for try and catch block 
        short shrNumberOfPointsBetted = -1; 
        
        //declaring a variable to error catch if the user has entered an invalid number for the number of points that they want to bet, data type = boolean
        //initializing the variable for looping
        boolean bolErrorCatchingForNumberOfPointsBetted = false;
        
        //declaring a variable to store the total number of points that the user has won, data type = integer
        int intTotalNumberOfPointsWon; 

        //declaring a constant variable to store the number of points the user gets if they guess the correct number in one try, data type = byte
        final byte POINTS_GAINED_IF_WON_IN_ONE_GUESS = 100;
        
        //declaring a constant variable to store the number of points the user gets if they guess the correct number in two tries, data type = byte
        final byte POINTS_GAINED_IF_WON_IN_TWO_GUESSES = 50;
        
        //declaring a constant variable to store the number of points the user gets if they guess the correct number in five or less tries, data type = byte
        final byte POINTS_GAINED_IF_WON_IN_FIVE_OR_LESS_GUESSES = 10;
        
        //outputting hello and welcome message to the user
        System.out.println("Hello! Welcome to my number guessing game!");
        
        //outputting a blank line to make the program easier to read and follow for the user
        System.out.println();
        
        //outputting the description of the program to the user
        System.out.println("This game will take in the user's response for whether or not they would like to play the game. If they answer 'yes', the game will begin."); 
        System.out.println("Firstly, the game will generate a random number from 1-100. Then, the game will take in the user's input for the number of points that they would like to bet.");
        System.out.println("The user will then be given 10 tries to guess the correct number. The game will also provide hints to the user if they have guessed an incorrect number."); 
        System.out.println("If the user guesses the correct number in one try, they get 100 times their originally betted points and they win the game. If the user guesses the correct");
        System.out.println("number in two tries, they get 50 times their originally betted points and they win the game. If the user guesses the correct number in five or less tries,");
        System.out.println("they get 10 times their originally betted points and they win the game. If the user guesses the correct number in ten or less tries, they just get their");
        System.out.println("originally betted points back and they win the game. If the user is unable to guess in ten tries, they lose the game as well as all their originally betted points.");

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
                    
                    //outputting the message to the user to let them know that they need to enter the maximum number of points they would like to bet without any decimals
                    System.out.println("Please enter the maximum number of points you would like to bet (minimum limit = 1 and maximum limit = 32,000 and no decimals allowed):");
                    
                    //try and catch block to ensure that the user has entered the maximum number of points they would like to bet as a whole number without any decimals
                    try
                    {
                        //taking in the user's input for the maximum number of points they would like to bet
                        shrNumberOfPointsBetted = new Scanner(System.in).nextShort();
                        
                        //setting the variable equal to false
                        bolTryAndCatch = false;
                        
                        //breaking out of the do while loop
                        break;
                    }
                    catch(Exception e)
                    {
                        //outputting an error message if runtime error is caught to the user
                        System.out.println("Error! Please enter the maximum number of points you would like to bet as a number without any decimals.");
                        
                        //setting the variable equal to true
                        bolTryAndCatch = true;
                    }
                }
                while(bolTryAndCatch = true);
                
                //condition used to determine if the user has entered the maximum number of points they would like to bet in the range of 1-32000
                if(shrNumberOfPointsBetted>=1 && shrNumberOfPointsBetted<=32000)
                {
                    //setting the variable equal to false
                    bolErrorCatchingForNumberOfPointsBetted = false;
                    
                    //breaking out of the do while loop
                    break;
                }
                //condition used to determine if the user has entered an invalid number 
                else
                {
                    //outputting an error message if an invalid number has been entered to the user
                    System.out.println("Error! Please enter the maximum number of points you would like to bet as a number between 1-32000.");
                    
                    //setting the variable equal to true
                    bolErrorCatchingForNumberOfPointsBetted = true;
                }
            }
            while(bolErrorCatchingForNumberOfPointsBetted = true);
            
            //condition used to determine if the user has entered the maximum number of points they would like to bet in the range of 1-32000
            if(shrNumberOfPointsBetted>=1 && shrNumberOfPointsBetted<=32000)
            {
                //for loop for guessing the number 
                for(int intCounter = 1; intCounter<=10; intCounter++)
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
                                if(intCounter==10)
                                {
                                    //outputting a blank line to make the program easier to read and follow for the user
                                    System.out.println();
        
                                    //outputting the message to the user to let them know that their guessed number is bigger than the actual number
                                    System.out.println("Feedback: Your guessed number was bigger than the actual number.");
                                    
                                    //outputting a blank line to make the program easier to read and follow for the user
                                    System.out.println();
        
                                    //outputting the message to the user to let them know that they lost all their originally betted points because they were unable to guess the correct number
                                    System.out.println("Sorry! You lose all your originally betted points because you were unable to guess the correct number :(");
                                    
                                    //outputting a blank line to make the program easier to read and follow for the user
                                    System.out.println();
        
                                    //outputting the original number of points that the user had betted to the user
                                    System.out.println("Your originally betted points were " + shrNumberOfPointsBetted + ".");
                                    
                                    //outputting a blank line to make the program easier to read and follow for the user
                                    System.out.println();
                                    
                                    //outputting the total number of points that the user has won to the user
                                    System.out.println("The total number of points you won are 0.");
                                    
                                    //outputting a blank line to make the program easier to read and follow for the user
                                    System.out.println();
                                    
                                    //outputting the message to the user to let them know that they have lost the game
                                    System.out.println("Sorry! You lost the game :(");
                                    
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
                                if(intCounter==10)
                                {
                                    //outputting a blank line to make the program easier to read and follow for the user
                                    System.out.println();
        
                                    //outputting the message to the user to let them know that their guessed number is smaller than the actual number
                                    System.out.println("Feedback: Your guessed number was smaller than the actual number.");
                                    
                                    //outputting a blank line to make the program easier to read and follow for the user
                                    System.out.println();
                                    
                                    //outputting the message to the user to let them know that they lost all their originally betted points because they were unable to guess the correct number
                                    System.out.println("Sorry! You lose all your originally betted points because you were unable to guess the correct number :(");

                                    //outputting a blank line to make the program easier to read and follow for the user
                                    System.out.println();
        
                                    //outputting the original number of points that the user had betted to the user
                                    System.out.println("Your originally betted points were " + shrNumberOfPointsBetted + ".");
                                    
                                    //outputting a blank line to make the program easier to read and follow for the user
                                    System.out.println();
                                    
                                    //outputting the total number of points that the user has won to the user
                                    System.out.println("The total number of points you won are 0.");
                                    
                                    //outputting a blank line to make the program easier to read and follow for the user
                                    System.out.println();
                                    
                                    //outputting the message to the user to let them know that they have lost the game
                                    System.out.println("Sorry! You lost the game :(");
                                    
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
                                
                                //condition used to determine if the user guessed the correct number in one try
                                if(intCounter==1)
                                {
                                    //outputting a blank line to make the program easier to read and follow for the user
                                    System.out.println();
        
                                    //outputting the message to the user to let them know that they have gotten additional points because they have guessed the correct number in a certain number of tries
                                    System.out.println("Congratulations! You get " + POINTS_GAINED_IF_WON_IN_ONE_GUESS + " times your originally betted points because you guessed the correct number in " + intCounter + " try :)");
                                    
                                    //outputting a blank line to make the program easier to read and follow for the user
                                    System.out.println();
        
                                    //outputting the original number of points that the user had betted to the user
                                    System.out.println("Your originally betted points were " + shrNumberOfPointsBetted + ".");
                                    
                                    //outputting a blank line to make the program easier to read and follow for the user
                                    System.out.println();
                                    
                                    //calculating the total number of points that the user has won
                                    intTotalNumberOfPointsWon = shrNumberOfPointsBetted*POINTS_GAINED_IF_WON_IN_ONE_GUESS;
                                    
                                    //outputting the total number of points that the user has won to the user
                                    System.out.println("The total number of points you won are " + intTotalNumberOfPointsWon + ".");
                                    
                                    //outputting a blank line to make the program easier to read and follow for the user
                                    System.out.println();
                                    
                                    //outputting the message to the user to let them know that they have won the game
                                    System.out.println("Hooray! You won the game :)");
                                    
                                    //updating the counter in order to exit out of the for loop
                                    intCounter=11;
                                    
                                    //breaking out of the do while loop
                                    break;
                                }
                                //condition used to determine if the user guessed the correct number in two tries
                                else if(intCounter==2)
                                {
                                    //outputting a blank line to make the program easier to read and follow for the user
                                    System.out.println();
        
                                    //outputting the message to the user to let them know that they have gotten additional points because they have guessed the correct number in a certain number of tries
                                    System.out.println("Congratulations! You get " + POINTS_GAINED_IF_WON_IN_TWO_GUESSES + " times your originally betted points because you guessed the correct number in " + intCounter + " tries :)");
                                    
                                    //outputting a blank line to make the program easier to read and follow for the user
                                    System.out.println();
        
                                    //outputting the original number of points that the user had betted to the user
                                    System.out.println("Your originally betted points were " + shrNumberOfPointsBetted + ".");
                                    
                                    //outputting a blank line to make the program easier to read and follow for the user
                                    System.out.println();
                                    
                                    //calculating the total number of points that the user has won
                                    intTotalNumberOfPointsWon = shrNumberOfPointsBetted*POINTS_GAINED_IF_WON_IN_TWO_GUESSES;
                                    
                                    //outputting the total number of points that the user has won to the user
                                    System.out.println("The total number of points you won are " + intTotalNumberOfPointsWon + ".");
                                    
                                    //outputting a blank line to make the program easier to read and follow for the user
                                    System.out.println();
                                    
                                    //outputting the message to the user to let them know that they have won the game
                                    System.out.println("Hooray! You won the game :)");
                                    
                                    //updating the counter in order to exit out of the for loop
                                    intCounter=11;
                                    
                                    //breaking out of the do while loop
                                    break;
                                }
                                //condition used to determine if the user guessed the correct number in five or less tries
                                else if(intCounter<=5 && intCounter!=1 && intCounter!=2)
                                {
                                    //outputting a blank line to make the program easier to read and follow for the user
                                    System.out.println();
        
                                    //outputting the message to the user to let them know that they have gotten additional points because they have guessed the correct number in a certain number of tries
                                    System.out.println("Congratulations! You get " + POINTS_GAINED_IF_WON_IN_FIVE_OR_LESS_GUESSES + " times your originally betted points because you guessed the correct number in " + intCounter + " tries :)");
                                    
                                    //outputting a blank line to make the program easier to read and follow for the user
                                    System.out.println();
        
                                    //outputting the original number of points that the user had betted to the user
                                    System.out.println("Your originally betted points were " + shrNumberOfPointsBetted + ".");
                                    
                                    //outputting a blank line to make the program easier to read and follow for the user
                                    System.out.println();
                                    
                                    //calculating the total number of points that the user has won
                                    intTotalNumberOfPointsWon = shrNumberOfPointsBetted*POINTS_GAINED_IF_WON_IN_FIVE_OR_LESS_GUESSES;
                                    
                                    //outputting the total number of points that the user has won to the user
                                    System.out.println("The total number of points you won are " + intTotalNumberOfPointsWon + ".");
                                    
                                    //outputting a blank line to make the program easier to read and follow for the user
                                    System.out.println();
                                    
                                    //outputting the message to the user to let them know that they have won the game
                                    System.out.println("Hooray! You won the game :)");
                                    
                                    //updating the counter in order to exit out of the for loop
                                    intCounter=11;
                                    
                                    //breaking out of the do while loop
                                    break;
                                }
                                //condition used to determine if the user guessed the correct number in ten or less tries
                                else if(intCounter<=10 && !(intCounter<=5) && intCounter!=1 && intCounter!=2) 
                                {
                                    //outputting a blank line to make the program easier to read and follow for the user
                                    System.out.println();
        
                                    //outputting the message to the user to let them know that they have not gotten any additional points because they have guessed the correct number after a higher number of tries
                                    System.out.println("Sorry! You don't get any additional points because you guessed the correct number in " + intCounter + " tries :(");
                                    
                                    //outputting a blank line to make the program easier to read and follow for the user
                                    System.out.println();
        
                                    //outputting the message to the user to let them know that they just get their originally betted points back
                                    System.out.println("You just get your originally betted points back.");
                                    
                                    //outputting a blank line to make the program easier to read and follow for the user
                                    System.out.println();
                                    
                                    //outputting the original number of points that the user had betted to the user
                                    System.out.println("Your originally betted points were " + shrNumberOfPointsBetted + ".");
                                    
                                    //outputting a blank line to make the program easier to read and follow for the user
                                    System.out.println();
                                    
                                    //outputting the total number of points that the user has won to the user
                                    System.out.println("The total number of points you won are " + shrNumberOfPointsBetted + ".");
                                    
                                    //outputting a blank line to make the program easier to read and follow for the user
                                    System.out.println();
                                    
                                    //outputting the message to the user to let them know that they have won the game
                                    System.out.println("Hooray! You won the game :)");
                                    
                                    //updating the counter in order to exit out of the for loop
                                    intCounter=11;
                                    
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
                            bolErrorCatchingForUserNumberGuessed = true;
                        }
                    }
                    while(bolErrorCatchingForUserNumberGuessed = true);
                }
            }
        }
    }
}
