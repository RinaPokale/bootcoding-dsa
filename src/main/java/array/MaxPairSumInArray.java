package array;

//2815. Max Pair Sum in an Array

public class MaxPairSumInArray {
    public static int maxSum(int[] nums) { //TC:- nlogn & Sc:- O(1)
        int arr[] = new int[10]; // 0-9
        int ans = -1;
        int len = nums.length;

        for(int i = 0; i < len; i++){ // Tc:- O(n)
            int temp = nums[i];
            int maxDigit = 0;

            while (temp != 0){ //Tc:- log n
                maxDigit = Math.max(maxDigit, temp % 10);
                temp /= 10;
            }

            //if pair exist then add it & update answer
            if(arr[maxDigit] != 0){
                ans = Math.max(ans, (arr[maxDigit]+nums[i]));
            }
//            else {
//                arr[maxDigit] = nums[i]; //when max_num encountered 1st time
//            }

            //it'll do both
            //1. insert max_num on max_digit(index) if encountered 1st time
            //2. if current ele is max than existing num
            if(nums[i] > arr[maxDigit]){
                arr[maxDigit] = nums[i];
            }

        }
        return ans;

    }

    public static void main(String[] args) {
        int[] num = {51,71,17,24,42};
//        int[] num = {1, 2, 3, 4};
        int ans = maxSum(num);
        System.out.println(ans);
    }
}
