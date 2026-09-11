import java.util.Scanner;
public class CashDenomination {
    public static void main(String[] args){
        

        //making an object scanner for input
        Scanner input = new Scanner(System.in);

        //welcome message and getting input from the user
        System.out.print("Enter amount: ");
        int amount = input.nextInt();

        //condition to check if the amount is valid or not
        if (amount <= 0 || amount % 10 != 0){
            System.out.println("Invalid amount.");
        }

        else {
            //getting the number of bills for each denomination
            int thousand = amount / 1000; //getting the php1000 bills
            amount %= 1000;

            int p500 = amount /500; //getting the php500 bills
            amount %= 500;

            int p200 = amount / 200; //getting the php200 bills
            amount %= 200;

            int p100 = amount / 100; //getting the php100 bills
            amount %= 100;

            int p50 = amount / 50; //getting the php50 bills
            amount %= 50;

            int p20 = amount / 20; //getting the php20 bills
            amount %= 20;


            //condition to check if the amount is not zero
            if (amount != 0){
                System.out.println("Withdrawal cannot be processed. ERROR!");
        }

            else{

                //displaying the number of bills for each
                System.out.println("P1000: " + thousand);
                System.out.println("P500: " + p500);
                System.out.println("P200: " + p200);
                System.out.println("P100: " + p100);
                System.out.println("P50: " + p50);
                System.out.println("P20: " + p20);


                //summing up the number of bills
                int bills = thousand + p500 + p200 + p100 + p50 + p20;

                //displaying the remmaining amount and the sum number of bills
                System.out.println("\nRemaining amount: " + amount);
                System.out.println("Total bills: " + bills);

        }

        }

        input.close();
    }
}
