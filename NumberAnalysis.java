import java.util.Scanner;
public class NumberAnalysis {
    public static void main(String[] args){

        //making an object scanner for input
        Scanner input = new Scanner(System.in);

        //welcome message and getting input from the user
        System.out.print("Enter a starting number:");
        int start = input.nextInt();

        System.out.print("Enter an ending number: ");
        int end = input.nextInt();

        //main variable declaration
        int primeCount = 0, compositeCount = 0, evenCount = 0, oddCount = 0, divisorCount = 0;

        for(int i = start; i <= end; i++){

            //condition in counting the odd and even numbers
            if(i % 2 == 0){
                evenCount++;
            }

            else{
                oddCount++;
            }
        }
        input.close();
    }
}
