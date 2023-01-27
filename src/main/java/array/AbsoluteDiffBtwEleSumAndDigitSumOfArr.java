package array;

//2535. Difference Between Element Sum and Digit Sum of an Array
public class AbsoluteDiffBtwEleSumAndDigitSumOfArr {
    public static int differenceOfSum(int[] nums) {
        int eleSum = 0, digitSum = 0;

        for (int n: nums) { // for(int i = 0; i < nums.length; i++)
            eleSum += n;
            while (n!=0){
                digitSum+=n%10;
                n/=10;
            }
        }
        return Math.abs(eleSum - digitSum);

    }

    public static void main(String[] args) {
        int[] nums = {1,15,6,3};
//        int[] nums = {1,2,3,4};
        System.out.println(differenceOfSum(nums));
    }



}
