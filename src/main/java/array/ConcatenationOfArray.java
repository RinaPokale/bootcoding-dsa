package array;

//1929. Concatenation of Array

/*
Given an integer array nums of length n, you want to create an array ans of length 2n
where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).
Specifically, ans is the concatenation of two nums arrays.
Return the array ans.
 */

public class ConcatenationOfArray {
    public static int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int l = n;
        int[] ans = new int[2*n];

        for(int i = 0; i < n; i++){
            ans[i] = ans[l++] = nums[i];
        }
        return ans;
    }

    public static void main(String[] args) {
//        int[] num = {1, 2, 1};
        int[] num = {1,3,2,1};
        int[] ans = getConcatenation(num);

        for(int n: ans){
            System.out.print(n + " ");
        }
    }
}
