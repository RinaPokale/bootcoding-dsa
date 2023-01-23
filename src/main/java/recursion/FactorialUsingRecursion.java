package recursion;

import java.util.Scanner;

public class FactorialUsingRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:- ");
        int n = sc.nextInt();
        System.out.println("Factorial of " + n + " is " +factorialOfNum(6));
    }

    private static int factorialOfNum(int n){
        if(n == 0 || n == 1)
            return 1;

        return n * factorialOfNum(n-1);
    }
}
