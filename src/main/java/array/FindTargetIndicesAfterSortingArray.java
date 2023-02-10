package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Find Target Indices After Sorting Array
public class FindTargetIndicesAfterSortingArray {
    static List<Integer> list = new ArrayList<Integer>();

    //optimized solution --- > O(n)
    public static List<Integer> targetIndices(int[] nums, int target) {
        int count = 0, lessthan = 0;
        for (int n : nums) {
            if (n == target)
                count++; // count ---> target element
            if (n < target)
                lessthan++; // count --> less than target element -->
            // at the end it will hold the correct "indx" of target element
        }

        for (int i = 0; i < count; i++) {
            list.add(lessthan++);
        }
        return list;
    }

    public static void findTargetIndices(int[] num, int target){
        int len = num.length;
        Arrays.sort(num);

        for(int i = 0; i < len; i++){
            if(target == num[i])
                list.add(i);
        }

        for(Integer n : list)
            System.out.println(n);
    }


    public static void main(String[] args) {
        int[] num = {1, 2, 5, 2, 3};
        List<Integer> result = targetIndices(num, 2);

        for(Integer n: result)
            System.out.println(n);
    }

}
