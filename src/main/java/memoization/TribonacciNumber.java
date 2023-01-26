package memoization;

import java.util.HashMap;

public class TribonacciNumber {

    static HashMap<Integer, Integer> store = new HashMap<>();

    public static void main(String[] args) {
        int n = 32;
        System.out.println(tribonacciNumber(n));
    }

    private static int tribonacciNumber(int n){
        if(n == 0)
            return 0;

        if(n < 3)
            return 1;

        if(store.containsKey(n))
            store.get(n);

        store.put(n, tribonacciNumber(n-3) + tribonacciNumber(n-2) + tribonacciNumber(n-1));
        return store.get(n);
    }

}
