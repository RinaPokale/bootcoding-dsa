package hashtable;

import java.util.HashMap;

//1. Two Sum
//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up
// to target.
public class TwoSum {
    static HashMap<Integer,Integer> store = new HashMap<>();
    public static int[] twoSum(int[] nums, int target) {
        int len = nums.length;
        int[] ans = new int[2];

        for(int i=0;i<len;i++){
            if(store.containsKey(target-nums[i])){
                ans[1]=i;
                ans[0]=store.get(target-nums[i]);
                return ans;
            }
            store.put(nums[i],i);
        }
        return ans;
    }

    public static void main(String[] args) {
//      int[] num = {3, 2, 4};
        int[] num = {2, 7, 11, 15};
        int target = 9;
        int[] sum = twoSum(num, target);

        for(int n: sum){
            System.out.println(n);
        }
    }
}
