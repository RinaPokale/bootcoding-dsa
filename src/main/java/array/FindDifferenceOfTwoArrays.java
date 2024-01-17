package array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

//2215. Find the Difference of Two Arrays
public class FindDifferenceOfTwoArrays {
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        List<List<Integer>> ans = new ArrayList<>();

        List<Integer> list1 = new ArrayList<>(); // ans[0]
        List<Integer> list2 = new ArrayList<>(); // ans[1]
        ans.add(list1);
        ans.add(list2);

        //adding num2 ele in hashset
        for(int i = 0; i < nums2.length; i++){
            set.add(nums2[i]);
        }

        //ans[0] i.e list1 :- add all distinct ele of num1 which are not present in num2
        for(int i = 0; i < nums1.length; i++){
            if(!set.contains(nums1[i]) && !list1.contains(nums1[i])) // in this case 'set' contains all ele of num2
                list1.add(nums1[i]);
        }

        set.clear();

        //adding num1 ele in hashset
        for(int i = 0; i < nums1.length; i++){
            set.add(nums1[i]);
        }

        //ans[1] i.e list2 :- add all distinct ele of num2 which are not present in num1
        for (int i = 0; i < nums2.length; i++){
            if(!set.contains(nums2[i]) && !list2.contains(nums2[i])) // in this case 'set' contains all ele of num1
                list2.add(nums2[i]);
        }

        return ans;
    }

    public static void main(String[] args) {
//        int[] num1 = {1, 2, 3};
//        int[] num2 = {2, 4, 6};

        int[] num1 = {1,2,3,3};
        int[] num2 = {1,1,2,2};
        List<List<Integer>> ans = findDifference(num1, num2);
        System.out.println(ans);
    }

}
