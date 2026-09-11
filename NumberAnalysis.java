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
        int primeCount = 0, compositeCount = 0, evenCount = 0, oddCount = 0, palindromeCount = 0, armstrongCount = 0, perfectCount = 0, abundantCount = 0, deficientCount = 0, largestPrime = 0, largestPerfect = 0, largestArmstrong = 0;

        //variables used to getting something
        int divisorCount = 0, divisorSum = 0;

        for(int i = start; i <= end; i++){

            //condition in counting the odd and even numbers
            if(i % 2 == 0){
                evenCount++;
            }

            else{
                oddCount++;
            }

            //getting the count for divisor since it is needed for some other stuff
            for(int divisor = 1; divisor <= i; divisor++){
                if(i % divisor == 0){
                    divisorCount++;

                    if(divisor < i){
                        divisorSum += divisor;
                    }
                }
            }

            if(divisorCount == 2){
                primeCount++;

                if(i > largestPrime){
                    largestPrime = i;
                }
            }

            else if(i > 1){
                compositeCount++;
            }

            if (divisorSum == i){
                perfectCount++;

                if(i > largestPerfect) {
                    largestPerfect = i;
                }
            }

            else if(divisorSum > i){
                abundantCount++;
            }

            else{
                deficientCount++;
            }

            int original = i, reversed = 0, temp = i;

            while(temp > 0){
                int digit = temp % 10;
                reversed = reversed * 10 + digit;
                temp /= 10;
            }

            if(original == reversed){
                palindromeCount++;
            }

            int digits = 0;
            temp = i;

            while(temp > 0){
                digits++;
                temp /= 10;
            }

            int sum = 0;
            temp = i;

            if(sum == i){
                armstrongCount++;

                if(i > largestArmstrong){
                    largestArmstrong = i;

                }
            }
        }

        //display of all the output/report
        System.out.println("\nNUMBER ANALYSIS REPORT");
        System.out.println("Range: " + start + " - " + end);
        System.out.println("\nPrime numbers: " + primeCount);
        System.out.println("Composite numbers: " + compositeCount);
        System.out.println("Even numbers: " + evenCount);
        System.out.println("Odd numbers: " + oddCount);
        System.out.println("\nPalindrome numbers: " + palindromeCount);
        System.out.println("Armstrong numbers: " + armstrongCount);
        System.out.println("Perfect numbers: " + perfectCount);
        System.out.println("Abundant numbers: " + abundantCount);
        System.out.println("Deficient numbers: " + deficientCount);
        System.out.println("\nLargest prime: " + largestPrime);
        System.out.println("Largest perfect number: " + largestPerfect);
        System.out.println("Largest armstrong number: " + largestArmstrong);
        
        input.close();
    }
}
