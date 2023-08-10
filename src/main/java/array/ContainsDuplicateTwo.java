package array;

//219. Contains Duplicate II

/*
Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the array
such that nums[i] == nums[j] and abs(i - j) <= k.
 */

import java.util.HashMap;

public class ContainsDuplicateTwo {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        // We will use a HashMap to keep track of the last seen index of the integer.
        //key = num[i] and value = index of num[i]
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;

        // If k is 0, then i and j cannot be distinct.
        if(k == 0)
            return false;
        for(int i = 0; i < n; i++){
            // If contains key and i - j <= k, return true.
            if (map.containsKey(nums[i]) && i-map.get(nums[i]) <= k)
                return true;
            // Either put a new <Integer, Index> pair, or update index of existing integer in the HashMap.
            map.put(nums[i],i); // if key already exist in map then value will be overlap with new val
        }
        return false;
    }

    public static void main(String[] args) {
//        int[] num = {1, 0, 1, 1};
//        int k = 1;

        int[] num = {1,2,3,1,2,3};
        int k = 2;

//        int[] num = {1,2,3,1};
//        int k = 3;

        boolean ans = containsNearbyDuplicate(num, k);
        System.out.println(ans);
    }
}
