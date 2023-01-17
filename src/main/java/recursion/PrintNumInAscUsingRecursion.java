package recursion;

public class PrintNumInAscUsingRecursion {
    public static void main(String[] args) {
        printNumAsc(5);
    }

    private static void printNumAsc(int n){ // ascending order
        if(n == 0) // base or termination condition
            return;

        printNumAsc(n-1);
        System.out.println(n);
    }
}
