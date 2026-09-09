import java.util.Scanner;
import java.util.Random;
public class NumberGuessing {
    public static void main(String[] args){
        //making an object
        Scanner input = new Scanner(System.in);
        Random rd = new Random();

        //variable declarations
        int number = rd.nextInt(100) + 1;
        int guess = 0;
        int attempts = 0;

        //welcome message and instructions for the user
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have selected a number between 1 and 100. Try to guess it!");

        do{
            //welcome message and ask the user for input
            System.out.print("Enter your guess: ");
            guess = input.nextInt();
            attempts++;


            //conditional checking for the player's guess
            if(guess < number) {
                System.out.println("Your guess is too low! Try again.");
            }

            else if(guess > number){
                System.out.println("Your guess is too high! Try again.");
            }

            else{
                System.out.println("Congratulations! You've guessed the number " + number + " in " + attempts + " attempts.");

            }

        }while(guess != number);

        input.close();

    }
}
