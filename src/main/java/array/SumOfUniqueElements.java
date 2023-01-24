package array;

import java.util.Arrays;

public class SumOfUniqueElements {
    public static void main(String[] args) {
        int[] nums = {1,2,4, 3,10};
//        int[] nums = {1,1,1,1};
        System.out.println(sumOfUniqueElements(nums));

    }

    private static int sumOfUniqueElements(int[] nums){
        Arrays.sort(nums);
        int len = nums.length;
        // for adding frequencies (count) of elements in array -->
        // Ex., if ele is (1) then add count of (1) at 0th index in "frequency" array
        int[] frequency = new int[nums[len-1]];
        int sum = 0;


//        int prev = nums[0];
        int i = 0;
        while (i < len) {
            int j = i+1;
            while (j < len && nums[i] == nums[j]){
                frequency[nums[i]-1] = frequency[nums[i]-1] + 1;
                j++;
            }
            i = j;
//            prev = nums[i];
        }

        for (int k = 0; k < len; k++){
            if(frequency[nums[k]-1] < 1)
                sum+=nums[k];
        }
        return sum;

    }
}
/*
  int sum = 0;
        int len = nums.length;
        for(int i = 0; i < len-1; i++){
            int count = 0;
            for(int j = i+1; j < len; j++){
                if(nums[i] == nums[j]) {
                    count++;
                }
            }

            if(count == 0)
                sum+=nums[i];
        }
        return sum;
 */

/*
 int prev = nums[0];
        for(int i = 1; i < len; i++) {
            int j = i;
            while (prev == nums[j]){
                frequency[indx] = frequency[indx] + 1;
                j++;
            }
            prev = nums[i];
            indx++;

        }
 */

/*
 int prev = nums[0];
        for(int i = 1; i < len; i++) {
            int j = i;
            while (prev == nums[j]){
                count++;
                j++;
            }
            if(count == 0){
                sum+=prev;
            }

            prev = nums[i];
            indx++;
        }
        return sum;
 */


/*
    int prev = nums[0];
        for(int i = 0; i < len; i++) {
            int j = i+1;
            while (j < len && nums[i] == nums[j]){
                frequency[nums[i]-1] = frequency[nums[i]-1] + 1;
                j++;
            }
//            prev = nums[i];

        }
 */