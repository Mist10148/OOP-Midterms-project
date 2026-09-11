import java.util.Scanner;
public class NumberAnalysis {
    public static void main(String[] args){

        //making an object scanner for input
        Scanner input = new Scanner(System.in);


        System.out.print("Enter a starting number:");
        int start = input.nextInt();

        System.out.print("Enter an ending number: ");
        int end = input.nextInt();


        input.close();
    }
}
