package recursion;

//WAP to count the digits of a given number using recursion
public class CountDigitsOfNumUsingRecursion {
    public static void main(String[] args) {
        System.out.println(countDigits(555));
    }

    private static int countDigits(int n){
        if(n < 10)
            return 1;

        return 1 + countDigits(n/10);
    }
}
