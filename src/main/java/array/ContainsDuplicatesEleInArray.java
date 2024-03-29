package array;
import java.util.HashMap;

//217. Contains Duplicate

/* Given an integer array nums, return true if any value appears at least twice in the array,
 and return false if every element is distinct. */

public class ContainsDuplicatesEleInArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        System.out.println(containsDuplicate(nums));
    }

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

}
