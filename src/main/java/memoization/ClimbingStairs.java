package memoization;

import java.util.HashMap;

public class ClimbingStairs {
    static HashMap<Integer, Integer> store = new HashMap<>();

    public static int climbStairs(int n) {
        if(n == 1 || n == 2)
            return n;

        if(store.containsKey(n))
            return store.get(n);

        store.put(n, climbStairs(n-1) + climbStairs(n-2));
        return store.get(n);
    }

    public static void main(String[] args) {
        System.out.println(climbStairs(5));
    }
}


