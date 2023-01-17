package recursion;

public class SumOfDigitsUsingRecursion {
    public static void main(String[] args) {
        System.out.println(findSumOfDigits(12345));
    }

    private static int findSumOfDigits(int n){
        if(n < 10)
            return n;

        return n%10 + findSumOfDigits(n/10);
    }
}
