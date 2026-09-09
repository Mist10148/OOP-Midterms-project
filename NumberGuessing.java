import java.util.Scanner;
import java.util.Random;
public class NumberGuessing {
    public static void main(String[] args){
        //making an object
        Scanner input = new Scanner(System.in);
        Random rd = new Random();

        //variables
        int totalWins = 0;
        int totalLosses = 0;



        //welcome message and instructions for the user
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have selected a number between 1 and 100. Try to guess it!");
        System.out.println("You will have five rounds and attempts for this tournament. Good luck!");

        for(int i = 1; i <= 5; i++){
            System.out.println("Round " + i + ": ");
            //variable declarations and resetting the guess and attempts for each round
            int number = rd.nextInt(100) + 1;
            int guess = 0;
            int attempts = 0;

            do{
                System.out.print("Enter your guess: ");
                guess = input.nextInt();
                attempts++; 
                
                //conditionals for the number guessing
                if(guess < number){
                    System.out.println("Too low! try again.");
                }

                else if(guess > number){
                    System.out.println("Too high! try again.");

                }

                else if(guess < 1 || guess > 100){
                    System.out.println("Invalid input! Please enter a number between 1-100.");

                }

                else{
                    System.out.println("Congratulations! You guessed the number");


                }

                //conditionals to check the number of attempts left
                if(attempts >= 5 && guess != number){
                    System.out.println("You have used all your attempts. The number was " + number);
                }

                else if(attempts < 5 && guess != number){
                    System.out.println("You have " + (5 - attempts) + " attempts left.");
                }
           
        }while(guess != number && attempts < 5);

        //round results displaying the win or lose statuses and the number of attempts used
        if(guess == number){
            System.out.println("Round: " + i + " WIN - " + attempts + " attempts");
            totalWins++;
        }

        else{
            System.out.println("Round: " + i + " LOSE");
            totalLosses++;
        }


    }

    //display of statistics after thee completion of the game

    //display of overall game results(per round) on whether the user won or lost and the number of attempts used

    System.out.println("Total Wins: " + totalWins); //total wins
    System.out.println("Total losses: " + totalLosses); //total losses
    System.out.println("Average attempts per round: " + (double)(totalWins + totalLosses) / 5); //Average attempts
    System.out.println("Final Score: " + (totalWins * 20)); //final score up to 100


    

    input.close();
}
}
