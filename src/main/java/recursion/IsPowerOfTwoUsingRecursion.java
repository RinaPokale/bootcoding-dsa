package recursion;

public class IsPowerOfTwoUsingRecursion {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(32));
    }

    public static boolean isPowerOfTwo(int n) {
        if(n == 1)
            return true;
        if(n == 0 || n%2 == 1)
            return false;

        return isPowerOfTwo(n/2);
//        return true;
    }


}
