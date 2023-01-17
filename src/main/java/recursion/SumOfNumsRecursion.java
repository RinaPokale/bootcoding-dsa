package recursion;

public class SumOfNumsRecursion {
    public static void main(String[] args) {
        System.out.println(sumOfNums(10));
    }

    private static int sumOfNums(int n){
        if(n == 0)
            return 0;

        return n + sumOfNums(n-1);
    }
}

