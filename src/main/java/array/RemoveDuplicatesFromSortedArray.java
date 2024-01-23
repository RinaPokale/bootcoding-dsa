package array;

//26. Remove Duplicates from Sorted Array

public class RemoveDuplicatesFromSortedArray {
    public static int removeDuplicates(int[] nums) { // O(n)
        int k = 0, i = 1;
        int n = nums.length;

        while(i < n){
            while (i != n && nums[k] == nums[i] ){
                i++;//unique ele index
            }
            if(i == n)
                break;
            else {
                nums[k+1] = nums[i];
                k++;
            }
        }
        return k+1; // k is holding index, but we've to return the size of unique ele
        // i.e if k = 3 then size of unique ele would be 4 (since array follows 0-based-indexing)
        // that's why returning ''k+1''
    }


    public static int removeDuplicatesTwo(int[] nums) { //O(n)
        int l = 1;
        for(int r = 1; r < nums.length; r++){
            if(nums[r]!=nums[r-1]) {
                nums[l] = nums[r];// at this point 'r' hold unique ele
                l++;
            }
        }
        return l;
    }

    public static void main(String[] args) {
//        int nums[] = {1, 1, 2};
        int nums[] = {0,0,1,1,1,2,2,3,3,4};
//        int[] nums = {1, 2};
//        System.out.println(removeDuplicates(nums));
        System.out.println(removeDuplicatesTwo(nums));

    }
}
