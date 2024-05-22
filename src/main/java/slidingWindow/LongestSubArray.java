package slidingWindow;

// Longest SubArray with sum <= k,  return maximum length of subArray
public class LongestSubArray {

    //Brute Force Approach --> trying all possible subArray
    public static int maxLengthOfSubArrayOne(int[] nums, int k){ // TC:- O(n^2), Sc:- O(1)
        int sum , maxLen = 0;
        int n = nums.length;

        for(int i = 0; i < n; i++){
            sum = 0;
            for(int j = i; j < n; j++){
                sum += nums[j];

                if(sum > k)
                    break;

                if(sum <= k)
                    maxLen = Math.max(maxLen, j-i+1);

            }
        }
        return maxLen;
    }

    //Better Approach
    /*
        Expand --> r
        Shrink --> l
     */
    public static int maxLengthOfSubArrayTwo(int[] nums, int k){ // TC:- O(n*n), Sc:- O(1)
        int l = 0,  r = 0, sum = 0, maxLen = 0;
        int n = nums.length;

        while (r < n){
            sum += nums[r];

            //Shrink
            while (sum > k){
                sum -= nums[l];
                l++;
            }

            if(sum <= k)
                maxLen = Math.max(maxLen, r - l+1);
            r++; //Expand
        }
        return maxLen;
    }


    //optimized Approach
 /*Note:- Since we've to find maxLength only...that's why we're shrinking by 1...and if we had to return
    SubArray we would have gone with the 2nd Approach */
    public static int maxLengthOfSubArrayThree(int[] nums, int k){ // TC:- O(n), Sc:- O(1)
        int l = 0,  r = 0, sum = 0, maxLen = 0;
        int n = nums.length;

        while (r < n){
            sum += nums[r];

            //Shrink by 1
            if (sum > k){
                sum -= nums[l];
                l++;
            }

            if(sum <= k)
                maxLen = Math.max(maxLen, r - l+1);
            r++; //Expand
        }
        return maxLen;
    }

    public static void main(String[] args) {
        int[] nums = {2, 5, 1, 10, 10};
//        int[] nums = {2, 5, 1, 7, 10};

        int k = 14;

        System.out.println(maxLengthOfSubArrayOne(nums, k));
        System.out.println(maxLengthOfSubArrayTwo(nums, k));
        System.out.println(maxLengthOfSubArrayThree(nums, k));

    }
}
