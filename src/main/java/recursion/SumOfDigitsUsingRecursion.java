package recursion;

import java.util.Scanner;

public class SumOfDigitsUsingRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:- ");
        int n = sc.nextInt();
        System.out.println("Sum of digits of a number (" + n + ") is " +findSumOfDigits(n));
    }

    private static int findSumOfDigits(int n){
        if(n < 10)
            return n;

        return n%10 + findSumOfDigits(n/10);
    }
}
