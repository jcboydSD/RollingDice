package rollingdice;

/******************************************************************************
 * RollingDice.java 
 * Programmer: @author jcboyd
 *
 * This program asks for a user's name and then reverses it
 *****************************************************************************/

import java.util.Scanner;

public class RollingDice 
{
    public static void main(String[] args) //Main Method
    {
        Scanner stdIn = new Scanner(System.in);
        //Declarations
        int die1, die2; //values of two dice
        String playAgainAnswer = ""; //default is to play again

        //Input, Processing, Output
        System.out.println("Roll Dice by JC Boyd\n");
        System.out.println("Can you roll doubles?");

        do
        {
            System.out.print("Press enter to roll the dice ");
            stdIn.nextLine();
            die1 = rollDie(); //call method to generate random number
            die2 = rollDie(); //call method to generate random number
            printResult(die1, die2); //call method to display messages  
            System.out.print("Do you want to play again? (y/n) ");
            playAgainAnswer = stdIn.nextLine();
        } while (!playAgainAnswer.equals("n"));

    } //end main
    
    //*************************************************************************
    
    public static int rollDie() //Method returns random value of rolled die
    {
        return (int) (Math.random() * 6 + 1);
    } //end rollDie
    
    //*************************************************************************
    
    public static void printResult(int die1, int die2) //Method displays dice 
    {                                                  //values and if doubles 
        System.out.printf("You rolled a %d and a %d.\n", die1, die2);
        evenOdd(die1, die2); //call method to sum and print even or odd msg
        
        if (die1 == die2)
        {
            System.out.println("Doubles! Thank you for playing!");
        }
        else
        {
            System.out.println("No doubles. Try again.");
        }
    } //end printResult

    //*************************************************************************
    
    public static void evenOdd(int die1, int die2) //Method displays even or odd 
    {                                              //message based on sum 
        int dieSum = die1 + die2;
        
        if (dieSum %2 == 0) //check for even number (no remainder)
        {
            System.out.printf("The total is the even number %d.\n", dieSum);
        }
        else
        {
            System.out.printf("The total is the odd number %d.\n", dieSum);
        }
    } //end evenOdd
    
} //end class RollingDice
