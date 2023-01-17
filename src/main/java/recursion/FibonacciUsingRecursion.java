package recursion;

/*
The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence,
such that each number is the sum of the two preceding ones, starting from 0 and 1. That is,
F(0) = 0, F(1) = 1
F(n) = F(n - 1) + F(n - 2), for n > 1.
 */

public class FibonacciUsingRecursion {
    public static void main(String[] args) {
        System.out.println(fib(5));
    }

    public static int fib(int n) {
        if(n == 0)
            return 0;

        if (n == 1)
            return 1;

        return  fib(n-1) + fib(n-2);
    }
}
