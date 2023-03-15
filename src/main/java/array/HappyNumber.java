package array;

import java.util.HashSet;

//202. Happy Number
public class HappyNumber {
    //Approach-1
    public static boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<Integer>();
        while (set.add(n)){
            n = returnAnswer(0, n);
            if(n == 1)
                return true;
        }
        return false;
    }

    //Approach-2
    public static boolean isHappy2(int n) {
        HashSet<Integer> set = new HashSet<Integer>();
        while (true){
            n = returnAnswer(0, n);
            if(n == 1)
                return true;

            if(set.contains(n))
                return false;
            set.add(n);
        }

    }

    public static int returnAnswer(int ans, int n){ // recursion
        if(n == 0)
            return ans;

        return returnAnswer(ans + (int) Math.pow(n%10, 2), n/10);
    }

    public static int returnAnswer(int n){ // loop
        int rem = 0, ans = 0;
        while (n!=0){
            rem = n%10;
            n /= 10;
            ans += Math.pow(rem, 2);
        }
        return ans;
    }

    public static void main(String[] args) {
//      System.out.println(isHappy(19));
        System.out.println(isHappy(2));
        System.out.println(isHappy2(16));
//      System.out.println(returnAnswer(0, 4));
    }
}
