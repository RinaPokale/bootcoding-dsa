package recursion;

public class FactorialUsingRecursion {
    public static void main(String[] args) {
        System.out.println(factorialOfNum(6));
    }

    private static int factorialOfNum(int n){
        if(n == 0 || n == 1)
            return 1;

        return n * factorialOfNum(n-1);
    }
}
