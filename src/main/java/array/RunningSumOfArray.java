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

    public static int[] runningSumTwo(int[] nums){
        int[] sumOfNums = new int[nums.length];
       sumOfNums[0] = nums[0];

        for(int i = 1; i < nums.length; i++){
            sumOfNums[i] = nums[i] + sumOfNums[i-1];
        }
        return sumOfNums;
    }

    public static void main(String[] args) {
//        int[] nums = {1, 2, 3, 4, 5};
        int[] nums = {3,1,2,10,1};
        int[] sumOfNums = runningSum(nums);
        int[] sumOfNums2 = runningSumTwo(nums);


        for (int i = 0; i < sumOfNums.length; i++){
            System.out.println(sumOfNums[i]);
        }

        for (int i = 0; i < sumOfNums2.length; i++){
            System.out.println(sumOfNums2[i]);
        }
    }

}
