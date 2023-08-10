package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

//350. Intersection of Two Arrays II
/*
Given two integer arrays nums1 and nums2, return an array of their intersection.
Each element in the result must appear as many times as it shows in both arrays and
you may return the result in any order.
 */

public class IntersectionOfTwoArraysTwo {

    public static int[] intersection(int[] nums1, int[] nums2) { // sc & Tc = O(n)
        HashMap<Integer, Integer> list = new HashMap <>();
        ArrayList<Integer> ans = new ArrayList<>();

        for(int i = 0; i < nums1.length; i++){ // adding frequency of num1 ele in hashmap
            if(list.containsKey(nums1[i])){
                list.put(nums1[i], list.get(nums1[i])+1);
                continue;
            }
            list.put(nums1[i], 1);
        }

        int ct = 0;
        for(int i = 0; i < nums2.length; i++){ // checking if num2 ele also exist in hashmap (num1)
            if(list.containsKey(nums2[i])){
                ans.add(nums2[i]);
                ct++;
            }
            if(ct == 1){ // element which also exist in num2
                int x = list.get(nums2[i]);
                x--;
                list.remove(nums2[i]);
                if(x > 0)
                    list.put(nums2[i], x);
                ct=0;
            }
        }

        int[] res = new int[ans.size()];
        for(int i = 0; i < ans.size(); i++){
            res[i] = ans.get(i);
        }

        return res;
    }

    public static int[] intersectionTwo(int[] nums1, int[] nums2) { // sc & Tc = O(n)
        HashMap<Integer, Integer> list = new HashMap <>();

        for(int i = 0; i < nums1.length; i++){ // adding frequency of num1 ele in hashmap
            if(list.containsKey(nums1[i])){
                list.put(nums1[i], list.get(nums1[i])+1);
                continue;
            }
            list.put(nums1[i], 1);
        }

        int ct = 0, k = 0;
        for(int i = 0; i < nums2.length; i++){ // checking if num2 ele also exist in hashmap (num1)
            if(list.containsKey(nums2[i])){
                nums1[k++] = nums2[i];
                ct++;
            }
            if(ct == 1){ // element which also exist in num2
                int x = list.get(nums2[i]);
                x--;
                list.remove(nums2[i]);
                if(x > 0)
                    list.put(nums2[i], x);
                ct=0;
            }
        }

        // this method creates copy of ele, within a specified range of original array
        return Arrays.copyOfRange(nums1, 0, k);
    }

    public static void main(String[] args) {
//        int[] num1 = {1,2,2,1, 2};
//        int[] num2 = {2, 2};

        int[] num1 = {4,9,5};
        int[] num2 = {9,4,9,8,4};

        int[] ans = intersectionTwo(num1,num2);
        for (Integer n: ans)
            System.out.print(n + " ");
    }
}

