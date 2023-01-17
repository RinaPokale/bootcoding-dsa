package recursion;

public class PrintNumInDscUsingRecursion {
    public static void main(String[] args) {
        printNumDsc(5);
    }

    private static void printNumDsc(int n){ // descending order
        if(n == 0) // base or termination condition
            return;

        System.out.println(n);
        printNumDsc(n-1);
    }
}
