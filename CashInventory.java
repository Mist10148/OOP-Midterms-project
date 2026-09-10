import java.util.Scanner;

public class CashInventory {
    public static void main(String[] args){
      Scanner console = new Scanner(System.in);
      int amount; 
      int subtractingVariable;
      int totalcash;

     

      //ATM Bills Declarations
      int thousand = 10;
      int fiveHundred = 10;
      int oneHundred = 10;
      int fifty = 20;
      int twenty = 20;

      //Console Prints
      System.out.println("Input the amount you want to withdraw:");
      amount = console.nextInt();

      //Conditionals for the ATM Bills
      if(amount >= 1000 && thousand > 0){
        subtractingVariable = amount / 1000;
            thousand = thousand - subtractingVariable;
                totalcash = amount - (subtractingVariable * 1000);

                if(totalcash < 1000 && totalcash >= 500 && fiveHundred > 0){
                    subtractingVariable = amount / 500;
                        fiveHundred = 
                }
            

      }

      //System.out.println("remaining thousand is: " + thousand);


    }
}
