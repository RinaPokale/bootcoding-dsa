package array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;

//349. Intersection of Two Arrays
/*
Given two integer arrays nums1 and nums2, return an array of their intersection.
Each element in the result must be unique and you may return the result in any order.
 */

public class IntersectionOfTwoArrays {
    public static int[] intersection(int[] nums1, int[] nums2) { // TC & SC - O(n)
        HashSet<Integer> map = new HashSet<>();

        for(int i = 0; i < nums1.length; i++){
            map.add(nums1[i]);
        }

        int k = 0;
        for(int i = 0; i < nums2.length; i++){
            if(map.contains(nums2[i])){
                nums1[k++] = nums2[i];
                map.remove(nums2[i]);
            }
        }
        return Arrays.copyOfRange(nums1, 0, k);
    }

    public static void main(String[] args) {
//        int[] num1 = {1,2,2,1, 2};
//        int[] num2 = {2, 2};

        int[] num1 = {4,9,5};
        int[] num2 = {9,4,9,8,4};

        int[] ans = intersection(num1,num2);
        for (Integer n: ans)
            System.out.print(n + " ");
    }
}
