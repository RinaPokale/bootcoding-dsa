package array;

//1979. Find Greatest Common Divisor of Array

/* Given an integer array nums, return the greatest common divisor of the smallest number and largest number in nums.
The greatest common divisor of two numbers is the largest positive integer that evenly divides both numbers. */

public class GCDOfArray {
    public static void main(String[] args) {
        int[] nums = {10,6, 9};
        System.out.println(findGCD(nums));
    }

    public static int findGCD(int[] nums) {
        int min = nums[0];
        int max = nums[0];

        for(int i = 1; i < nums.length; i++){
            if(nums[i] > max)
                max = nums[i];
            else if(nums[i] < min)
                min = nums[i];
        }
//        return gcdOne(min, max);
        return gcdTwo(min, max);

    }

    private static int gcdOne(int min, int max){
        int gcd = 1;
        for(int i = 2; i <= min; i++){
            if(min % i == 0 && max % i == 0)
                gcd = i;
        }
        return gcd;
    }

    private static int gcdTwo(int min, int max){
        if(min == 0)
            return max;

        return gcdTwo(max % min, min);
    }
}
