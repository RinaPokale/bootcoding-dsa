package recursion;

public class PrintEvenUsingRecursion {
    public static void main(String[] args) {
        printEven(5);
    }

    private static void printEven(int n){
        if(n == 0)
            return;

        printEven(n-1);

        if(n % 2 == 0)
            System.out.println(n + " is Even number");

    }
}

