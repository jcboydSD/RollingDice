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
        //Input, Processing, Output
        System.out.println("Can you roll doubles?");
        do
        {
            System.out.print("Press enter to roll the dice:");
            stdIn.nextLine();
            die1 = rollDie(); //call method to generate random number
            die2 = rollDie(); //call method to generate random number
            printResult(die1, die2); //call method to display messages       
        } while (die1 != die2);
    } //end main
    
    //*************************************************************************
    
    public static int rollDie() //Method returns random value of rolled die
    {
        return (int) (Math.random() * 6 + 1);
    } //end rollDie
    
    //*************************************************************************
    
    public static void printResult(int die1, int die2) //Method displays dice 
    {                                                  //values and if doubles 
        if (die1 == die2)
        {
            System.out.printf("Doubles! You rolled two %d's."
                    + " Thank you for playing!\n", die1);
        }
        else
        {
            System.out.printf("No doubles. You rolled a %d and a %d." 
                    + " Try again.\n", die1, die2);
        }
    } //end printResult
        
} //end class RollingDice
