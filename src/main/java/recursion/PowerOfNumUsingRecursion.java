package recursion;

public class PowerOfNumUsingRecursion {
    public static void main(String[] args) {
        System.out.println(powerOfNum(2, 0));
        System.out.println(powerOfNum(2, 2));
        System.out.println(powerOfNum(0, 0));
    }

    private static int powerOfNum(int n, int pow){
        if(pow == 0)
            return 1;

        return n * powerOfNum(n, pow-1);
    }
}
