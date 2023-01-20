package array;

public class RunningSumOfArray {
    public static int[] runningSum(int[] nums){
        int[] sumOfNums = new int[nums.length];
        int sum = 0;

        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            sumOfNums[i] = sum;
        }
        return sumOfNums;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int[] sumOfNums = runningSum(nums);

        for (int i = 0; i < sumOfNums.length; i++){
            System.out.println(sumOfNums[i]);
        }
    }

}
