package array;

//1920. Build Array from Permutation

/*  Given a zero-based permutation nums (0-indexed), build an array ans of the same length
    where, ans[i] = nums[nums[i]] for each 0 <= i < nums.length and return it.*/

public class BuildArrayFromPermutation {
    public static int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];

        for (int i = 0; i < nums.length; i++){
            ans[i] = nums[nums[i]];
        }
        return ans;
    }

    public static void main(String[] args) {
//        int[] nums = {0,2,1,5,3,4};
        int[] nums = {5,0,1,2,3,4};
        int[] ans = buildArray(nums);
        for(int n : ans)
            System.out.print(n + " ");
    }
}
