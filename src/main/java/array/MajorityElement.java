package array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//169. Majority Element -> Note:- Optimized solution exist at the end i.e., just above main()
/*
Given an array nums of size n, return the majority element.
The majority element is the element that appears more than ⌊n / 2⌋ times.
You may assume that the majority element always exists in the array.
 */

public class MajorityElement {
    public static int majorityElement(int[] nums) { // TC & SC --> O(n)
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i]) + 1);
                continue;
            }
            map.put(nums[i], 1);
        }

        int max = 0;

        for(Map.Entry<Integer, Integer> n: map.entrySet()){
            if(n.getValue() > max)
                max = n.getValue();
        }

        for(Integer n: map.keySet()){
            if (max == map.get(n)) {
                max = n;
                break;
            }
        }
        return max;

    }

    public static int majorityElementTwo(int[] nums) { //O(N log n)
        Arrays.sort(nums);
        return nums[(int)nums.length / 2];
    }

    //Optimized solution --> //Tc -> O(n) & SC -> O(1)
    public static int majorityElementThree(int[] nums){ //Tc -> O(n) & SC -> O(1)
        int n = nums.length;
        int majority = nums[0];
        int count = 1;

        for(int i = 1; i < n; i++){
            if(majority == nums[i])
                count+=1;
            else
                count-=1;
            if(count == 0) {
                majority = nums[i];
                count = 1;
            }
        }

        //ensure majority is the actual majority ele or not
        count = 0;
        for(int i = 0; i < n; i++){
            if(nums[i] == majority)
                count++;
        }

        if(count > (int)n/2)
            return majority;

        return majority;
    }
    public static void main(String[] args) {
//        int[] num = {3, 2, 3};
        int[] num = {2,2,1,1,1,2,2};
//        int[] num = {-1,1,1,1,2,1};
//        System.out.println(majorityElement(num));
//        System.out.println(majorityElementTwo(num));
        System.out.println(majorityElementThree(num));

    }
}
