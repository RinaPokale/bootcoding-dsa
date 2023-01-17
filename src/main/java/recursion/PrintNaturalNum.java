package recursion;

//WAP to print first 50 natural numbers using recursion (1,2,3,4....)
public class PrintNaturalNum {
    public static void main(String[] args) {
        printNaturalNum(50);
    }

    private static void printNaturalNum(int n){
        if(n==0)
            return;

        printNaturalNum(n-1);
        System.out.println(n);
    }
}
