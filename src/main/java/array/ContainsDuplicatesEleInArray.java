package array;

import java.util.HashMap;

public class ContainsDuplicatesEleInArray {
    public static boolean containsDuplicate(int[] nums) {
        HashMap <Integer, Integer> store = new HashMap <>();

        for(int i = 0; i < nums.length; i++) {
            if (store.containsKey(nums[i])){
                return true;
            }
            store.put(nums[i], 1);
        }
        return false;
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        System.out.println(containsDuplicate(nums));
    }
}
